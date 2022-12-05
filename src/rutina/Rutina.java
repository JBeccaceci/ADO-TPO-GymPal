package rutina;

import enums.ExigenciaMuscular;
import gamificacion.Constancia;
import notificacion.Notificacion;
import observer.Observados;
import socio.Socio;

import java.util.*;

import rutina.Ejercicio;
import rutina.Entrenamiento;

public class Rutina extends Observados {

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
    	e.comenzarEjercicio(e.getEjActual());
    }

    public EntrenamientoCompletado finalizarEntrenamiento(Entrenamiento e) 
    {
    	EntrenamientoCompletado eC = new EntrenamientoCompletado();
    	eC.crearEntrenamientoCompletado();
    	eC.agregarEjercicio(e.finalizarEjercicio(e.getEjActual()));
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
    
    public void reinciarNmroEjActual()
    {
    	this.nmroEntrenamiento = 0;
    }
}