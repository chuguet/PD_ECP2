package es.upm.miw.pd.text;

public class Texto extends Compuesto {

	@Override
	public void add(Componente componente) {
		if (!componente.isCompuesto()) {
			throw new UnsupportedOperationException(
					"No es un texto o un parrafo y no se puede anadir");
		}
		super.getComponente().add(componente);
	}

	@Override
	public String dibujar(Boolean enMayusculas) {
		String resultado = super.dibujarGenerico(enMayusculas);
		resultado += "---o---";
		return resultado;
	}

}
