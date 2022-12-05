package rutina;

import enums.ExigenciaMuscular;
import gamificacion.Constancia;
import notificacion.Notificacion;
import gamificacion.IObservable;
import socio.Socio;

import java.util.*;

import rutina.Ejercicio;
import rutina.Entrenamiento;

public class Rutina implements IObservable {

    private List<Entrenamiento> entrenamientos;
    private List<EntrenamientoCompletado> entrenamientosCompletados;
    private int nmroEntrenamiento;
    private Date inicio;
    private ExigenciaMuscular exigenciaMuscular;
    private int tiempoEntrenamiento;
    private int nivelAerobico;

    public Rutina() {
    }

    public Rutina(List<Entrenamiento> entrenamientos,
                  ExigenciaMuscular exigenciaMuscular,
                  int tiempoEntrenamiento,
                  int nivelAerobico) 
    {
        this.entrenamientos = entrenamientos;
        this.inicio = new Date();
        this.exigenciaMuscular = exigenciaMuscular;
        this.tiempoEntrenamiento = tiempoEntrenamiento;
        this.nivelAerobico = nivelAerobico;
        this.nmroEntrenamiento = 0;
        this.entrenamientosCompletados = new ArrayList<>();
    }

    public void comenzarEntrenamiento(Entrenamiento e) 
    {
    	System.out.println("Detalles del Entrenamiento: ");
    	e.mostrarEntrenamiento();
    }

    public EntrenamientoCompletado finalizarEntrenamiento(Entrenamiento e) 
    {
    	EntrenamientoCompletado eC = new EntrenamientoCompletado();
    	eC.crearEntrenamientoCompletado();
    	
    	int largo = e.getEjercicios().size();
    	for(int i = 0; i < largo; i++)
    	{
    		e.comenzarEjercicio(e.getEjActual());
    		eC.agregarEjercicio(e.finalizarEjercicio(e.getEjActual()));
    	}
    	
    	e.reinciarNmroEjActual();
    	nmroEntrenamiento++;
    	
    	return eC;
    }
    
    public List<Entrenamiento> getEntrenamientos() 
    {
        return entrenamientos;
    }
    
    public Entrenamiento getEntrenamientoActual()
    {
    	return entrenamientos.get(nmroEntrenamiento);
    }
    
    public void reinciarNmroEntActual()
    {
    	this.nmroEntrenamiento = 0;
    }
    
    public void refuerzo()
    {
    	//nmro random entre 9 y 1
    	
    	
		int largoE = entrenamientos.size();
		for(int i = 0; i < largoE; i++)
		{
			int largoJ = entrenamientos.get(i).getEjercicios().size();
			for(int k = 0; k < largoJ; k++)
			{
				int r = (int) ((Math.random() * (5 - 1)) + 1);
				
				entrenamientos.get(i).getEjercicios().get(k).setSeries(entrenamientos.get(i).getEjercicios().get(k).getSeries() * r);
				entrenamientos.get(i).getEjercicios().get(k).setPesoAsignado(entrenamientos.get(i).getEjercicios().get(k).getPesoAsignado() * r);
				entrenamientos.get(i).getEjercicios().get(k).setRepeticiones(entrenamientos.get(i).getEjercicios().get(k).getRepeticiones() * r);
			}
		}
	}
}