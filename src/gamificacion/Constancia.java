package gamificacion;

import java.util.*;

import entrenamiento.Objetivo;
import objetivo.TipoObjetivo;
import entrenamiento.Entrenamiento;
import rutina.Rutina;
import socio.Historial;
import socio.Socio;


public class Constancia implements ITrofeo
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
        List<Entrenamiento> entrenamientos = rutina.getEntrenamientos();

        int totalEntrenamientos = entrenamientos.size() - 1;
        int entrenamientosCompletados = historial.getEntrenamientosCompletados();

        if(totalEntrenamientos == entrenamientosCompletados)
        {
            return true;
        }

        return false;
    }

}