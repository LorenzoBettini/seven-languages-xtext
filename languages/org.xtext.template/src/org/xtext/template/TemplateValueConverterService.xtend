/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.template

import com.google.common.base.CharMatcher
import com.google.inject.Inject
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.ValueConverterWithValueException
import org.eclipse.xtext.conversion.impl.STRINGValueConverter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService

class TemplateValueConverterService extends XbaseValueConverterService {

	@Inject TextValueConverter textValueConverter
	
	@ValueConverter(rule = "TEXT")
	def IValueConverter<String> TEXT() {
		return textValueConverter;
	}
}

/**
 * removes the surrounding terminals in template text
 */
class TextValueConverter extends STRINGValueConverter {
	
	override protected toEscapedString(String value) {
		'»' + Strings.convertToJavaString(value, false) + '«'
	}		
	
	override protected convertFromString(String literal, INode node) throws ValueConverterWithValueException {
		val startTrimmed = CharMatcher.is('»').trimLeadingFrom(literal)
		return CharMatcher.is('«').trimTrailingFrom(startTrimmed)
	}
	
}
