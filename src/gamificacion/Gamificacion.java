package gamificacion;

import java.util.*;
import socio.Socio;

public class Gamificacion 
{
    public List<ITrofeo> Trofeos;

    public Gamificacion(List<ITrofeo> trofeos) 
    {
        this.Trofeos = trofeos;
    }

    public void agregarTrofeo(ITrofeo trofeo, Socio socio) {
        if(trofeo.OtorgarTrofeo(socio)) {
            this.Trofeos.add(trofeo);
        }
    }

    public void eliminarTrofeo(ITrofeo trofeo) {
        this.Trofeos.remove(trofeo);
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