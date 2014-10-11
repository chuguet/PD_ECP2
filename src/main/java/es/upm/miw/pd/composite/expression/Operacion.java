package es.upm.miw.pd.composite.expression;

public abstract class Operacion extends Expresion {

	protected Expresion expresion1;
	protected Expresion expresion2;

	public Operacion(Expresion expresion1, Expresion expresion2) {
		this.expresion1 = expresion1;
		this.expresion2 = expresion2;
	}
	
	@Override
	public String toString() {
		return "("+ this.expresion1.toString() + this.getOperator() + this.expresion2.toString() + ")";
	}

	protected abstract String getOperator();

}
