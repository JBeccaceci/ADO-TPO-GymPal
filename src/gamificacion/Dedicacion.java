package gamificacion;


public class Dedicacion extends ItrofeoObservador
{
    public String Nombre;

    public Dedicacion(String nombre) {
        this.Nombre = nombre;
    }

    public boolean cumpleTrofeo() 
    {
    	return false;
    }
}