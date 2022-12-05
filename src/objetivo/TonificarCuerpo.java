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
    public TonificarCuerpo() {
    	
    }

    public Rutina crearRutina() {
        return this.generarRutina();
    }

    public boolean cumpleObjetivo(Socio socio) 
    {
    	int ultimaMedicion = socio.getMediciones().size();
    	
    	if(ultimaMedicion != 0)
    	{
	    	double masaMuscular = socio.getMediciones().get(ultimaMedicion).getPeso();
	    	double grasaCorporal = socio.getMediciones().get(ultimaMedicion).getPeso();
	    	
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
        System.out.println("Le gustaria pasa al objetivo MANTENER FIGURA: ");
        Scanner usuario = new Scanner (System.in);
        System.out.println("S/N");
    	String opcion = usuario.next();
    	
    	while(opcion != "S" || opcion != "N")
    	{
    		System.out.println("Porfavor ingrese S o N: ");
    		System.out.println("S/N");
 	    	opcion = usuario.next();
    	}
    	
    	usuario.close();
    	
        if(opcion == "S")
        {
            return true;
        }
        else
        {
        	return false;
        }
	}
}