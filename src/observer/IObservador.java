package observer;

import gamificacion.Trofeo;
import notificacion.Notificacion;

public interface IObservador {
    void objetivoCumplido(Trofeo trofeo);
	void notificar(Notificacion notificacion);
}