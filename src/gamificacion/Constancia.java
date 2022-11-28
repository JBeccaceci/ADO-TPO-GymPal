package gamificacion;

import entrenamiento.Entrenamiento;
import entrenamiento.Objetivo;
import rutina.Rutina;
import socio.Historial;
import socio.Socio;

import java.util.List;


public class Constancia implements Trofeo
{
    public String Nombre;
    public Date fecha;

    public Constancia(String nombre, Date fecha){
        this.Nombre = nombre;
        this.fecha = fecha;
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