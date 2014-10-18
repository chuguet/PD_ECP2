package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;

public abstract class Compuesto extends Componente {

	private final List<Componente> componentes = new ArrayList<Componente>();

	public List<Componente> getComponente() {
		return componentes;
	}

	@Override
	public Boolean isCompuesto() {
		return Boolean.TRUE;
	}

	public String dibujarGenerico(Boolean enMayusculas) {
		String resultado = "";
		for (Componente componente : componentes) {
			resultado += componente.dibujar(enMayusculas);
		}
		return resultado;
	}
	
}
