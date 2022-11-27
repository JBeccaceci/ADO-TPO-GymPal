package objetivo;

import mediciones.Medicion;
import rutina.Rutina;

import java.util.List;

public abstract class TipoObjetivo {

    public TipoObjetivo() { }

    public abstract Rutina crearRutina();
    public abstract boolean cumpleObjetivo(List<Medicion> mediciones);
}