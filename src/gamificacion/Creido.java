package gamificacion;

import java.util.*;

import socio.Historial;
import socio.Socio;

public class Creido implements ITrofeo
{
    public String Nombre;
       
    public Creido(String nombre) 
    {
        this.Nombre = nombre;
    }

    public boolean OtorgarTrofeo(Socio socio) 
    {
    	Historial h = socio.getHistorial();
    	int cantidadPesajeMes = h.getCantidadPesajesMes();
    	
        if(cantidadPesajeMes > 3)
        {
            return true;
        }

        return false;
    }

}