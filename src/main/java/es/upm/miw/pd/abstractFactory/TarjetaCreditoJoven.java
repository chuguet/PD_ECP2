package es.upm.miw.pd.abstractFactory;

import upm.jbb.IO;

public class TarjetaCreditoJoven extends AbstractTarjetaCredito {
	
	@Override
	public void view() {
		IO.out.println("No");
	}
	
}
