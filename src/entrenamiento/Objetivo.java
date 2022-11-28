package entrenamiento;

import objetivo.TipoObjetivo;
import rutina.Rutina;
import rutina.RutinaReforzada;

public class Objetivo {

	private TipoObjetivo tipoObjetivo;
    private Rutina rutina;
    private int pesoInicial;

    public Objetivo(TipoObjetivo tipoObjetivo) {
    	this.tipoObjetivo = tipoObjetivo;
    	this.rutina = tipoObjetivo.crearRutina();
    }
    
    public RutinaReforzada ReforzarRutina() {
        return null;
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