package gamificacion;

import socio.Historial;
import socio.Socio;

public class Creido implements Trofeo
{
    public String Nombre;
    public Date fecha;
       
    public Creido(String nombre, Date fecha) {
        this.Nombre = nombre;
        this.fecha = fecha;
    }

    public boolean cumpleTrofeo(Socio socio) {
    	Historial h = socio.getHistorial();
    	int cantidadPesajeMes = h.getCantidadPesajesMes();
        return cantidadPesajeMes > 3;
    }

}