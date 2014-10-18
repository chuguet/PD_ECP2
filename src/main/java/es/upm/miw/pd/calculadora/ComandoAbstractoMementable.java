package es.upm.miw.pd.calculadora;

public abstract class ComandoAbstractoMementable extends ComandoAbstracto {

	private CalculadoraMementable calculadoraMementable;

	public ComandoAbstractoMementable(Calculadora calculadora, String name,
			CalculadoraMementable calculadoraMementable) {
		super(calculadora, name);
		this.calculadoraMementable = calculadoraMementable;
	}

	public CalculadoraMementable getCalculadoraMementable() {
		return calculadoraMementable;
	}

	public void setCalculadoraMementable(
			CalculadoraMementable calculadoraMementable) {
		this.calculadoraMementable = calculadoraMementable;
	}

}
