package observer;

import gamificacion.Trofeo;
import notificacion.Notificacion;

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

    public void notificarObservadores(Notificacion notificacion) {
        for (IObservador observador: observadores) {
        	observador.notificar(notificacion);
            observador.objetivoCumplido(notificacion.getTrofeo());
        }
    }

    public void notificarGamification(Trofeo trofeo) {
        for (IObservador observador: observadores) {
            observador.objetivoCumplido(trofeo);
        }
    }
}