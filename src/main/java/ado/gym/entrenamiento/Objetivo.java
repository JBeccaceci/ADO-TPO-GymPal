package ado.gym.entrenamiento;

import ado.gym.entrenamiento.rutina.Rutina;
import ado.gym.entrenamiento.rutina.RutinaReforzada;
import ado.gym.objetivo.TipoObjetivo;
import ado.gym.observer.Observados;

public class Objetivo extends Observados {

    private TipoObjetivo tipoObjetivo;
    private Rutina rutina;

    public Objetivo(TipoObjetivo tipoObjetivo) {
        this.tipoObjetivo = tipoObjetivo;
    }

    /**
     * @param tipo 
     * @return
     */
    public void CambiarObjetivo(TipoObjetivo tipo) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Rutina CrearRutina() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public RutinaReforzada ReforzarRutina() {
        // TODO implement here
        return null;
    }

}