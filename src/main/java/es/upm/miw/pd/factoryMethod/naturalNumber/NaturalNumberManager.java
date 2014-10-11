package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberManager {
	
	private final NaturalNumberCreator naturalNumberCreator;
	
	
	public NaturalNumberManager(NaturalNumberCreator naturalNumberCreator){
		this.naturalNumberCreator = naturalNumberCreator;
	}

	public NaturalNumberCreator getNaturalNumberCreator() {
		return naturalNumberCreator;
	}
	
	public NaturalNumber createNaturalNumber(int value){
		return naturalNumberCreator.createNaturalNumber(value);
	}

}
