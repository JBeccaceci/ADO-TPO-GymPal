package gamificacion;

import notificacion.Notificacion;
import java.util.*;

public interface IObservable{

    public agregarObservador(ItrofeoObservador obs) {
        this.observadores.add(obs);
    }

    public eliminarObservador(ItrofeoObservador obs) {
        this.observadores.remove(obs);
    }

    public notificartrofeo() {

    }


}