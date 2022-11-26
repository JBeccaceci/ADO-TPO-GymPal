package socio;

import entrenamiento.Entrenamiento;

import java.util.*;

/**
 * 
 */
public class Historial 
{
    private int EntrenamientosCompletados;
    private int CantidadPesjesMes;
    private int mesUltimoPesaje;

    public void guardarEntrenamientosCompletados()
    {
        EntrenamientosCompletados++;
    }

    public void SumarCantPesajesMes()
    {
        if(MesActual() != mesUltimoPesaje)
        {
            CantidadPesjesMes = 1;
            Date date = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            mesUltimoPesaje = calendar.get(Calendar.MONTH);
        }
        else
        {
            CantidadPesjesMes++;
        }
    }
    
    private int MesActual()
    {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        return calendar.get(Calendar.MONTH);
    }

    public int getCantidadPesajesMes()
    {
        return CantidadPesjesMes;
    }

    public int getEntrenamientosCompletados()
    {
        return EntrenamientosCompletados;
    }
} 