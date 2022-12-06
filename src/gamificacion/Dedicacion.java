package gamificacion;

import notificacion.Notificacion;
import notificacion.Notificador;
import objetivo.Objetivo;
import socio.Socio;

public class Dedicacion extends ItrofeoObservador
{
    private String Nombre;

    public Dedicacion(String nombre) 
    {
        this.Nombre = nombre;
    }
    
    public void notificarTrofeo(Notificador notificador, Notificacion notificacion) 
    {
    	notificador.enviar(notificacion);
		//System.out.println("Ganaste el trofeo " + Nombre + ".");
	}

    public boolean cumpleTrofeo(Objetivo obj) 
    {
    	if(obj.getCumpleObjetivo() == true)
    	{
    		return true;
    	}
    	
    	return false;
    }
    
    public String getNombre()
    {
    	return this.Nombre;
    }
}