package es.upm.miw.pd.state.connection;

public class Conexion {

    private HandlerEstado handlerEstado;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.setHandlerEstado(new Cerrado(this));
    }

    public void abrir() {
        handlerEstado.abrir();
    }

    public void cerrar() {
        handlerEstado.cerrar();
    }

    public void enviar(String msg) {
        handlerEstado.enviar(msg);
    }

    public Estado getEstado() {
        return handlerEstado.getEstado();
    }

    public Link getLink() {
        return link;
    }

    public void iniciar() {
        handlerEstado.iniciar();
    }

    public void parar() {
        handlerEstado.parar();
    }

    public void recibir(int respuesta) {
        handlerEstado.recibir(respuesta);
    }

    protected void setHandlerEstado(HandlerEstado handlerEstado) {
        this.handlerEstado = handlerEstado;
    }

}
