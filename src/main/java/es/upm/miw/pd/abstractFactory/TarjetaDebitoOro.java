package es.upm.miw.pd.abstractFactory;

import upm.jbb.IO;

public class TarjetaDebitoOro extends AbstractTarjetaDebito {
	
	@Override
	public void view() {
		IO.out.println("5€");
	}
	
}
