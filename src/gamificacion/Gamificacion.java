package gamificacion;

import observer.IObservador;
import notificacion.Notificacion;

import java.util.List;


public class Gamificacion implements IObservador {
	private List<Trofeo> trofeos;
	
	public void agregarTrofeo(Trofeo t) {
		trofeos.add(t);
	}
	
	public void removerTrofeo(Trofeo t) {
		trofeos.remove(t);
	}

	@Override
	public void objetivoCumplido(Trofeo trofeo) {
		agregarTrofeo(trofeo);
	}

	@Override
	public void notificar(Notificacion notificacion) {
		// Nothing to do
	}
}
