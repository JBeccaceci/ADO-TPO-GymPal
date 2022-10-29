package ado.gym.objetivo.tipos;

import ado.gym.entrenamiento.Entrenamiento;
import ado.gym.entrenamiento.rutina.Rutina;
import ado.gym.enums.ExigenciaMuscular;
import ado.gym.objetivo.TipoObjetivo;

import java.util.List;

/**
 * 
 */
public class BajarPeso extends TipoObjetivo {

    public BajarPeso() {
        super();
    }

    @Override
    public Rutina crearRutina(List<Entrenamiento> entrenamientos) {
        return new Rutina(entrenamientos, ExigenciaMuscular.Medio, 80, 3);
    }

    private int obtenerPesoIdeal() {
        return 0;
    }

    public boolean verificarCumplimiento() {
        return false;
    }

}