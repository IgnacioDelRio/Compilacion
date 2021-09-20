/*
 * generated by Xtext 2.11.0
 */
package edu.upb.lp.isc.ide.contentassist.antlr;

import com.google.inject.Inject;
import edu.upb.lp.isc.ide.contentassist.antlr.internal.InternalLosCheetosParser;
import edu.upb.lp.isc.services.LosCheetosGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class LosCheetosParser extends AbstractContentAssistParser {

	@Inject
	private LosCheetosGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalLosCheetosParser createParser() {
		InternalLosCheetosParser result = new InternalLosCheetosParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getSimpleExpressionAccess().getAlternatives(), "rule__SimpleExpression__Alternatives");
					put(grammarAccess.getNumberExpressionAccess().getAlternatives(), "rule__NumberExpression__Alternatives");
					put(grammarAccess.getBoolExpressionAccess().getAlternatives(), "rule__BoolExpression__Alternatives");
					put(grammarAccess.getBoolConstantAccess().getAlternatives(), "rule__BoolConstant__Alternatives");
					put(grammarAccess.getBoolNumCompExpressionAccess().getCompAlternatives_1_0(), "rule__BoolNumCompExpression__CompAlternatives_1_0");
					put(grammarAccess.getBoolNumCompExpressionAccess().getE1Alternatives_2_0(), "rule__BoolNumCompExpression__E1Alternatives_2_0");
					put(grammarAccess.getBoolNumCompExpressionAccess().getE2Alternatives_3_0(), "rule__BoolNumCompExpression__E2Alternatives_3_0");
					put(grammarAccess.getBoolCompExpressionAccess().getAlternatives_1(), "rule__BoolCompExpression__Alternatives_1");
					put(grammarAccess.getListOpExpressionAccess().getAlternatives(), "rule__ListOpExpression__Alternatives");
					put(grammarAccess.getCarExpressionAccess().getListAlternatives_2_0(), "rule__CarExpression__ListAlternatives_2_0");
					put(grammarAccess.getCdrExpressionAccess().getListAlternatives_2_0(), "rule__CdrExpression__ListAlternatives_2_0");
					put(grammarAccess.getLengthExpressionAccess().getListAlternatives_2_0(), "rule__LengthExpression__ListAlternatives_2_0");
					put(grammarAccess.getEmptyExpressionAccess().getListAlternatives_2_0(), "rule__EmptyExpression__ListAlternatives_2_0");
					put(grammarAccess.getStrOpExpressionAccess().getAlternatives(), "rule__StrOpExpression__Alternatives");
					put(grammarAccess.getStrAppExpressionAccess().getStr1Alternatives_2_0(), "rule__StrAppExpression__Str1Alternatives_2_0");
					put(grammarAccess.getStrAppExpressionAccess().getStr2Alternatives_3_0(), "rule__StrAppExpression__Str2Alternatives_3_0");
					put(grammarAccess.getArithExpressionAccess().getOpAlternatives_1_0(), "rule__ArithExpression__OpAlternatives_1_0");
					put(grammarAccess.getArithExpressionAccess().getArg1Alternatives_2_0(), "rule__ArithExpression__Arg1Alternatives_2_0");
					put(grammarAccess.getArithExpressionAccess().getOargsAlternatives_3_0(), "rule__ArithExpression__OargsAlternatives_3_0");
					put(grammarAccess.getMyRacketProgramAccess().getGroup(), "rule__MyRacketProgram__Group__0");
					put(grammarAccess.getMyRacketProgramAccess().getGroup_0(), "rule__MyRacketProgram__Group_0__0");
					put(grammarAccess.getDefineAccess().getGroup(), "rule__Define__Group__0");
					put(grammarAccess.getDoubleExpressionAccess().getGroup(), "rule__DoubleExpression__Group__0");
					put(grammarAccess.getFracExpressionAccess().getGroup(), "rule__FracExpression__Group__0");
					put(grammarAccess.getCompExpressionAccess().getGroup(), "rule__CompExpression__Group__0");
					put(grammarAccess.getBoolConstantAccess().getGroup_1(), "rule__BoolConstant__Group_1__0");
					put(grammarAccess.getBoolNumCompExpressionAccess().getGroup(), "rule__BoolNumCompExpression__Group__0");
					put(grammarAccess.getBoolCompExpressionAccess().getGroup(), "rule__BoolCompExpression__Group__0");
					put(grammarAccess.getListExpressionAccess().getGroup(), "rule__ListExpression__Group__0");
					put(grammarAccess.getPrintExpressionAccess().getGroup(), "rule__PrintExpression__Group__0");
					put(grammarAccess.getCarExpressionAccess().getGroup(), "rule__CarExpression__Group__0");
					put(grammarAccess.getCdrExpressionAccess().getGroup(), "rule__CdrExpression__Group__0");
					put(grammarAccess.getLengthExpressionAccess().getGroup(), "rule__LengthExpression__Group__0");
					put(grammarAccess.getEmptyExpressionAccess().getGroup(), "rule__EmptyExpression__Group__0");
					put(grammarAccess.getConsExpressionAccess().getGroup(), "rule__ConsExpression__Group__0");
					put(grammarAccess.getStrLenExpressionAccess().getGroup(), "rule__StrLenExpression__Group__0");
					put(grammarAccess.getStrAppExpressionAccess().getGroup(), "rule__StrAppExpression__Group__0");
					put(grammarAccess.getArithExpressionAccess().getGroup(), "rule__ArithExpression__Group__0");
					put(grammarAccess.getIfExpressionAccess().getGroup(), "rule__IfExpression__Group__0");
					put(grammarAccess.getFunctionCallExpressionAccess().getGroup(), "rule__FunctionCallExpression__Group__0");
					put(grammarAccess.getWhileExpressionAccess().getGroup(), "rule__WhileExpression__Group__0");
					put(grammarAccess.getMyRacketProgramAccess().getDefinesAssignment_0_2(), "rule__MyRacketProgram__DefinesAssignment_0_2");
					put(grammarAccess.getMyRacketProgramAccess().getExecutionsAssignment_3(), "rule__MyRacketProgram__ExecutionsAssignment_3");
					put(grammarAccess.getDefineAccess().getNameAssignment_3(), "rule__Define__NameAssignment_3");
					put(grammarAccess.getDefineAccess().getParamsAssignment_4(), "rule__Define__ParamsAssignment_4");
					put(grammarAccess.getDefineAccess().getBodyAssignment_6(), "rule__Define__BodyAssignment_6");
					put(grammarAccess.getIntExpressionAccess().getValueAssignment(), "rule__IntExpression__ValueAssignment");
					put(grammarAccess.getDoubleExpressionAccess().getIntAssignment_3(), "rule__DoubleExpression__IntAssignment_3");
					put(grammarAccess.getDoubleExpressionAccess().getDecAssignment_4(), "rule__DoubleExpression__DecAssignment_4");
					put(grammarAccess.getFracExpressionAccess().getNumAssignment_3(), "rule__FracExpression__NumAssignment_3");
					put(grammarAccess.getFracExpressionAccess().getDecAssignment_4(), "rule__FracExpression__DecAssignment_4");
					put(grammarAccess.getCompExpressionAccess().getRealAssignment_3(), "rule__CompExpression__RealAssignment_3");
					put(grammarAccess.getCompExpressionAccess().getImagAssignment_4(), "rule__CompExpression__ImagAssignment_4");
					put(grammarAccess.getBoolConstantAccess().getValueAssignment_0(), "rule__BoolConstant__ValueAssignment_0");
					put(grammarAccess.getBoolNumCompExpressionAccess().getCompAssignment_1(), "rule__BoolNumCompExpression__CompAssignment_1");
					put(grammarAccess.getBoolNumCompExpressionAccess().getE1Assignment_2(), "rule__BoolNumCompExpression__E1Assignment_2");
					put(grammarAccess.getBoolNumCompExpressionAccess().getE2Assignment_3(), "rule__BoolNumCompExpression__E2Assignment_3");
					put(grammarAccess.getBoolCompExpressionAccess().getE1Assignment_2(), "rule__BoolCompExpression__E1Assignment_2");
					put(grammarAccess.getBoolCompExpressionAccess().getE2Assignment_3(), "rule__BoolCompExpression__E2Assignment_3");
					put(grammarAccess.getStrExpressionAccess().getValueAssignment(), "rule__StrExpression__ValueAssignment");
					put(grammarAccess.getListExpressionAccess().getArgsAssignment_3(), "rule__ListExpression__ArgsAssignment_3");
					put(grammarAccess.getPrintExpressionAccess().getExprAssignment_2(), "rule__PrintExpression__ExprAssignment_2");
					put(grammarAccess.getCarExpressionAccess().getListAssignment_2(), "rule__CarExpression__ListAssignment_2");
					put(grammarAccess.getCdrExpressionAccess().getListAssignment_2(), "rule__CdrExpression__ListAssignment_2");
					put(grammarAccess.getLengthExpressionAccess().getListAssignment_2(), "rule__LengthExpression__ListAssignment_2");
					put(grammarAccess.getEmptyExpressionAccess().getListAssignment_2(), "rule__EmptyExpression__ListAssignment_2");
					put(grammarAccess.getConsExpressionAccess().getExprAssignment_2(), "rule__ConsExpression__ExprAssignment_2");
					put(grammarAccess.getConsExpressionAccess().getListAssignment_3(), "rule__ConsExpression__ListAssignment_3");
					put(grammarAccess.getStrLenExpressionAccess().getStrAssignment_2(), "rule__StrLenExpression__StrAssignment_2");
					put(grammarAccess.getStrAppExpressionAccess().getStr1Assignment_2(), "rule__StrAppExpression__Str1Assignment_2");
					put(grammarAccess.getStrAppExpressionAccess().getStr2Assignment_3(), "rule__StrAppExpression__Str2Assignment_3");
					put(grammarAccess.getParamCallExpressionAccess().getParamAssignment(), "rule__ParamCallExpression__ParamAssignment");
					put(grammarAccess.getArithExpressionAccess().getOpAssignment_1(), "rule__ArithExpression__OpAssignment_1");
					put(grammarAccess.getArithExpressionAccess().getArg1Assignment_2(), "rule__ArithExpression__Arg1Assignment_2");
					put(grammarAccess.getArithExpressionAccess().getOargsAssignment_3(), "rule__ArithExpression__OargsAssignment_3");
					put(grammarAccess.getIfExpressionAccess().getCondAssignment_2(), "rule__IfExpression__CondAssignment_2");
					put(grammarAccess.getIfExpressionAccess().getThenAssignment_3(), "rule__IfExpression__ThenAssignment_3");
					put(grammarAccess.getIfExpressionAccess().getElseAssignment_4(), "rule__IfExpression__ElseAssignment_4");
					put(grammarAccess.getFunctionCallExpressionAccess().getFunctionAssignment_1(), "rule__FunctionCallExpression__FunctionAssignment_1");
					put(grammarAccess.getFunctionCallExpressionAccess().getArgsAssignment_2(), "rule__FunctionCallExpression__ArgsAssignment_2");
					put(grammarAccess.getWhileExpressionAccess().getCondAssignment_2(), "rule__WhileExpression__CondAssignment_2");
					put(grammarAccess.getWhileExpressionAccess().getDoAssignment_3(), "rule__WhileExpression__DoAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LosCheetosGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LosCheetosGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
