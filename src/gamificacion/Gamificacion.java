package gamificacion;

import java.util.*;
import socio.Socio;

public class Gamificacion 
{
    public List<Trofeo> Trofeo;

    public Gamificacion(List<Trofeo> trofeos) 
    {
        this.Trofeo = trofeos;
    }
    
    public void OtorgarTrofeo() 
    {
        //gamificacion no se encargaria de otorgar trofeos, sino la clase Trofeo es la que otorga
    }

    public void objetivoCumplido(Socio socio) 
    {
        Objetivo obj = socio.getObjetivo;
        TipoObjetivo tipo = obj.getTipo;

        if(tipo.VerificarCumplimiento() == true)
        {
            System.out.println("FELICITACIONES, cumpliste con el objetivo");
        }
    }

    public void medicionCumplida() 
    {
        //que deberia hacer esto?, no lo cumple el objetivo cumplido ya lo de las mediciones?
    }

    public void agregarTrofeo(Trofeo trofeo)
    {
        this.ejercicios.add(trofeo);
    }

    public void eliminarTrofeo(Trofeo trofeo)
    {
        this.ejercicios.remove(trofeo);
    }

}