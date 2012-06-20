/*
* generated by Xtext
*/
package org.xtext.template.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.template.services.TemplateGrammarAccess;

public class TemplateParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private TemplateGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.template.parser.antlr.internal.InternalTemplateParser createParser(XtextTokenStream stream) {
		return new org.xtext.template.parser.antlr.internal.InternalTemplateParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "TemplateFile";
	}
	
	public TemplateGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(TemplateGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
