package es.upm.miw.pd.composite.expression;

public class Sumar extends Operacion {

	public Sumar(Expresion expresion1, Expresion expresion2) {
		super(expresion1, expresion2);
	}

	@Override
	public int operar() {
		return this.expresion1.operar() + this.expresion2.operar();
	}

	@Override
	protected String getOperator() {
		return "+";
	}

}
