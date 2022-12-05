package notificacion;

import gamificacion.Trofeo;
import observer.IObservador;


public class Notificaciones implements IObservador {
    private IEstrategiaNotificacion estrategiaNotificacion;

    public Notificaciones() {
        this.estrategiaNotificacion = new PushNotification();
    }

    @Override
    public void objetivoCumplido(Trofeo trofeo) {
        //  Nothing to do
    }

    @Override
    public void notificar(Notificacion notificacion) {
        this.estrategiaNotificacion.notificar(notificacion);
    }
}