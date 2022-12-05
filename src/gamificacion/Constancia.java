package gamificacion;

public class Constancia extends ItrofeoObservador
{
    public String Nombre;

    public Constancia(String nombre){
        this.Nombre = nombre;
    }

    public boolean cumpleTrofeo() 
    {
       return false;
    }

}