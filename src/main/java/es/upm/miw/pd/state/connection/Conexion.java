package es.upm.miw.pd.state.connection;

public class Conexion {

	private HandlerEstado handlerEstado;

	private Link link;

	public Conexion(Link link) {
		assert link != null;
		this.link = link;
	}
	
	public Estado getEstado(){
		return handlerEstado.getEstado();
	}

	public Link getLink() {
		return link;
	}

	public void abrir() {
		try {
			handlerEstado.abrir();
		} catch (UnsupportedOperationException e) {
			
		}
	}

	public void cerrar() {
		try {
			handlerEstado.cerrar();
		} catch (UnsupportedOperationException e) {
		}
	}

	public void parar() {
		try {
			handlerEstado.parar();
		} catch (UnsupportedOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void iniciar() {
		try {
			handlerEstado.iniciar();
		} catch (UnsupportedOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enviar(String msg) {
		try {
			handlerEstado.enviar(msg);
		} catch (UnsupportedOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void recibir(int respuesta) {
		try {
			handlerEstado.recibir(respuesta);
		} catch (UnsupportedOperationException e) {
			throw new UnsupportedOperationException(e.getMessage());
		}
	}

}
