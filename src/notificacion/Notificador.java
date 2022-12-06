package notificacion;

import gamificacion.IObservable;

public class Notificador 
{
    private IEstrategiaNotificacion estrategia;

    public void enviar(Notificacion notificacion)
    {
    	this.estrategia.notificar(notificacion);
    }
    
    public void cambiarEstrategiaNotificacion(IEstrategiaNotificacion nuevaEstrategia)
    {
    	this.estrategia = nuevaEstrategia;
    }
}