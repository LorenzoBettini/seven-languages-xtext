package org.xtext.builddsl.validation

import org.eclipse.xtext.validation.Check
import org.xtext.builddsl.build.Task
import static extension org.xtext.builddsl.TaskExtensions.*
import static org.xtext.builddsl.build.BuildPackage$Literals.*
import org.eclipse.xtext.xbase.validation.XbaseJavaValidator
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.xbase.XbasePackage
import org.eclipse.xtext.common.types.TypesPackage
import org.eclipse.xtext.xtype.XtypePackage
import org.xtext.builddsl.build.BuildPackage

class BuildDSLValidator extends XbaseJavaValidator {

	@Check
	def void checkNoRecursiveDependencies(Task task) {
		for (taskRef : task.getDepends())
			if (taskRef == task) {
				error('''The task '«task.name»' cannot depend on itself.''', taskRef, DECLARATION__NAME, -1)
				return;
			}
		task.findDependentTasks [ cycle |
			error('''There is a cyclic dependency that involves tasks «cycle.map[name].join(", ")»''', task, DECLARATION__NAME, -1);
		]
	}
	
	override protected getEPackages() {
	    val result = <EPackage>newArrayList(
		    BuildPackage::eINSTANCE,
		    XbasePackage::eINSTANCE,
		    TypesPackage::eINSTANCE,
		    XtypePackage::eINSTANCE)
		return result;
	}

}