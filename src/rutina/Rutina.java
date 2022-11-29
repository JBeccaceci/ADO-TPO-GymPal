package rutina;

import entrenamiento.Entrenamiento;
import entrenamiento.Ejercicio;
import enums.ExigenciaMuscular;
import gamificacion.Constancia;
import notificacion.Notificacion;
import observer.Observados;
import socio.Historial;
import socio.Socio;

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
    }

    public void comenzarEntrenamiento(Socio socio) {
    	mostrarEntrenamiento();
    }

    public void finalizarEntrenamiento(Socio socio) {
        Historial historial = socio.getHistorial();
        historial.guardarEntrenamientosCompletados();

    	System.out.println("Entrenamiento Finalizado");
    	nmroEntrenamiento++;

        /*
         * Se  otorga este  trofeo a aquellos sociosque  cumplen  a la  perfección conlas rutinas.
         * Una rutina se cumple a la perfección cuando se asisten todos los días de entrenamientosy se realizan
         * todos  los  ejercicios,  sin  importar  la  cantidad  de  series  y  repeticiones  que  el  usuario  hayarealizado
         */
        this.notificarObservadores(new Notificacion(
                new Constancia("Constancia"), "Objetivo constancia cumplido"));
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

    public int getNmroEntrenamiento()
    {
        return nmroEntrenamiento;
    }
}