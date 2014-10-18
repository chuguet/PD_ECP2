package es.upm.miw.pd.abstractFactory;

import upm.jbb.IO;

public class TarjetaCreditoOro extends AbstractTarjetaCredito {
	
	@Override
	public void view() {
		IO.out.println("20€ Max. 4000€");
	}
	
}
