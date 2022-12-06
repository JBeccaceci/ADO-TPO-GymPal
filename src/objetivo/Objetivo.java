package objetivo;

import java.util.ArrayList;
import java.util.List;

import gamificacion.IObservable;
import gamificacion.ItrofeoObservador;
import mediciones.Medicion;
import gamificacion.IObservable;
import rutina.Rutina;
import socio.Socio;

public class Objetivo implements IObservable {

	private TipoObjetivo tipoObjetivo;
	private boolean cumpleObjetivo;
    private Rutina rutina;
    private int pesoInicial;
    private List<ItrofeoObservador> observadores;
    
    public void cambiarObjetivo(TipoObjetivo tipo)
    {
    	this.tipoObjetivo = tipo;
    	this.rutina = tipoObjetivo.crearRutina();
    	this.observadores = new ArrayList<ItrofeoObservador>();
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
    
    public boolean getCumpleObjetivo()
    {
    	return cumpleObjetivo;
    }
    
    public boolean verificarCumpleObjetivo(Socio socio)
    {
    	cumpleObjetivo = tipoObjetivo.cumpleObjetivo(socio);
    	
    	return cumpleObjetivo;
    }

    public void agregarObservador(ItrofeoObservador obs) 
	{
		observadores.add(obs);
	}
	
	public void eliminarObservador(ItrofeoObservador obs) 
	{
		observadores.remove(obs);
	}
	
	public void notificarObservadores() 
	{
		for(ItrofeoObservador observador: observadores)
		{
			observador.notificarTrofeo();
		}
	}
}