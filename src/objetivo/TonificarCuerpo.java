package objetivo;

import builder.EjerciciosBuilder;
import entrenamiento.Ejercicio;
import entrenamiento.Entrenamiento;
import entrenamiento.Objetivo;
import enums.Sexo;
import mediciones.Medicion;
import rutina.Rutina;
import enums.ExigenciaMuscular;
import objetivo.TipoObjetivo;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TonificarCuerpo extends TipoObjetivo {

    public TonificarCuerpo() { }

    @Override
    public Rutina crearRutina() {
        return this.generarRutina();
    }

    @Override
    public boolean cumpleObjetivo(List<Medicion> mediciones) {
        return false;
    }

    private Rutina generarRutina() {
        List<Ejercicio> ejercicioList = EjerciciosBuilder.obtenerEjercicios().getEjercicioList();

        //  Generamos un entrenamiento en base al criterio del objetivo
        Entrenamiento entrenamiento = new Entrenamiento();
        ejercicioList.stream()
                .filter(e -> e.getNivelAerobico() <= 4 && e.getExigenciaMuscular() == ExigenciaMuscular.Alto)
                .collect(Collectors.toList())
                .forEach(entrenamiento::agregarEjercicio);

        List<Entrenamiento> entrenamientoList = Collections.singletonList(entrenamiento);
        return new Rutina(entrenamientoList, ExigenciaMuscular.Medio, 80, 3);
    }

    /*
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
     */

}