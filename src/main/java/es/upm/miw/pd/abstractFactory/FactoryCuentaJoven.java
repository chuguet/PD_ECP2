package es.upm.miw.pd.abstractFactory;

public class FactoryCuentaJoven extends AbstractFactory{

	@Override
	public AbstractCuenta createFactoryCuenta() {
		return new CuentaJoven();
	}

	@Override
	public AbstractTarjetaDebito createFactoryTarjetaDebito() {
		return new TarjetaDebitoJoven();
	}

	@Override
	public AbstractTarjetaCredito createFactoryTarjetaCredito() {
		return new TarjetaCreditoJoven();
	}

}
