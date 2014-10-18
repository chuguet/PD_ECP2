package es.upm.miw.pd.text;

import java.util.List;

public abstract class Compuesto extends Componente {

	private List<Componente> componente;

	public List<Componente> getComponente() {
		return componente;
	}

	public void setComponente(List<Componente> componente) {
		this.componente = componente;
	}

	@Override
	public Boolean isCompuesto() {
		return Boolean.TRUE;
	}
	
}
