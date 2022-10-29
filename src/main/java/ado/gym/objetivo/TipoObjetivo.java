package ado.gym.objetivo;

import ado.gym.entrenamiento.Entrenamiento;
import ado.gym.entrenamiento.rutina.Rutina;

import java.util.List;

/**
 * 
 */
public abstract class TipoObjetivo {

    public TipoObjetivo() {
    }

    public abstract Rutina crearRutina(List<Entrenamiento> entrenamientos);

    public boolean VerificarCumplimiento() {
        return false;
    }

}