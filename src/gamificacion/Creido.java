package gamificacion;

import socio.Socio;

public class Creido extends ItrofeoObservador
{
    public String Nombre;
       
    public Creido(String nombre) {
        this.Nombre = nombre;
    }
    
	public void notificarTrofeo() 
    {
		System.out.println("Ganaste el trofeo " + Nombre + ".");
	}

    public boolean cumpleTrofeo(Socio socio) 
    {
    	if(socio.getAdapter().getCantPesajesMes() == 3)
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