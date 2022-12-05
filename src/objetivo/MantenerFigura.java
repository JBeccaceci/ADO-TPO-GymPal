package objetivo;

import builder.EjerciciosBuilder;
import mediciones.Medicion;
import rutina.Rutina;
import enums.ExigenciaMuscular;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import rutina.Ejercicio;
import rutina.Entrenamiento;

public class MantenerFigura implements TipoObjetivo 
{
	//ESTE valor lo setea el coordinador o el usario
	private int rangoPeso = 100;

    public MantenerFigura() {
        
    }

    public Rutina crearRutina() {
        return this.generarRutina();
    }

    public boolean cumpleObjetivo(List<Medicion> mediciones) {
    	 int pesoInicial = 0;
    	 
         return pesoInicial >= rangoPeso - 5 & pesoInicial <= rangoPeso + 5;
    }

    private Rutina generarRutina() {
        List<Ejercicio> ejercicioList = EjerciciosBuilder.obtenerEjercicios().getEjercicioList();

        //  Generamos un entrenamiento en base al criterio del objetivo
        Entrenamiento entrenamiento = new Entrenamiento();
        ejercicioList.stream()
                .filter(e -> e.getNivelAerobico() >= 2 && e.getNivelAerobico() <= 4).collect(Collectors.toList())
                .forEach(entrenamiento::agregarEjercicio);

        List<Entrenamiento> entrenamientoList = Collections.singletonList(entrenamiento);
        return new Rutina(entrenamientoList, ExigenciaMuscular.Medio, 80, 3);
    }
    
    public void setRangoPeso(int valor)
    {
    	this.rangoPeso = valor;
    }
}