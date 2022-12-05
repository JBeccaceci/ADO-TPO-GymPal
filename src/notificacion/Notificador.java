package notificacion;

import gamificacion.IObservable;

public class Notificador 
{
    private IEstrategiaNotificacion estrategiaNotificacion;

    public Notificador() {
        this.estrategiaNotificacion = new PushNotification();
    }
    
    public void notificarTrofeo(Notificacion noti)
    {
    	
    }
    
    public void cambiarEstrategiaNotificacion(IEstrategiaNotificacion nueva_estrategia)
    {
    	
    }
    
    public void setNotificadoPor(IObservable observable)
    {
    	
    }
    
}