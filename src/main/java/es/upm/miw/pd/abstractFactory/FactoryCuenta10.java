package es.upm.miw.pd.abstractFactory;

public class FactoryCuenta10 extends AbstractFactory{

	@Override
	public AbstractCuenta createFactoryCuenta() {
		return new Cuenta10();
	}

	@Override
	public AbstractTarjetaDebito createFactoryTarjetaDebito() {
		return new TarjetaDebito10();
	}

	@Override
	public AbstractTarjetaCredito createFactoryTarjetaCredito() {
		return new TarjetaCredito10();
	}
	
}
