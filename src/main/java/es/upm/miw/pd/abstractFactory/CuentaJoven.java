package es.upm.miw.pd.abstractFactory;

import upm.jbb.IO;

public class CuentaJoven extends AbstractCuenta {

	@Override
	public void view() {
		IO.out.println("1%");
	}

}
