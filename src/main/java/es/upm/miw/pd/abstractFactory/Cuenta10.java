package es.upm.miw.pd.abstractFactory;

import upm.jbb.IO;

public class Cuenta10 extends AbstractCuenta {

	@Override
	public void view() {
		IO.out.println("1,5%");
	}

}
