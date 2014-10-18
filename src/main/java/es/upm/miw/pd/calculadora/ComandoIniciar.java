package es.upm.miw.pd.calculadora;

public class ComandoIniciar extends ComandoAbstracto {

	public ComandoIniciar(CalculadoraMementable calculadora) {
		super(calculadora, "INCIAR");
	}

	@Override
	public void execute() {
		getCalculadora().iniciar();
	}

}
