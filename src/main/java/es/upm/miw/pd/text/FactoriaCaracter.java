package es.upm.miw.pd.text;

import java.util.HashMap;
import java.util.Map;


public class FactoriaCaracter {
	
	private Map<Character, Caracter> mapaCaracteres;
	
	private static FactoriaCaracter factoriaCaracter;
	
	private FactoriaCaracter(){
		mapaCaracteres = new HashMap<Character, Caracter>();
	}
	
	public static FactoriaCaracter getFactoria() {
		if(factoriaCaracter == null){
			factoriaCaracter = new FactoriaCaracter();
		}
		return factoriaCaracter;
	}

	public Caracter get(char c) {
		Caracter caracter = mapaCaracteres.get(new Character(c));
		if(caracter == null){
			caracter = new Caracter(Character.valueOf(c));
			mapaCaracteres.put(Character.valueOf(c), caracter);
		} 
		return caracter;
	}


}
