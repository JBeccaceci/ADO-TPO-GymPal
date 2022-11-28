package gamificacion;

import observer.IObservador;
import socio.Socio;

public abstract class Trofeo implements IObservador {
    public abstract boolean OtorgarTrofeo(Socio socio);
}