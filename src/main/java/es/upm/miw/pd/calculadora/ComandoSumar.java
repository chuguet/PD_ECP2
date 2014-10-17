package es.upm.miw.pd.calculadora;

import upm.jbb.IO;

public class ComandoSumar extends ComandoAbstracto {
	
	public ComandoSumar(Calculadora calculadora) {
		super(calculadora, "SUMAR");
	}

	@Override
	public void execute() {
		calculadora.sumar(IO.in.readInt("Introduzca el valor a sumar"));
	}

}
