package gamificacion;

import objetivo.Objetivo;
import socio.Socio;

public class Dedicacion extends ItrofeoObservador
{
    public String Nombre;

    public Dedicacion(String nombre) {
        this.Nombre = nombre;
    }
    
    public void notificarTrofeo() 
    {
		System.out.println("Ganaste el trofeo " + Nombre + ".");
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