package objetivo;

import entrenamiento.Entrenamiento;
import rutina.Rutina;

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