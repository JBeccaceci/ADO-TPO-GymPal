package observer;

public class Notificador {
    private Notificacion notificacion;
    private IEstrategiaNotificacion estrategiaNotificacion;

    public Notificador() {
        this.estrategiaNotificacion = new PushNotificacion();
    }

    public void notificarTrofeo(Notificacion notificacion) {
        estrategiaNotificacion.notificar(notificacion);
    }
    public void setEstrategiaNotificacion(IEstrategiaNotificacion estrategiaNotificacion) {
        this.estrategiaNotificacion = estrategiaNotificacion;
    }
}
