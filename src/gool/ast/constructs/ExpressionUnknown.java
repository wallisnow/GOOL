package gool.ast.constructs;

import gool.ast.type.IType;
import gool.generator.GoolGeneratorController;

/**
 * This interface accounts for all statements of the intermediate language.
 */
public class ExpressionUnknown extends Expression {

	String textual;

	public String getTextual() {
		return textual;
	}

	public ExpressionUnknown(IType type, String textual) {
		super(type);
		this.textual = textual;
	}

	@Override
	public String callGetCode() {
		return GoolGeneratorController.generator().getCode(this);
	}

}
