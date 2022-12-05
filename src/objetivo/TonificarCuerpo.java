package objetivo;

import builder.EjerciciosBuilder;
import rutina.Rutina;
import socio.Socio;
import enums.ExigenciaMuscular;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import rutina.Ejercicio;
import rutina.Entrenamiento;

public class TonificarCuerpo implements TipoObjetivo 
{
    public TonificarCuerpo() 
    {
    	
    }

    public Rutina crearRutina() {
        return this.generarRutina();
    }

    public boolean cumpleObjetivo(Socio socio) 
    {
    	int ultimaMedicion = socio.getMediciones().size() -1;
    	
    	if(ultimaMedicion != -1)
    	{
	    	double masaMuscular = socio.getMediciones().get(ultimaMedicion).getMasaMuscular();
	    	double grasaCorporal = socio.getMediciones().get(ultimaMedicion).getGrasaCorporal();
	    	
	    	double masaMuscularIdeal = socio.getAdapter().getMetidiconesIdealesAdapter(socio.getMediciones().get(ultimaMedicion)).getMasaMuscular();
	    	double grasaCorporalIdeal = socio.getAdapter().getMetidiconesIdealesAdapter(socio.getMediciones().get(ultimaMedicion)).getGrasaCorporal();
	    	
	    	if(masaMuscular == masaMuscularIdeal & grasaCorporal == grasaCorporalIdeal)
	    	{
	    		return true;
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
    	System.out.println("¿Le gustaria pasar al objetivo MANTENER FIGURA?: ");
	    Scanner usuario = new Scanner (System.in);
	    System.out.println("s/n");
	    String opcion = usuario.next();
	    	
	    while(opcion.equals("s") == false & opcion.equals("n") == false)
	    {
	    	System.out.println("Porfavor ingrese s o n: ");
	 	    opcion = usuario.next();
	    }
	    	
	    usuario.close();
	    	
	    if(opcion.equals("s") == true)
        {
        	System.out.println("El tipo de objetivo SE cambia a MANTENER FIGURA: ");
            return true;
        }
        else
        {
        	System.out.println("El tipo de objetivo NO se cambia a MANTENER FIGURA: ");
        	return false;
        }
	}
}