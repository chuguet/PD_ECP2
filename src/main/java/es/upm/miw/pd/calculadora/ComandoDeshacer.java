package es.upm.miw.pd.calculadora;

public class ComandoDeshacer extends ComandoAbstractoMementable {

	public ComandoDeshacer(CalculadoraMementable calculadoraMementable) {
		super(calculadoraMementable, "DESHACER", calculadoraMementable);
	}

	@Override
	public void execute() {
		getCalculadoraMementable().deshacer();
	}

}
