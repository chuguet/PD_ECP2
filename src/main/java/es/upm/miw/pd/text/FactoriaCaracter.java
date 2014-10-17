package es.upm.miw.pd.text;

import java.util.HashMap;
import java.util.Map;


public class FactoriaCaracter {
	
	private Map<Character, Caracter> mapaCaracteres;
	
	private static FactoriaCaracter factoriaCaracter;
	
	private FactoriaCaracter(){
		mapaCaracteres = new HashMap<Character, Caracter>();
		factoriaCaracter = new FactoriaCaracter();
	}
	
	public static FactoriaCaracter getFactoria() {
		if(factoriaCaracter == null){
			factoriaCaracter = new FactoriaCaracter();
		}
		return factoriaCaracter;
	}

	public Caracter get(char c) {
		return mapaCaracteres.get(new Character(c));
	}


}
