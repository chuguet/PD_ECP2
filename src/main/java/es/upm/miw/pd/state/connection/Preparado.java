package es.upm.miw.pd.state.connection;

public class Preparado extends HandlerEstado {

	public Preparado(Conexion conexion) {
		super(conexion);
	}

	@Override
	public void abrir() throws UnsupportedOperationException {
		// TODO Auto-generated method stub

	}

	@Override
	public void cerrar() throws UnsupportedOperationException {
		// TODO Auto-generated method stub

	}

	@Override
	public void enviar(String msg) throws UnsupportedOperationException {
		// TODO Auto-generated method stub

	}

	@Override
	public Estado getEstado() {
		return Estado.PREPARADO;
	}

	@Override
	public void iniciar() throws UnsupportedOperationException {
		// TODO Auto-generated method stub

	}

	@Override
	public void parar() throws UnsupportedOperationException {
		// TODO Auto-generated method stub

	}

	@Override
	public void recibir(int respuesta) {
		// TODO Auto-generated method stub

	}

}
