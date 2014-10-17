package es.upm.miw.pd.calculadora;

import java.util.HashMap;
import java.util.Map;

public class CalculadoraMementable<T> {

	private Map<String, T> puntosRestauracion;
	
	public CalculadoraMementable(){
		this.puntosRestauracion = new HashMap<String, T>();
	}
	
	public void addMemento(String key, T memento){
		puntosRestauracion.put(key, memento);
	}
	
	public String[] claves(){
		return puntosRestauracion.keySet().toArray(new String[0]);
	}
	
	public T getMemento(String key){
		return puntosRestauracion.get(key);
	}
}
