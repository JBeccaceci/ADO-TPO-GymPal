package notificacion;

import gamificacion.ItrofeoObservador;
import socio.Socio;

public class Notificacion 
{
    private ItrofeoObservador trofeo;
    private Socio socio;
    private String mensaje;

    public Notificacion() 
    {
    	
    }

    public Notificacion(ItrofeoObservador t, Socio s, String m) 
    {
        this.trofeo = t;
        this.socio = s;
        this.mensaje = m;
    }

    public void setTrofeo(ItrofeoObservador trofeo) 
    {
        this.trofeo = trofeo;
    }

    public String getMensaje() 
    {
        return mensaje;
    }

    public void setMensaje(String mensaje) 
    {
        this.mensaje = mensaje;
    }
}
