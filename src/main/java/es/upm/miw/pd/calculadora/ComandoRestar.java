package es.upm.miw.pd.calculadora;

import upm.jbb.IO;

public class ComandoRestar implements Comando {

	private Calculadora calculadora;
	
	public ComandoRestar(Calculadora calculadora){
		this.calculadora = calculadora;
	}
	
	@Override
	public String name() {
		return "RESTAR";
	}

	@Override
	public void execute() {
		calculadora.restar(IO.in.readInt("Introduzca el valor a restar"));
	}

}
