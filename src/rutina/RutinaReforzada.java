package rutina;

import entrenamiento.Ejercicio;
import entrenamiento.Entrenamiento;
import enums.ExigenciaMuscular;

import java.util.*;


public class RutinaReforzada extends Rutina {
	private Rutina rutinaReforzada;

    public RutinaReforzada() {
    	this.rutinaReforzada = this;
		reforzar();
    }

	public void reforzar() {
		// En este metodo realizar dos for para modificar los valores
		// de los ejercicios
		// Utilizar la variable rutinaReforzada!!!!!!!
	}

    public void ComenzarEntrenamiento() {
    	//Serian una funcion de la app
    	//comenzar();
    	mostrarEntrenamiento();
    }
    
    public void FinalizarEntrenamiento() {
    	//Serian una funcion de la app
    	//finalizado();
    	System.out.println("Entrenamiento Finalizado");
    	//nmroEntrenamiento++;
    }
    
    public void Refuerzo(Ejercicio ejercicio) {
    	Scanner usuario;
    	usuario = new Scanner (System.in);
    	String opcion;
    
		System.out.println("�Desea Modificar el siguiente Ejercicio: " + ejercicio.getNombre() + "?"); 
		System.out.println("S/N");
		opcion = usuario.next();
		
		usuario.close();
		
		if(opcion == "S")
		{
			usuario = new Scanner (System.in);
			
			System.out.println("Ingrese las series: "); 
			int series = usuario.nextInt();
			System.out.println("Ingrese las repeticiones: "); 
			int repeticiones = usuario.nextInt();
			System.out.println("Ingrese el peso: "); 
			int peso = usuario.nextInt();
			
			usuario.close();
		
			ejercicio.modificarEjercicio(series, repeticiones, peso);
		}
		
		if(opcion != "S" & opcion != "N")
		{
			usuario = new Scanner (System.in);

			System.out.println("Por favor ingrese S o N: "); 
			System.out.println("S/N");
			opcion = usuario.next();
			
			usuario.close();
		}
    }
    
    private void mostrarEntrenamiento() {
    	List<Ejercicio> ejercicios =  Entrenamientos.get(nmroEntrenamiento).getEjercicios();
    	int largo = ejercicios.size() - 1;
    	
    	//mostramos los ejercicios que forman al entrenamiento del dia
    	for (int i = 0; i < largo; i++) 
    	{
    		System.out.println("Nombre: " + ejercicios.get(i).getNombre());
    	}
    }  
}