package es.upm.miw.pd.calculadora;

import upm.jbb.IO;

public class Calculadora {
	
    private int total;

    private CalculadoraMementable<MementoCalculadora> calculadoraMementable;
    
    public Calculadora() {
        this.iniciar();
        calculadoraMementable = new CalculadoraMementable<MementoCalculadora>();
    }

    public int getTotal() {
        return total;
    }

    protected void setTotal(int total) {
        this.total = total;
    }

    public void sumar(int valor) {
        this.setTotal(this.total + valor);
    }

    public void restar(int valor) {
        this.setTotal(this.total - valor);
    }

    public void iniciar() {
        this.setTotal(0);
    }
    
    public void guardar(String key){
    	calculadoraMementable.addMemento(key, new MementoCalculadora(this.getTotal()));
    }

	public void deshacer() {
		String key = (String) IO.in.select(calculadoraMementable.claves());
    	this.setTotal(calculadoraMementable.getMemento(key).getValor());
	}

}
