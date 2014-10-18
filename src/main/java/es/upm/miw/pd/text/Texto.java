package es.upm.miw.pd.text;

public class Texto extends Compuesto {

	@Override
	public void add(Componente componente) {
		if (!componente.isCompuesto()) {
			throw new UnsupportedOperationException(
					"No es un caracter y no se puede anadir");
		}
		super.getComponente().add(componente);
	}

	@Override
	public String dibujar(Boolean enMayusuculas) {
		return null;
	}

}
