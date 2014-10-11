package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberESCreator extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNaturalNumber(int number) {
		return new NaturalNumberES(number);
	}

}
