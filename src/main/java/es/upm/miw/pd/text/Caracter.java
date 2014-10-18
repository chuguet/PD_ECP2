package es.upm.miw.pd.text;

public class Caracter extends Componente{

	private Character caracter;
	
	public Caracter (char c){
		this.caracter = c;
	}
	
	@Override
	public void add(Componente componente) {
	}

	@Override
	public String dibujar(Boolean enMayusuculas) {
		if(enMayusuculas){
			return caracter.toString().toUpperCase();
		} else{
			return caracter.toString();
		}
	}

	@Override
	public Boolean isCompuesto() {
		return Boolean.FALSE;
	}

}
