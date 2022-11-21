package gamificacion;

import java.util.*;

public class Creido 
{
    public String Nombre;
       
    public Creido(String nombre) 
    {
        this.Nombre = nombre;
    }

    public boolean OtorgarTrofeo(Socio socio) 
    {
        if(socio.historial.getCantidadPesajesMes() > 3)
        {
            return true;
        }

        return false;
    }

}