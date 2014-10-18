package es.upm.miw.pd.calculadora;

public abstract class ComandoAbstracto implements Comando {
	
	protected CalculadoraMementable calculadora;

	protected String name;
	
	public ComandoAbstracto(CalculadoraMementable calculadora, String name) {
		this.calculadora = calculadora;
		this.name = name;
	}
	
	@Override
	public String name() {
		return name;
	}
}
