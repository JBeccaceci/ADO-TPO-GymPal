package gamificacion;


import notificacion.Notificacion;
import notificacion.Notificador;


public interface IObservable
{
    public void agregarObservador(ItrofeoObservador obs);
    public void eliminarObservador(ItrofeoObservador obs);
    public void notificarObservadores(Notificador notificador, Notificacion notificacion);
}