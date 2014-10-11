package es.upm.miw.pd.state.connection;

public abstract class HandlerEstado {

	private Conexion conexion;

	public HandlerEstado(Conexion conexion) {
		this.conexion = conexion;
	}

	public abstract Estado getEstado();

	public abstract void abrir();

	public abstract void cerrar();

	public abstract void parar();

	public abstract void iniciar();

	public abstract void enviar(String msg);

	public abstract void recibir(int respuesta);

	protected Conexion getConexion() {
		return conexion;
	}
}
