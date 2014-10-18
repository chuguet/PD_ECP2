package es.upm.miw.pd.calculadora;

public abstract class ComandoAbstracto implements Comando {
	
	private Calculadora calculadora;

	protected String name;
	
	public ComandoAbstracto(Calculadora calculadora, String name) {
		this.setCalculadora(calculadora);
		this.name = name;
	}
	
	@Override
	public String name() {
		return name;
	}

	public Calculadora getCalculadora() {
		return calculadora;
	}

	public void setCalculadora(Calculadora calculadora) {
		this.calculadora = calculadora;
	}
}
