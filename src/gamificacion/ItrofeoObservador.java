package gamificacion;

import notificacion.Notificacion;
import notificacion.Notificador;
import socio.Socio;

public abstract class ItrofeoObservador {
    
    private String Nombre;

    public abstract void notificarTrofeo(Notificador notfiicador, Notificacion notificacion); 
    
}