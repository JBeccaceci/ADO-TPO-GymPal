package gamificacion;

import java.util.*;

import entrenamiento.Objetivo;
import objetivo.TipoObjetivo;
import socio.Socio;

public class Dedicacion implements Trofeo
{
    public String Nombre;

    public Dedicacion(String nombre) {
        this.Nombre = nombre;
    }

    public boolean cumpleTrofeo(Socio socio) 
    {
        Objetivo obj = socio.getObjetivo();
        TipoObjetivo tipo = obj.getTipoObjetivo();
        return tipo.cumpleObjetivo(socio.getMediciones());
    }
}