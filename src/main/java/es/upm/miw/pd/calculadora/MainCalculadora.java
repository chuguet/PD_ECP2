package es.upm.miw.pd.calculadora;

import upm.jbb.IO;


public class MainCalculadora {
    private GestorComandos gestor;

    public MainCalculadora() {
        CalculadoraMementable calcMem = new CalculadoraMementable();
        this.gestor = new GestorComandos();
        this.gestor.add(new ComandoSumar(calcMem));
        this.gestor.add(new ComandoRestar(calcMem));
        this.gestor.add(new ComandoIniciar(calcMem));
        this.gestor.add(new ComandoImprimir(calcMem));
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
