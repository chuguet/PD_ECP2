package es.upm.miw.pd.calculadora;

import upm.jbb.IO;

public class ComandoImprimir extends ComandoAbstracto {

	public ComandoImprimir(CalculadoraMementable calculadora) {
		super(calculadora, "IMPRIMIR");
	}

	@Override
	public void execute() {
		IO.out.println("TOTAL: " + calculadora.getTotal());
	}
	
}
