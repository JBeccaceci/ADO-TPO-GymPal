package gamificacion;

import socio.Historial;
import socio.Socio;

public class Creido extends Trofeo
{
    public String Nombre;
       
    public Creido(String nombre) {
        this.Nombre = nombre;
    }

    public boolean OtorgarTrofeo(Socio socio) {
    	Historial h = socio.getHistorial();
    	int cantidadPesajeMes = h.getCantidadPesajesMes();
        return cantidadPesajeMes > 3;
    }

}