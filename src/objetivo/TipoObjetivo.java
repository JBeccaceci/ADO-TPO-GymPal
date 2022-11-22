package objetivo;

import mediciones.Medicion;
import rutina.Rutina;

import java.util.List;

import entrenamiento.Objetivo;
import enums.Sexo;

public abstract class TipoObjetivo {

    public TipoObjetivo() { }

    public abstract Rutina crearRutina();
    public abstract boolean cumpleObjetivo(List<Medicion> mediciones);
}