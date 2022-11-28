package gamificacion;

import socio.Historial;
import socio.Socio;

public class Creido implements Trofeo
{
    public String Nombre;
       
    public Creido(String nombre) {
        this.Nombre = nombre;
    }

    public boolean cumpleTrofeo(Socio socio) {
    	Historial h = socio.getHistorial();
    	int cantidadPesajeMes = h.getCantidadPesajesMes();
        return cantidadPesajeMes > 3;
    }

}