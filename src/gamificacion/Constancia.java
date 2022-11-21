package gamificacion;

import java.util.*;

import socio.Historial;


public class Constancia 
{
    public String Nombre;

    public Constancia(String nombre) 
    {
        this.Nombre = nombre;
    }

    public boolean OtorgarTrofeo(Socio socio) 
    {
        Historial historial = socio.getHistorial();
        Objetivo obj = socio.getObjetivo();
        Rutina rutina = obj.getRutina();
        Entrenamientos entrenamientos = rutina.getEntrenamientos();

        int totalEntrenamientos = entrenamientos.size() - 1;
        int entrenamientosCompletados = historial.getEntrenamientosCompletados();

        if(totalEntrenamientos == entrenamientosCompletados)
        {
            return true;
        }

        return false;
    }

}