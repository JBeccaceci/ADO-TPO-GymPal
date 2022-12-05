package objetivo;

import builder.EjerciciosBuilder;
import mediciones.Medicion;
import rutina.Rutina;
import enums.ExigenciaMuscular;

import java.util.*;
import java.util.stream.Collectors;

import rutina.Ejercicio;
import rutina.Entrenamiento;

import static enums.Clasificacion.Actual;
import static enums.TipoMedicion.GrasaCorporal;
import static enums.TipoMedicion.MasaMuscular;
import static enums.TipoMedicion.Peso;
import static enums.TipoMedicion.Altura;


public class BajarPeso implements TipoObjetivo {

    public BajarPeso() { }

    public Rutina crearRutina() {
    	   List<Ejercicio> ejercicioList = EjerciciosBuilder.obtenerEjercicios().getEjercicioList();

           //  Generamos un entrenamiento en base al criterio del objetivo
           Entrenamiento entrenamiento = new Entrenamiento();
           ejercicioList.stream()
                   .filter(e -> e.getNivelAerobico() >= 3).collect(Collectors.toList())
                   .forEach(entrenamiento::agregarEjercicio);

           List<Entrenamiento> entrenamientoList = Collections.singletonList(entrenamiento);
           return new Rutina(entrenamientoList, ExigenciaMuscular.Medio, 80, 3);
    }

    public boolean cumpleObjetivo(List<Medicion> mediciones) {
        int pesoActual = 0;
        for (Medicion m : mediciones) 
        {
            if (m.getClasificacion() == Actual && m.getTipo() == Peso) 
            {
            	pesoActual = m.getValor();
            	//EL CONTROL O CALCULO DE IDEAL se encarga las mediciones externas
                return pesoActual == m.getME().PesoIdeal();
            }
        }
        return false;
    }
    
    //Una vez que se cumplio el objetivo se deberia sugerir al Socio si quiere pasar a Mantener Figura.
	public boolean ProponerMantenerFigura() 
	{
	        System.out.println("Le gustaria pasa al objetivo MANTENER FIGURA: ");
	        Scanner usuario = new Scanner (System.in);
	        System.out.println("S/N");
	    	String opcion = usuario.next();

	        if(opcion == "S")
	        {
	            return true;
	        }

	        return false;
	}


}