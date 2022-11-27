package observer;

import gamificacion.Trofeo;

public interface IObservador {
    void objetivoCumplido(Trofeo trofeo);
	void notificar(String message);
}