package es.upm.miw.pd.state.connection;

public class Esperando extends HandlerEstado {

    public Esperando(Conexion conexion) {
        super(conexion);
    }

    @Override
    public void abrir() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Accion no permitida");
    }

    @Override
    public void cerrar() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Accion no permitida");
    }

    @Override
    public void enviar(String msg) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Accion no permitida");
    }

    @Override
    public Estado getEstado() {
        return Estado.ESPERANDO;
    }

    @Override
    public void iniciar() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Accion no permitida");
    }

    @Override
    public void parar() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Accion no permitida");
    }

    @Override
    public void recibir(int respuesta) {
        if (respuesta == 0) {
            super.getConexion().setHandlerEstado(new Preparado(super.getConexion()));
        } else {
            super.getConexion().setHandlerEstado(new Cerrado(super.getConexion()));
        }
    }

}
