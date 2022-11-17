package objetivo;

import entrenamiento.Entrenamiento;
import rutina.Rutina;
import enums.ExigenciaMuscular;
import objetivo.TipoObjetivo;

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