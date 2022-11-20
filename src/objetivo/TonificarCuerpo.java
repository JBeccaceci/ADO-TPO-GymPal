package objetivo;

import entrenamiento.Entrenamiento;
import rutina.Rutina;
import enums.ExigenciaMuscular;
import objetivo.TipoObjetivo;

import java.util.List;

public class TonificarCuerpo extends TipoObjetivo {

    public TonificarCuerpo() {
    }

    @Override
    public Rutina crearRutina(List<Entrenamiento> entrenamientos)
    {
        return new Rutina(entrenamientos, ExigenciaMuscular.Bajo, 1, 3);
    }

    public boolean VerificarCumplimiento() {
        return false;
    }

}