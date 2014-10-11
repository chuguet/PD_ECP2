package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberENCreator extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNaturalNumber(int number) {
		return new NaturalNumberEN(number);
	}

}
