package mediciones;

import enums.Clasificacion;
import enums.TipoMedicion;
import enums.Clasificacion;

import java.util.*;


public class Medicion {
    private TipoMedicion tipo;
    private int valor;
    private Date fecha;
    private Clasificacion clasificacion;

    public Medicion() {

    }

    public Medicion(TipoMedicion tipo, int valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.fecha = new Date();
    }

    public void setTipo(TipoMedicion tipo) {
        this.tipo = tipo;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
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
        return clasificacion;
    }
}