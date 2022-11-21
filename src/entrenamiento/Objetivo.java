package entrenamiento;

import mediciones.Medicion;
import rutina.Rutina;
import rutina.RutinaReforzada;
import objetivo.TipoObjetivo;
import observer.Observados;
import socio.Socio;

import java.util.List;

import static enums.Clasificacion.Actual;
import static enums.TipoMedicion.Peso;

public class Objetivo extends Observados {

	private TipoObjetivo tipoObjetivo;
    private Rutina rutina;
    private int pesoInicial;

    public Objetivo(TipoObjetivo tipoObjetivo) {
    	this.tipoObjetivo = tipoObjetivo;
    	this.rutina = tipoObjetivo.crearRutina();
    }

    public Objetivo(TipoObjetivo tipoObjetivo, List<Medicion> mediciones) {
        this(tipoObjetivo);
        iniciarMediciones(mediciones);
    }

    public void cumpleObjetivo(List<Medicion> mediciones) {
        if (tipoObjetivo.cumpleObjetivo(mediciones)) {

        }
    }

    public void iniciarMediciones(List<Medicion> mediciones) {
        for (Medicion m : mediciones) {
            if (m.getClasificacion() == Actual) {
                if (m.getTipo() == Peso) {
                    pesoInicial = m.getValor();
                }
            }
        }
    }

    public RutinaReforzada ReforzarRutina() 
    {
        return null;
    }

    public void seTipoObjetivo(TipoObjetivo tipoObjetivo) {
        this.tipoObjetivo = tipoObjetivo;
    }

    public int getPesoInicial() {
        return pesoInicial;
    }
}