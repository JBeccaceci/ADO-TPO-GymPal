package gamificacion;

import socio.Historial;
import socio.Socio;

import java.util.List;

import rutina.Entrenamiento;
import objetivo.Objetivo;
import rutina.Rutina;


public class Constancia implements Trofeo
{
    public String Nombre;

    public Constancia(String nombre){
        this.Nombre = nombre;
    }

    public boolean cumpleTrofeo(Socio socio) {
        Historial historial = socio.getHistorial();
        Objetivo obj = socio.getObjetivo();
        Rutina rutina = obj.getRutina();
        List<Entrenamiento> entrenamientos = rutina.getEntrenamientos();

        int totalEntrenamientos = entrenamientos.size() - 1;
        int entrenamientosCompletados = historial.getEntrenamientosCompletados();

        return totalEntrenamientos == entrenamientosCompletados;
    }

}