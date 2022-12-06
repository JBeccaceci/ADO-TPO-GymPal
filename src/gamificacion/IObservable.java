package gamificacion;

import notificacion.Notificacion;
import java.util.*;

public interface IObservable
{
    public void agregarObservador(ItrofeoObservador obs);
    public void eliminarObservador(ItrofeoObservador obs);
    public void notificarObservadores();
}