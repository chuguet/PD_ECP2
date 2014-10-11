package es.upm.miw.pd.composite.expression;

public class Dividir extends Operacion {

	
	public Dividir(Expresion expresion1, Expresion expresion2) {
		super(expresion1, expresion2);
	}

	@Override
	public int operar() {
		return this.expresion1.operar() / this.expresion2.operar();
	}

	@Override
	protected String getOperator() {
		return "/";
	}

}
