package es.upm.miw.pd.calculadora;


public class ComandoDeshacer extends ComandoAbstracto{

	public ComandoDeshacer(Calculadora calculadora) {
		super(calculadora, "DESHACER");
	}

	@Override
	public void execute() {
		calculadora.deshacer();
	}

}
