package objetivo;

import builder.EjerciciosBuilder;
import rutina.Rutina;
import socio.Socio;
import enums.ExigenciaMuscular;

import java.util.*;
import java.util.stream.Collectors;

import rutina.Ejercicio;
import rutina.Entrenamiento;


public class BajarPeso implements TipoObjetivo {

    public BajarPeso() 
    {
    	
    }

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

    public boolean cumpleObjetivo(Socio socio) 
    {
    	int ultimaMedicion = socio.getMediciones().size() - 1;
    	
    	if(ultimaMedicion != -1)
    	{
	    	double peso = socio.getMediciones().get(ultimaMedicion).getPeso();
	    	double pesoIdeal = socio.getAdapter().getMetidiconesIdealesAdapter(socio.getMediciones().get(ultimaMedicion)).getPeso();
	    	
	    	if(peso == pesoIdeal)
	    	{
	    		return true;
	    	}
    	}
    	
        return false;
    }
    
    //Una vez que se cumplio el objetivo se deberia sugerir al Socio si quiere pasar a Mantener Figura.
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