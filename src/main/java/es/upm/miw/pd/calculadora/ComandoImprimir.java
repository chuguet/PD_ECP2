package es.upm.miw.pd.calculadora;

import upm.jbb.IO;

public class ComandoImprimir implements Comando {

	private Calculadora calculadora;
	
	public ComandoImprimir(Calculadora calculadora){
		this.calculadora = calculadora;
	}
	
	@Override
	public String name() {
		return "IMPRIMIR";
	}

	@Override
	public void execute() {
		IO.out.println("TOTAL: " + calculadora.getTotal());
	}
	
}
