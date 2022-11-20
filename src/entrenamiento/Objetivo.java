package entrenamiento;

import rutina.Rutina;
import rutina.RutinaReforzada;
import objetivo.TipoObjetivo;
import observer.Observados;

public class Objetivo extends Observados 
{

	private TipoObjetivo tipoObjetivo;
    private Rutina rutina;

    public Objetivo(TipoObjetivo tipoObjetivo, Rutina rutina)
    {
    	this.tipoObjetivo = tipoObjetivo;
    	this.rutina = rutina;
    }
    
    public void seTipoObjetivo(TipoObjetivo tipoObjetivo) 
    {
        this.tipoObjetivo = tipoObjetivo;
    }


    public Rutina CrearRutina() 
    {
        return null;
    }

    public RutinaReforzada ReforzarRutina() 
    {
        return null;
    }

}