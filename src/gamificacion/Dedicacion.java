package gamificacion;

import java.util.*;

import entrenamiento.Objetivo;
import objetivo.TipoObjetivo;
import socio.Socio;

public class Dedicacion implements ITrofeo
{
    public String Nombre;

    public Dedicacion(String nombre) 
    {
        this.Nombre = nombre;
    }

    public boolean OtorgarTrofeo(Socio socio) 
    {
        //Controlamos que cumplio objetivo
        //Y si es true, luego en gamificacion lo agregamos
        Objetivo obj = socio.getObjetivo();
        TipoObjetivo tipo = obj.getTipoObjetivo();

        if(tipo.cumpleObjetivo(socio.getMediciones()) == true)
        {
            return true;
        }

        return false;
    }
}