package ado.gym.entrenamiento;

import ado.gym.enums.ExigenciaMuscular;
import ado.gym.enums.GruposMusculares;

/**
 * 
 */
public class Ejercicio extends Entrenamiento {

    private String nombre;
    private GruposMusculares grupoMuscular;
    private ExigenciaMuscular exigenciaMuscular;
    private int series;
    private int repeticiones;
    private int nivelAerobico;
    private int pesoAsignado;

    public Ejercicio() {
    }

    public Ejercicio(String nombre, GruposMusculares grupoMuscular, ExigenciaMuscular exigenciaMuscular, int series, int repeticiones, int nivelAerobico, int pesoAsignado) {
        this.nombre = nombre;
        this.grupoMuscular = grupoMuscular;
        this.exigenciaMuscular = exigenciaMuscular;
        this.series = series;
        this.repeticiones = repeticiones;
        this.nivelAerobico = nivelAerobico;
        this.pesoAsignado = pesoAsignado;
    }

    public String getNombre() {
        return nombre;
    }
}