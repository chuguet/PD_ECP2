package es.upm.miw.pd.abstractFactory;

import upm.jbb.IO;

public class MainAbstractFactory {
    private AbstractFactory fa;

    private AbstractFactory[] fas = {new FactoryCuenta10(), new FactoryCuentaJoven(), new FactoryCuentaOro()};

    public void tipoFabrica() {
        fa = (AbstractFactory) IO.in.select(fas, "Elige una fabrica");
    }

    public void fabricarProductos() {
        fa.createFactoryCuenta().view();
        fa.createFactoryTarjetaCredito().view();
        fa.createFactoryTarjetaDebito().view();

    }

    public static void main(String[] args) {
        IO.in.addController(new MainAbstractFactory());
    }

}
