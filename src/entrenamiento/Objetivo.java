package entrenamiento;

import rutina.Rutina;
import rutina.RutinaReforzada;
import objetivo.TipoObjetivo;
import observer.Observados;

public class Objetivo extends Observados 
{

	private TipoObjetivo tipoObjetivo;
    private Rutina rutina;
    private int pesoInicial;

    public Objetivo(TipoObjetivo tipoObjetivo, Rutina rutina, Socio socio)
    {
    	this.tipoObjetivo = tipoObjetivo;
    	this.rutina = rutina;
        this.pesoInicial = ObtenerPesoInicial(socio);

    }
    
    private int ObtenerPesoInicial(Socio socio)
    {
        List<Medicion>  mediciones = socio.getMediciones();
        int largo = mediciones.size() - 1;

        for(int i = 0; i > largo; i++ )
        {
            Medicion m = mediciones.get(i);
            if(m.getClasificacion() == Actual )
            {
                if(m.getTipo() == Peso)
                {
                    return m.valor;
                }
            }
        }

        return -1;
    }

    public Rutina CrearRutina() 
    {
        return null;
    }

    public RutinaReforzada ReforzarRutina() 
    {
        return null;
    }

    public void seTipoObjetivo(TipoObjetivo tipoObjetivo) 
    {
        this.tipoObjetivo = tipoObjetivo;
    }

    public int getPesoInicial()
    {
        return pesoInicial;
    }
}