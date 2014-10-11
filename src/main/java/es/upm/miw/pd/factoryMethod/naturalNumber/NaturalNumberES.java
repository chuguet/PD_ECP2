package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberES extends NaturalNumber {

	private static final String[] textValue = { "cero", "uno", "dos", "tres",
			"cuatro", "cinco" };

	public NaturalNumberES(int value) {
		super(value);
	}

	@Override
	public String getTextValue() {
		if (this.getValue() < textValue.length) {
			return NaturalNumberES.textValue[this.getValue()];
		} else {
			return "???";
		}
	}

}
