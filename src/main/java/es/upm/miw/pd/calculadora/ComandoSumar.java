package es.upm.miw.pd.calculadora;

import upm.jbb.IO;

public class ComandoSumar extends ComandoAbstracto {
	
	public ComandoSumar(CalculadoraMementable calculadora) {
		super(calculadora, "SUMAR");
	}

	@Override
	public void execute() {
		getCalculadora().sumar(IO.in.readInt("Introduzca el valor a sumar"));
	}

}
