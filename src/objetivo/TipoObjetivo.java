package objetivo;

import entrenamiento.Entrenamiento;
import rutina.Rutina;

import java.util.List;

public abstract interface TipoObjetivo 
{
    public abstract Rutina crearRutina(List<Entrenamiento> entrenamientos);
    public boolean VerificarCumplimiento();
   
}