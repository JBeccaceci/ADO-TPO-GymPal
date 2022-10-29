package ado.gym.objetivo.tipos;

import ado.gym.entrenamiento.Entrenamiento;
import ado.gym.entrenamiento.rutina.Rutina;
import ado.gym.enums.ExigenciaMuscular;
import ado.gym.objetivo.TipoObjetivo;

import java.util.List;

public class MantenerFigura extends TipoObjetivo {

    public MantenerFigura() {
    }

    @Override
    public Rutina crearRutina(List<Entrenamiento> entrenamientos) {
        return new Rutina(entrenamientos, ExigenciaMuscular.Bajo, 80, 3);
    }

    public boolean VerificarCumplimiento() {
        return false;
    }

}