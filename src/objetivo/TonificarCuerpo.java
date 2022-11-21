package objetivo;

import entrenamiento.Entrenamiento;
import entrenamiento.Objetivo;
import rutina.Rutina;
import socio.Socio;
import enums.ExigenciaMuscular;
import enums.Sexo;
import objetivo.TipoObjetivo;

import java.util.List;

public class TonificarCuerpo implements TipoObjetivo {

    public TonificarCuerpo() {
    }

    public Rutina crearRutina(List<Entrenamiento> entrenamientos)
    {
        return new Rutina(entrenamientos, ExigenciaMuscular.Bajo, 1, 3);
    }

    public boolean VerificarCumplimiento(Objetivo obj, Socio socio) 
    {
        int pesoInicial = obj.ObtenerPeso(socio);
        int pesoIdeal = CalcularPesoIdeal(pesoInicial , socio.getAltura(), socio.getSexo());

        if(pesoInicial != pesoIdeal)
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