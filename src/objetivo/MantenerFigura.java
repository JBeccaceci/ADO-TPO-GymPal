package objetivo;

import entrenamiento.Entrenamiento;
import rutina.Rutina;
import enums.ExigenciaMuscular;
import objetivo.TipoObjetivo;

import java.util.List;

public class MantenerFigura extends TipoObjetivo {

    public MantenerFigura() {
    }

    @Override
    public Rutina crearRutina(List<Entrenamiento> entrenamientos) {
        return new Rutina(entrenamientos, ExigenciaMuscular.Bajo, 80, 3);
    }

    public boolean VerificarCumplimiento(Obj obj) 
    {
        int pesoInicial = obj.getPesoInicial();
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