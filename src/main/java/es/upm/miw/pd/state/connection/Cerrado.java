package es.upm.miw.pd.state.connection;

public class Cerrado extends HandlerEstado {

    public Cerrado(Conexion conexion) {
        super(conexion);
    }

    @Override
    public void abrir() {
        super.getConexion().setHandlerEstado(new Preparado(super.getConexion()));
    }

    @Override
    public void cerrar() {
    }

    @Override
    public void enviar(String msg) {
        throw new UnsupportedOperationException("Accion no permitida");
    }

    @Override
    public Estado getEstado() {
        return Estado.CERRADO;
    }

    @Override
    public void iniciar() {
        throw new UnsupportedOperationException("Accion no permitida");
    }

    @Override
    public void parar() {
        throw new UnsupportedOperationException("Accion no permitida");
    }

    @Override
    public void recibir(int respuesta) {
        throw new UnsupportedOperationException("Accion no permitida");
    }

}
