package entrenamiento;

import java.util.ArrayList;
import java.util.List;

public class Entrenamiento {

    private List<Ejercicio> ejercicios;
    private int nmroEjercicio = 0;

    public Entrenamiento() {
        super();
        this.ejercicios = new ArrayList<>();
    }

    public void agregarEjercicio(Ejercicio ejercicio) {
        this.ejercicios.add(ejercicio);
    }

    public void eliminarEjercicio(final Ejercicio ejericio) {
        this.ejercicios.removeIf(e -> e.getNombre().equals(ejericio.getNombre()));
    }

    public void comenzarEjercicio(Ejercicio ejercicio) {
    	//Serian una funcion de la app
    	//comenzar();
    	mostrarEjercicio();
    }

    public void finalizarEjercicio(Ejercicio ejercicio) {
    	//Serian una funcion de la app
    	//finalizado();
    	System.out.println("Ejercicio Finalizado");
    	//Deberia haber un registro de las repeticiones que se hicieron, para luego realizar el control de si esta cumpliendo o no
    	ejercicios.get(nmroEjercicio).reiniciarRepeticionesCompletadas();
        //el nmro este sirve para pasar de ej a ej.
    	nmroEjercicio++; 
    }
    
    private void mostrarEjercicio()
    {	
    	System.out.println("Nombre: " + ejercicios.get(nmroEjercicio).getNombre());
    	System.out.println("Series: " + ejercicios.get(nmroEjercicio).getSeries());
    	System.out.println("Repeteciones: " + ejercicios.get(nmroEjercicio).getRepeticiones());    	
    	System.out.println("Peso: " + ejercicios.get(nmroEjercicio).getPesoAsignado());
    }
    
    
    public List<Ejercicio> getEjercicios()
    {
    	return ejercicios;
    }

}