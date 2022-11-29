package entrenamiento;

import objetivo.TipoObjetivo;
import observer.Observados;
import rutina.Rutina;
import rutina.RutinaReforzada;

public class Objetivo extends Observados {

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
}