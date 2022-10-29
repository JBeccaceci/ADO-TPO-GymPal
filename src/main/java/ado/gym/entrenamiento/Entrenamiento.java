package ado.gym.entrenamiento;

import ado.gym.entrenamiento.rutina.Rutina;

import java.util.*;

public class Entrenamiento extends Rutina {

    private List<Ejercicio> ejercicios;

    public Entrenamiento() {
        super();
        this.ejercicios = new ArrayList<>();
    }

    public void agregarEjercicio(Ejercicio ejercicio) {
        this.ejercicios.add(ejercicio);
    }

    public void eliminarEjercicio(final Ejercicio ejericio) {
        this.ejercicios.removeIf(e -> e.getNombre().equals(ejericio.getNombre()));
    }

    public void comenzarEjercicio(Ejercicio ejercicio) {

    }

    public void finalizarEjercicio(Ejercicio ejercicio) {

    }

}