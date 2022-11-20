package rutina;

import entrenamiento.Entrenamiento;
import entrenamiento.Ejercicio;
import enums.ExigenciaMuscular;
import observer.Observados;

import java.util.*;

public class Rutina extends Observados {

    private List<Entrenamiento> entrenamientos;
    private int nmroEntrenamiento= 0;
    private Date inicio;
    private ExigenciaMuscular exigenciaMuscular;
    private int tiempoEntrenamiento;
    private int nivelAerobico;

    public Rutina() {
    }

    public Rutina(List<Entrenamiento> entrenamientos, ExigenciaMuscular exigenciaMuscular, int tiempoEntrenamiento, int nivelAerobico) {
        this.entrenamientos = entrenamientos;
        this.inicio = new Date();
        this.exigenciaMuscular = exigenciaMuscular;
        this.tiempoEntrenamiento = tiempoEntrenamiento;
        this.nivelAerobico = nivelAerobico;
    }

    public void comenzarEntrenamiento() 
    {
    	//Serian una funcion de la app
    	//comenzar();
    	mostrarEntrenamiento();
    }

    public void finalizarEntrenamiento() 
    {
    	//Serian una funcion de la app
    	//finalizado();
    	System.out.println("Entrenamiento Finalizado");
    	nmroEntrenamiento++;
    }
    
    private void mostrarEntrenamiento()
    {
    	List<Ejercicio> ejercicios =  entrenamientos.get(nmroEntrenamiento).getEjercicios();
    	int largo = ejercicios.size() - 1;
    	
    	//mostramos los ejercicios que forman al entrenamiento del dia
    	for (int i = 0; i < largo; i++) 
    	{
    		System.out.println("Nombre: " + ejercicios.get(i).getNombre());
    	}
    }  
}