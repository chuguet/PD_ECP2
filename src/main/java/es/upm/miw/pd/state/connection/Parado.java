package es.upm.miw.pd.state.connection;

public class Parado extends HandlerEstado {

    public Parado(Conexion conexion) {
        super(conexion);
    }

    @Override
    public void abrir() {
        throw new UnsupportedOperationException("Accion no permitida");
    }

    @Override
    public void cerrar() {
        throw new UnsupportedOperationException("Accion no permitida");
    }

    @Override
    public void enviar(String msg) {
        throw new UnsupportedOperationException("Accion no permitida");
    }

    @Override
    public Estado getEstado() {
        return Estado.PARADO;
    }

    @Override
    public void iniciar() {
        super.getConexion().setHandlerEstado(new Preparado(super.getConexion()));
    }

    @Override
    public void parar() {
    }

    @Override
    public void recibir(int respuesta) {
        throw new UnsupportedOperationException("Accion no permitida");
    }

}
