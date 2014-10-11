package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEN extends NaturalNumber {

	private static final String[] textValue = { "zero", "one", "two", "three",
			"four", "five" };

	public NaturalNumberEN(int value) {
		super(value);
	}

	@Override
	public String getTextValue() {
		if (this.getValue() < textValue.length) {
			return NaturalNumberEN.textValue[this.getValue()];
		} else {
			return "???";
		}
	}
}
