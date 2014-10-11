package es.upm.miw.pd.factoryMethod.naturalNumber;

public abstract class NaturalNumber {

	private int value;
	
	public NaturalNumber(int value) {
		this.setValue(value);
	}
	
	public abstract String getTextValue();
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		assert value >= 0;
		this.value = value;
	}

	public void add(int value) {
		this.setValue(this.value + value);
	}
}
