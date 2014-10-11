package es.upm.miw.pd.state.connection;

public class Parado extends HandlerEstado {

	public Parado(Conexion conexion) {
		super(conexion);
	}

	@Override
	public Estado getEstado() {
		return Estado.PARADO;
	}

	@Override
	public void abrir(){
		throw new UnsupportedOperationException("wefwef");
	}

	@Override
	public void cerrar() throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parar() throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciar() throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enviar(String msg) throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recibir(int respuesta) {
		// TODO Auto-generated method stub
		
	}

}
