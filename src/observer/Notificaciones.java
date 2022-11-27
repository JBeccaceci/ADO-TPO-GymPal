package observer;

import gamificacion.Trofeo;

import java.util.*;


public class Notificaciones implements IObservador {
    private IFireBase notificador;

    public Notificaciones() {
        this.notificador = new FireBase();
    }

    @Override
    public void objetivoCumplido(Trofeo trofeo) {
        //  Nothing to do
    }

    @Override
    public void notificar(String message) {
        this.notificador.notificar(message);
    }
}