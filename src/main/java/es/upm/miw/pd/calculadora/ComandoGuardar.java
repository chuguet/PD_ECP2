package es.upm.miw.pd.calculadora;

import upm.jbb.IO;

public class ComandoGuardar extends ComandoAbstractoMementable {

	public ComandoGuardar(CalculadoraMementable calculadoraMementable) {
		super(calculadoraMementable, "GUARDAR", calculadoraMementable);
	}

	@Override
	public void execute() {
		getCalculadoraMementable().guardar(IO.in.readString("Introduzca el nombre del punto de restauracion"));
	}

}
