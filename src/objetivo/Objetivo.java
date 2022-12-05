package objetivo;

import gamificacion.IObservable;
import gamificacion.ItrofeoObservador;
import gamificacion.IObservable;
import rutina.Rutina;

public class Objetivo implements IObservable {

	private TipoObjetivo tipoObjetivo;
    private Rutina rutina;
    private int pesoInicial;

    public Objetivo(TipoObjetivo tipoObjetivo) 
    {
    	this.tipoObjetivo = tipoObjetivo;
    	this.rutina = tipoObjetivo.crearRutina();
    }
    
    public void ReforzarRutina(Rutina r) {
    	this.rutina = r;
    }

    public void seTipoObjetivo(TipoObjetivo tipoObjetivo) {
        this.tipoObjetivo = tipoObjetivo;
    }
    
    public TipoObjetivo getTipoObjetivo()
    {
    	return tipoObjetivo;
    }
    
    public int getPesoInicial() {
        return pesoInicial;
    }

    public Rutina getRutina() {
        return rutina;
    }

	@Override
	public void agregarObservador(ItrofeoObservador obs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarObservador(ItrofeoObservador obs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notificartrofeo() {
		// TODO Auto-generated method stub
		
	}
}