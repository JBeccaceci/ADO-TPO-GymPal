package observer;

import gamificacion.Trofeo;

import java.util.*;


public class Observados {

    private List<IObservador> observadores;

    public Observados() {
        observadores = new ArrayList<>();
    }

    public void agregarObservador(IObservador obs) {
        this.observadores.add(obs);
    }

    public void eliminarObservador(IObservador obs) {
        this.observadores.remove(obs);
    }

    public void notificarObservadores(Trofeo trofeo, String message) {
        for (IObservador observador: observadores) {
        	observador.notificar(message);
            observador.objetivoCumplido(trofeo);
        }
    }

    public void notificarGamification(Trofeo trofeo) {
        for (IObservador observador: observadores) {
            observador.objetivoCumplido(trofeo);
        }
    }
}