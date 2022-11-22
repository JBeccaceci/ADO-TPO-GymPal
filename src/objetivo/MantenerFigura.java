package objetivo;

import builder.EjerciciosBuilder;
import entrenamiento.Ejercicio;
import entrenamiento.Entrenamiento;
import mediciones.Medicion;
import rutina.Rutina;
import enums.ExigenciaMuscular;

import static enums.TipoMedicion.Peso;
import static enums.Clasificacion.Inicial;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MantenerFigura extends TipoObjetivo 
{
	//ESTE valor lo setea el coordinador o el usario
	private int rangoPeso = 100;

    public MantenerFigura() {
        
    }

    public Rutina crearRutina() 
    {
        return this.generarRutina();
    }

    public boolean cumpleObjetivo(List<Medicion> mediciones) 
    {
    	 int pesoInicial = 0;
         for (Medicion m : mediciones) {
             if (m.getClasificacion() == Inicial && m.getTipo() == Peso) {
            	 pesoInicial = m.getValor();
                 break;
             }
         }
         return pesoInicial >= rangoPeso - 5 & pesoInicial <= rangoPeso + 5;
    }

    private Rutina generarRutina() 
    {
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