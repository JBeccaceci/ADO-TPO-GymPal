package notificacion;

import gamificacion.ItrofeoObservador;
import socio.Socio;

public class Notificacion 
{
    private String trofeo;
    private String cuentaSocio;
    private String mensaje;

    
    public String getTrofeo()
    {
    	return trofeo;
    }
    
    public String getSocio()
    {
    	return cuentaSocio;
    }

    public String getMensaje() 
    {
        return mensaje;
    }
    
    public void setTrofeo(String trofeo) 
    {
        this.trofeo = trofeo;
    }
    
    public void setSocio(String socio)
    {
    	this.cuentaSocio = socio;
    }
    
    public void setMensaje(String mensaje) 
    {
        this.mensaje = mensaje;
    }
}
