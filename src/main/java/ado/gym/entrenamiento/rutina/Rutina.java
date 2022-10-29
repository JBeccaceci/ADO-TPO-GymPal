package ado.gym.entrenamiento.rutina;

import ado.gym.entrenamiento.Entrenamiento;
import ado.gym.enums.ExigenciaMuscular;
import ado.gym.observer.Observados;

import java.util.*;

/**
 * 
 */
public class Rutina extends Observados {

    private List<Entrenamiento> entrenamientos;
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

    public void comenzarEntrenamiento() {
    }

    public void finalizarEntrenamiento() {
    }

}