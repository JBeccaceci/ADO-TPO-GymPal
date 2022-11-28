package gamificacion;

import entrenamiento.Entrenamiento;
import entrenamiento.Objetivo;
import rutina.Rutina;
import socio.Historial;
import socio.Socio;

import java.util.List;


public class Constancia extends Trofeo {
    public String Nombre;

    public Constancia(String nombre) {
        this.Nombre = nombre;
    }

    public boolean OtorgarTrofeo(Socio socio) {
        Historial historial = socio.getHistorial();
        Objetivo obj = socio.getObjetivo();
        Rutina rutina = obj.getRutina();
        List<Entrenamiento> entrenamientos = rutina.getEntrenamientos();

        int totalEntrenamientos = entrenamientos.size() - 1;
        int entrenamientosCompletados = historial.getEntrenamientosCompletados();

        return totalEntrenamientos == entrenamientosCompletados;
    }

    @Override
    public void notificarOtorgarTrofeo() {

    }
}