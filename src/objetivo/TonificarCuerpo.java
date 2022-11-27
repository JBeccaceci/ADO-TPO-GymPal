package objetivo;

import builder.EjerciciosBuilder;
import entrenamiento.Ejercicio;
import entrenamiento.Entrenamiento;
import mediciones.Medicion;
import rutina.Rutina;
import enums.ExigenciaMuscular;

import static enums.Clasificacion.Actual;
import static enums.TipoMedicion.Altura;
import static enums.TipoMedicion.GrasaCorporal;
import static enums.TipoMedicion.MasaMuscular;
import static enums.TipoMedicion.Peso;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TonificarCuerpo extends TipoObjetivo 
{
    public TonificarCuerpo() {
    	
    }

    public Rutina crearRutina() {
        return this.generarRutina();
    }

    public boolean cumpleObjetivo(List<Medicion> mediciones) {
    	 boolean controlGrasaCorporalIdeal = false, controlMasaMuscularIdeal = false;
    	 int grasaCorporalActual = 0, masaMuscularActual = 0;
         for (Medicion m : mediciones) 
         {
             if (m.getClasificacion() == Actual && m.getTipo() == GrasaCorporal) {
            	 grasaCorporalActual = m.getValor();
            	 controlGrasaCorporalIdeal = m.getME().GrasaCorporalIdeal() == grasaCorporalActual;             
             }
             
             if (m.getClasificacion() == Actual && m.getTipo() == MasaMuscular) {
            	 masaMuscularActual = m.getValor(); 
            	 controlMasaMuscularIdeal = m.getME().MasaMuscularlIdeal() == masaMuscularActual;
             }
             
             if(grasaCorporalActual != 0 & masaMuscularActual != 0) {
            	 return controlGrasaCorporalIdeal && controlMasaMuscularIdeal;
             }
         }
         
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