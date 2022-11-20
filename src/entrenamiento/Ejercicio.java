package entrenamiento;

import enums.ExigenciaMuscular;
import enums.GruposMusculares;


public class Ejercicio extends Entrenamiento 
{
	private String nombre;
    private GruposMusculares grupoMuscular;
    private ExigenciaMuscular exigenciaMuscular;
    private int series;
    private int repeticiones;
    private int nivelAerobico;
    private int pesoAsignado;
    private int repetcionesCompletadas;
    
    public Ejercicio()
    {
    	
    }
    
    public Ejercicio(String nombre, GruposMusculares grupoMuscular, ExigenciaMuscular exigenciaMuscular, int series, int repeticiones, int nivelAerobico, int pesoAsignado) 
    {
        this.nombre = nombre;
        this.grupoMuscular = grupoMuscular;
        this.exigenciaMuscular = exigenciaMuscular;
        this.series = series;
        this.repeticiones = repeticiones;
        this.nivelAerobico = nivelAerobico;
        this.pesoAsignado = pesoAsignado;
        this.repetcionesCompletadas = 0;
    }
    
    public void reiniciarRepeticionesCompletadas()
    {
    	this.repetcionesCompletadas = 0;
    }
    
    public void modificarEjercicio(int series, int repeticiones, int peso)
	{
		this.series = series;
		this.repeticiones = repeticiones;
		this.pesoAsignado = peso;
	}
    
    public String getNombre() 
    {
        return nombre;
    }

	public int getSeries() 
	{
		return series;
	}

	public int getRepeticiones() 
	{
		return repeticiones;
	}
	
	public int getNivelAerobico() 
	{
		return nivelAerobico;
	}

	public int getPesoAsignado() 
	{
		return pesoAsignado;
	}

	public int getRepetcionesCompletadas() 
	{
		return repetcionesCompletadas;
	}
}