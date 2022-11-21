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

    public void agregarTrofeo(Trofeo trofeo)
    {
        if(trofeo.OtorgarTrofeo() == true)
        {
            this.ejercicios.add(trofeo);
        }
    }

    public void eliminarTrofeo(Trofeo trofeo)
    {
        this.ejercicios.remove(trofeo);
    }


    /*public void OtorgarTrofeo() 
    {
        //gamificacion no se encargaria de otorgar trofeos, sino una clase Trofeo es la que otorga
    }

    
    //PARA MI ESTO NO LO HACE GAMIFICACION, cada trofeo realiza el control estilo strategy
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
        //peso
        //y grasa muscular quiza?
        //pero ni lo pide en el enunciado, solo menciona peso
    }
    */
}