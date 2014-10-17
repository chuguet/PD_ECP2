package es.upm.miw.pd.calculadora;

public class ComandoIniciar implements Comando {

	private Calculadora calculadora;
	
	public ComandoIniciar(Calculadora calculadora){
		this.calculadora = calculadora;
	}
	
	@Override
	public String name() {
		return "INICIAR";
	}

	@Override
	public void execute() {
		calculadora.iniciar();
	}

}
