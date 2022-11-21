package observer;

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

    public void notificarObservadores(int tipo, String objetivo) {
        for(IObservador observador: observadores) {
        	observador.Notificar();
        }
    }
}