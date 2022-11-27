package gamificacion;

import observer.IObservador;

import java.util.List;


public class Gamificacion implements IObservador {
	private List<Trofeo> trofeos;
	
	public void agregarTrofeo(Trofeo t) {
		trofeos.add(t);
	}
	
	public void reomverTrofeo(Trofeo t) {
		trofeos.remove(t);
	}

	@Override
	public void objetivoCumplido(Trofeo trofeo) {
		agregarTrofeo(trofeo);
	}

	@Override
	public void notificar(String message) {
		// Nothing to do
	}
}
