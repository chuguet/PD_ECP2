package es.upm.miw.pd.calculadora;

import upm.jbb.IO;


public class MainCalculadora {
    private GestorComandos gestor;

    public MainCalculadora() {
        Calculadora calc = new Calculadora();
        CalculadoraMementable calcMem = new CalculadoraMementable();
        this.gestor = new GestorComandos();
        this.gestor.add(new ComandoSumar(calc));
        this.gestor.add(new ComandoRestar(calc));
        this.gestor.add(new ComandoIniciar(calc));
        this.gestor.add(new ComandoImprimir(calc));
        this.gestor.add(new ComandoDeshacer(calcMem));
        this.gestor.add(new ComandoGuardar(calcMem));
    }

    public void ejecutar() {
        String key = (String) IO.in.select(this.gestor.keys());
        this.gestor.execute(key);
    }

    public static void main(String[] args) {
        IO.in.addController(new MainCalculadora());
    }
}
