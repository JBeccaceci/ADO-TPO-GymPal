package objetivo;

import mediciones.Medicion;
import rutina.Rutina;

import java.util.List;

public interface TipoObjetivo {

    public abstract Rutina crearRutina();
    public abstract boolean cumpleObjetivo(List<Medicion> mediciones);
}