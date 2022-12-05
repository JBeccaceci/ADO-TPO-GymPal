package rutina;

import java.util.ArrayList;
import java.util.List;

import rutina.EjercicioCompletado;

public class Entrenamiento {

    private List<Ejercicio> ejercicios;
    private int nmroEj;

    public Entrenamiento() {
        super();
        this.ejercicios = new ArrayList<>();
        this.nmroEj = 0;
    }

    public void agregarEjercicio(Ejercicio ejercicio) {
        this.ejercicios.add(ejercicio);
    }

    public void eliminarEjercicio(final Ejercicio ejericio) {
        this.ejercicios.removeIf(e -> e.getNombre().equals(ejericio.getNombre()));
    }

    public void comenzarEjercicio(Ejercicio j) 
    {
    	System.out.println("Ejercicio a realizar: " + "\n");
    	j.mostrarEjercicio();
    	System.out.println("\n");
    }

    public EjercicioCompletado finalizarEjercicio(Ejercicio j)
    {
    	EjercicioCompletado jc = new EjercicioCompletado();
    	//el nmro random da 2 y 1
    	int r = (int) ((Math.random() * (7 - 1)) + 1);
    	//para verificar que hizo todo bien r =1
    	//int r = 1;
    	jc.crearEjercicioCompletado(j.getNombre(), j.getSeries()/r, j.getRepeticiones()/r, j.getPesoAsignado()/r);
    	nmroEj++;
    	
    	return jc;
    }
    
    public void mostrarEntrenamiento()
    {	
    	int largo = ejercicios.size();
    	
    	for(int i = 0; i < largo; i++)
    	{
    		System.out.println("Ejercicio: " + ejercicios.get(i).getNombre());
    	}
    	
    	System.out.println("\n");
    	
    }
    
    public List<Ejercicio> getEjercicios()
    {
    	return ejercicios;
    }
    
    public Ejercicio getEjActual()
    {
    	return ejercicios.get(nmroEj);
    }
    
    public void reinciarNmroEjActual()
    {
    	this.nmroEj = 0;
    }
}