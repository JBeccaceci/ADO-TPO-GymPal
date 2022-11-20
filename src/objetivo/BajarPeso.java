package objetivo;

import entrenamiento.Entrenamiento;
import rutina.Rutina;
import enums.ExigenciaMuscular;
import objetivo.TipoObjetivo;

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