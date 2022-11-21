package objetivo;

import builder.EjerciciosBuilder;
import entrenamiento.Ejercicio;
import entrenamiento.Entrenamiento;
import mediciones.Medicion;
import rutina.Rutina;
import enums.ExigenciaMuscular;
import enums.Sexo;
import objetivo.TipoObjetivo;
import entrenamiento.Objetivo;

import java.util.*;
import java.util.stream.Collectors;

import static enums.Clasificacion.Actual;
import static enums.TipoMedicion.Peso;

/**
 * 
 */
public class BajarPeso extends TipoObjetivo {
    private static final int PESO_IDEAL = 60;

    public BajarPeso() { }

    @Override
    public Rutina crearRutina() {
        return this.generarRutina();
    }

    @Override
    public boolean cumpleObjetivo(List<Medicion> mediciones) {
        int pesoActual = 0;
        for (Medicion m : mediciones) {
            if (m.getClasificacion() == Actual && m.getTipo() == Peso) {
                pesoActual = m.getValor();
                break;
            }
        }
        return pesoActual <= PESO_IDEAL;
    }

    private Rutina generarRutina() {
        List<Ejercicio> ejercicioList = EjerciciosBuilder.obtenerEjercicios().getEjercicioList();

        //  Generamos un entrenamiento en base al criterio del objetivo
        Entrenamiento entrenamiento = new Entrenamiento();
        ejercicioList.stream()
                .filter(e -> e.getNivelAerobico() >= 3).collect(Collectors.toList())
                .forEach(entrenamiento::agregarEjercicio);

        List<Entrenamiento> entrenamientoList = Collections.singletonList(entrenamiento);
        return new Rutina(entrenamientoList, ExigenciaMuscular.Medio, 80, 3);
    }

}