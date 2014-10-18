package es.upm.miw.pd.calculadora;

public class ComandoDeshacer extends ComandoAbstracto {

	public ComandoDeshacer(CalculadoraMementable calculadoraMementable) {
		super(calculadoraMementable, "DESHACER");
	}

	@Override
	public void execute() {
		calculadora.deshacer();
	}

}
