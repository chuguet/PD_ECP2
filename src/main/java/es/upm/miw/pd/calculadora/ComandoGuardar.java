package es.upm.miw.pd.calculadora;

import upm.jbb.IO;

public class ComandoGuardar extends ComandoAbstracto {

	public ComandoGuardar(CalculadoraMementable calculadoraMementable) {
		super(calculadoraMementable, "GUARDAR");
	}

	@Override
	public void execute() {
		calculadora.guardar(IO.in.readString("Introduzca el nombre del punto de restauracion"));
	}

}
