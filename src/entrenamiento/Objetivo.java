package entrenamiento;

import mediciones.Medicion;
import objetivo.TipoObjetivo;
import observer.Observados;
import rutina.Rutina;
import rutina.RutinaReforzada;

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
            if (m.getClasificacion() == Actual && m.getTipo() == Peso) {
                pesoInicial = m.getValor();
                break;
            }
        }
    }
    /*
    private boolean ProponerMantenerFigura() {
        System.out.println("Le gustaria pasa al objetivo MANTENER FIGURA: ");
        Scanner usuario = new Scanner (System.in);
        System.out.println("S/N");
    	String opcion = usuario.next();

        if(opcion == "S")
        {
            return true;
        }

        return false;
    }
     */

    public RutinaReforzada ReforzarRutina() {
        return null;
    }

    public void seTipoObjetivo(TipoObjetivo tipoObjetivo) {
        this.tipoObjetivo = tipoObjetivo;
    }

    public int getPesoInicial() {
        return pesoInicial;
    }

    public Rutina getRutina() {
        return rutina;
    }
}