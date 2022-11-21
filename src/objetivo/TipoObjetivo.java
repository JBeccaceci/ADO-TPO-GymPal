package objetivo;

import entrenamiento.Entrenamiento;
import entrenamiento.Objetivo;
import enums.Sexo;
import rutina.Rutina;
import socio.Socio;

import java.util.List;

public abstract interface TipoObjetivo 
{
    public abstract Rutina crearRutina(List<Entrenamiento> entrenamientos);
    public boolean VerificarCumplimiento(Objetivo obj, Socio socio);
    public int CalcularPesoIdeal(int peso , int altura, Sexo sexo);
   
}