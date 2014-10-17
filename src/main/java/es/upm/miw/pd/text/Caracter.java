package es.upm.miw.pd.text;

public class Caracter extends Componente{

	private Character caracter;
	
	@Override
	public void add(Componente componente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String dibujar(Boolean enMayusuculas) {
		return caracter.toString();
	}

	@Override
	public Boolean isCompuesto() {
		return Boolean.FALSE;
	}

}
