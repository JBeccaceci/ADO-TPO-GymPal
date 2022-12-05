package gamificacion;


public class Creido extends ItrofeoObservador
{
    public String Nombre;
       
    public Creido(String nombre) {
        this.Nombre = nombre;
    }

    public boolean cumpleTrofeo() 
    {
    	return false;
    }

}