package gamificacion;

import java.util.*;

import objetivo.TipoObjetivo;

public class Dedicacion 
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
        TipoObjetivo tipo = obj.getTipo();

        if(tipo.VerificarCumplimiento() == true)
        {
            return true;
        }

        return false;
    }
}