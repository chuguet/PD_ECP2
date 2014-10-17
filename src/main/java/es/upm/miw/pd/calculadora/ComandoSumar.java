package es.upm.miw.pd.calculadora;

import upm.jbb.IO;

public class ComandoSumar implements Comando {

	private Calculadora calculadora;
	
	public ComandoSumar(Calculadora calculadora){
		this.calculadora = calculadora;
	}
	
	@Override
	public String name() {
		return "SUMAR";
	}

	@Override
	public void execute() {
		calculadora.restar(IO.in.readInt("Introduzca el valor a sumar"));
	}

}
