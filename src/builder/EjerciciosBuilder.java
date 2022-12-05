package builder;

import enums.ExigenciaMuscular;
import enums.GruposMusculares;

import java.util.ArrayList;
import java.util.List;

import rutina.Ejercicio;

public class EjerciciosBuilder {
    private static EjerciciosBuilder ejerciciosBuilder = null;

    private List<Ejercicio> ejercicioList;

    public EjerciciosBuilder() {
        ejercicioList = new ArrayList<>();
        init();
    }

    private void init() {
        ejercicioList.add(new Ejercicio("Banco Plano", GruposMusculares.Pecho, ExigenciaMuscular.Alto, 4, 12, 3, 10));
        ejercicioList.add(new Ejercicio("Banco Inclinado", GruposMusculares.Pecho, ExigenciaMuscular.Alto, 4, 12, 3, 10));

        ejercicioList.add(new Ejercicio("Dominada", GruposMusculares.Espalda, ExigenciaMuscular.Alto, 4, 8, 2, 0));
        ejercicioList.add(new Ejercicio("Sentadilla", GruposMusculares.Piernas, ExigenciaMuscular.Alto, 4, 8, 2, 15));
        ejercicioList.add(new Ejercicio("Press Militar con Barra", GruposMusculares.Hombros, ExigenciaMuscular.Alto, 4, 8, 2, 10));
        ejercicioList.add(new Ejercicio("Bicep con barra Scout", GruposMusculares.Brazos, ExigenciaMuscular.Alto, 4, 5, 8, 10));

        ejercicioList.add(new Ejercicio("Bicicleta", GruposMusculares.Piernas, ExigenciaMuscular.Bajo, 4, 5, 8, 0));
        ejercicioList.add(new Ejercicio("Cinta", GruposMusculares.Piernas, ExigenciaMuscular.Bajo, 4, 5, 7, 0));
    }

    public List<Ejercicio> getEjercicioList() {
        return ejercicioList;
    }

    public static EjerciciosBuilder obtenerEjercicios() {
        if (ejerciciosBuilder == null) {
            ejerciciosBuilder = new EjerciciosBuilder();
        }
        return ejerciciosBuilder;
    }
}
