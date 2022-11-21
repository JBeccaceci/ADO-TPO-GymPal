package objetivo;

import entrenamiento.Entrenamiento;
import rutina.Rutina;
import enums.ExigenciaMuscular;
import enums.Sexo;
import objetivo.TipoObjetivo;
import entrenamiento.Objetivo;

import java.util.List;
import java.util.Scanner;

/**
 * 
 */
public class BajarPeso extends TipoObjetivo {

    public BajarPeso() 
    {
        super();
    }

    @Override
    public Rutina crearRutina(List<Entrenamiento> entrenamientos) 
    {
        return new Rutina(entrenamientos, ExigenciaMuscular.Medio, 80, 3);
    }

    public boolean VerificarCumplimiento(Obj obj) 
    {
        int peso = obj.ObtenerPeso();
        int pesoIdeal = CalcularPesoIdeal(pesoInicial , socio.getAltura(), socio.getSexo());

        if(pesoInicial != pesoIdeal)
        {
            return false;
        }

        return true;
    }

    private int CalcularPesoIdeal(Objetivo obj , int altura, Sexo sexo)
    {
        int pesoInicial = obj.getPesoInicial();

        return 0;
    }
}