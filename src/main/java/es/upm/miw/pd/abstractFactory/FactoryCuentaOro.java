package es.upm.miw.pd.abstractFactory;

public class FactoryCuentaOro extends AbstractFactory{

	@Override
	public AbstractCuenta createFactoryCuenta() {
		return new CuentaOro();
	}

	@Override
	public AbstractTarjetaDebito createFactoryTarjetaDebito() {
		return new TarjetaDebitoOro();
	}

	@Override
	public AbstractTarjetaCredito createFactoryTarjetaCredito() {
		return new TarjetaCreditoOro();
	}
	
}
