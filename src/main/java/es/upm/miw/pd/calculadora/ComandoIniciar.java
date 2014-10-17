package es.upm.miw.pd.calculadora;

public class ComandoIniciar extends ComandoAbstracto {

	public ComandoIniciar(Calculadora calculadora) {
		super(calculadora, "INCIAR");
	}

	@Override
	public void execute() {
		calculadora.iniciar();
	}

}
