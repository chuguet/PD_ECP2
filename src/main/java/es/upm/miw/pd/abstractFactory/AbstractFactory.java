package es.upm.miw.pd.abstractFactory;

public abstract class AbstractFactory {

	public abstract AbstractCuenta createFactoryCuenta();
	
	public abstract AbstractTarjetaDebito createFactoryTarjetaDebito();
	
	public abstract AbstractTarjetaCredito createFactoryTarjetaCredito();
	
}
