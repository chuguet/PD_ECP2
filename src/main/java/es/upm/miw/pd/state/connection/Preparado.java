package es.upm.miw.pd.state.connection;

public class Preparado extends HandlerEstado {

    public Preparado(Conexion conexion) {
        super(conexion);
    }

    @Override
    public void abrir() {
    }

    @Override
    public void cerrar() {
        super.getConexion().setHandlerEstado(new Cerrado(super.getConexion()));
    }

    @Override
    public void enviar(String msg) {
        super.getConexion().getLink().enviar(msg);
        super.getConexion().setHandlerEstado(new Esperando(super.getConexion()));
    }

    @Override
    public Estado getEstado() {
        return Estado.PREPARADO;
    }

    @Override
    public void iniciar() {
    }

    @Override
    public void parar() {
        super.getConexion().setHandlerEstado(new Parado(super.getConexion()));
    }

    @Override
    public void recibir(int respuesta) {
        throw new UnsupportedOperationException("Accion no permitida");
    }

}
