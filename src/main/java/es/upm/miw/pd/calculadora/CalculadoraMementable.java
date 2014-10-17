package es.upm.miw.pd.calculadora;

import upm.jbb.IO;

public class CalculadoraMementable extends Calculadora {

    private GestorMementable<MementoCalculadora> calculadoraMementable;
	
    public CalculadoraMementable(){
    	super();
    	calculadoraMementable = new GestorMementable<MementoCalculadora>();
    }
    
	public void guardar(String key){
    	calculadoraMementable.addMemento(key, new MementoCalculadora(this.getTotal()));
    }

	public void deshacer() {
		String key = (String) IO.in.select(calculadoraMementable.claves());
    	this.setTotal(calculadoraMementable.getMemento(key).getValor());
	}
}
