package rutina;

import enums.ExigenciaMuscular;
import enums.GruposMusculares;


public class Ejercicio extends Entrenamiento {
	private String nombre;
    private GruposMusculares grupoMuscular;
    private ExigenciaMuscular exigenciaMuscular;
    private int series;
    private int repeticiones;
    private int nivelAerobico;
    private int pesoAsignado;
    
    public Ejercicio() { }
    
    public Ejercicio(String nombre, GruposMusculares grupoMuscular, ExigenciaMuscular exigenciaMuscular, int series, int repeticiones, int nivelAerobico, int pesoAsignado) 
    {
        this.nombre = nombre;
        this.grupoMuscular = grupoMuscular;
        this.exigenciaMuscular = exigenciaMuscular;
        this.series = series;
        this.repeticiones = repeticiones;
        this.nivelAerobico = nivelAerobico;
        this.pesoAsignado = pesoAsignado;
    }

    public ExigenciaMuscular getExigenciaMuscular() {
        return exigenciaMuscular;
    }
    
    
    public void modificarEjercicio(int series, int repeticiones, int peso) 
    {
		this.series = series;
		this.repeticiones = repeticiones;
		this.pesoAsignado = peso;
	}
    
    public void mostrarEjercicio()
    {
    	System.out.println("Nombre: " + this.nombre);
    	System.out.println("Series: " + this.series);
    	System.out.println("Repeteciones: " + this.repeticiones);    	
    	System.out.println("Peso: " + this.pesoAsignado);
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

	public void setPesoAsignado(int i) 
	{
		this.pesoAsignado = i;	
	}

	public void setRepeticiones(int i) 
	{
		this.repeticiones = i;
	}

	public void setSeries(int i) 
	{
		this.series = i;
	}
}