package gamificacion;

import notificacion.Notificacion;
import socio.Socio;

public abstract class ItrofeoObservador {
    
    private String Nombre;
    private Notificacion notificacion;

    public abstract void notificarTrofeo(); 
    
}