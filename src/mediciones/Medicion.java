package mediciones;

import enums.TipoMedicion;
import enums.Clasificacion;

import java.util.*;


public class Medicion 
{
    private TipoMedicion tipo;
    private int valor;
    private Date fecha;
    private Clasificacion Clasificacion;

    public Medicion() 
    {

    }

    public int getValor()
    {
        return valor;
    }

    public TipoMedicion getTipo()
    {
        return tipo;
    }

    public Clasificacion getClasificacion()
    {
        return Clasificacion;
    }
}