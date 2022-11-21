package objetivo;

import entrenamiento.Entrenamiento;
import rutina.Rutina;
import socio.Socio;
import enums.ExigenciaMuscular;
import enums.Sexo;
import objetivo.TipoObjetivo;
import entrenamiento.Objetivo;

import java.util.List;
import java.util.Scanner;


public class BajarPeso implements TipoObjetivo {

    public BajarPeso() 
    {
        super();
    }

    
    public Rutina crearRutina(List<Entrenamiento> entrenamientos) 
    {
        return new Rutina(entrenamientos, ExigenciaMuscular.Medio, 80, 3);
    }

    public boolean VerificarCumplimiento(Objetivo obj, Socio socio) 
    {
        int peso = obj.ObtenerPeso(socio);
        int pesoIdeal = CalcularPesoIdeal(peso, socio.getAltura(), socio.getSexo());

        if(peso != pesoIdeal)
        {
            return false;
        }

        return true;
    }

    public int CalcularPesoIdeal(int peso , int altura, Sexo sexo)
    {

        return 0;
    }
}