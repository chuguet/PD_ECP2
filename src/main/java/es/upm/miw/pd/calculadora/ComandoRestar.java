package es.upm.miw.pd.calculadora;

import upm.jbb.IO;

public class ComandoRestar extends ComandoAbstracto {
	
	public ComandoRestar(CalculadoraMementable calculadora) {
		super(calculadora, "RESTAR");
	}

	@Override
	public void execute() {
		calculadora.restar(IO.in.readInt("Introduzca el valor a restar"));
	}

}
