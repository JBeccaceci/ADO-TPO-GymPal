package rutina;

import entrenamiento.Entrenamiento;
import entrenamiento.Ejercicio;
import enums.ExigenciaMuscular;
import gamificacion.Constancia;
import socio.Historial;
import socio.Socio;

import java.util.*;

public class Rutina {

    private List<Entrenamiento> entrenamientos;
    private int nmroEntrenamiento= 0;
    private Date inicio;
    private ExigenciaMuscular exigenciaMuscular;
    private int tiempoEntrenamiento;
    private int nivelAerobico;

    public Rutina() {
    }

    public Rutina(List<Entrenamiento> entrenamientos,
                  ExigenciaMuscular exigenciaMuscular,
                  int tiempoEntrenamiento,
                  int nivelAerobico) {
        this.entrenamientos = entrenamientos;
        this.inicio = new Date();
        this.exigenciaMuscular = exigenciaMuscular;
        this.tiempoEntrenamiento = tiempoEntrenamiento;
        this.nivelAerobico = nivelAerobico;
    }

    public void comenzarEntrenamiento(Socio socio) {
    	mostrarEntrenamiento();
    }

    public void finalizarEntrenamiento(Socio socio) {
        Historial historial = socio.getHistorial();
        historial.guardarEntrenamientosCompletados();

    	System.out.println("Entrenamiento Finalizado");
    	nmroEntrenamiento++;
    }
    
    private void mostrarEntrenamiento() {
    	List<Ejercicio> ejercicios =  entrenamientos.get(nmroEntrenamiento).getEjercicios();
    	int largo = ejercicios.size() - 1;
    	
    	//mostramos los ejercicios que forman al entrenamiento del dia
    	for (int i = 0; i < largo; i++) {
    		System.out.println("Nombre: " + ejercicios.get(i).getNombre());
    	}
    } 
    
    public List<Entrenamiento> getEntrenamientos() {
        return entrenamientos;
    }
}