package es.upm.miw.pd.abstractFactory;

import upm.jbb.IO;

public class TarjetaCredito10 extends AbstractTarjetaCredito {
	
	@Override
	public void view() {
		IO.out.println("10€ Max. 2000€");
	}

}
