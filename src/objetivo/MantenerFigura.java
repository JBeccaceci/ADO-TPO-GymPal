package objetivo;

import builder.EjerciciosBuilder;
import mediciones.IMedicionesExternas;
import mediciones.Medicion;
import rutina.Rutina;
import socio.Socio;
import enums.ExigenciaMuscular;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import rutina.Ejercicio;
import rutina.Entrenamiento;

public class MantenerFigura implements TipoObjetivo 
{
	//ESTE valor lo setea el coordinador o el usario
	private int rangoPeso = 20;

    public MantenerFigura() 
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
	    	double pesoUltimo = socio.getMediciones().get(ultimaMedicion).getPeso();
	    	double pesoInicial = socio.getMediciones().get(0).getPeso();
	    	
	    	if(pesoInicial == pesoUltimo)
	    	{
	    		return true;
	    	}
	    	
	    	if(pesoInicial > pesoUltimo)
	    	{
	    		if((pesoInicial - pesoUltimo) <= rangoPeso)
	    		{
	    			return true;
	    		}
	    		else
	    		{
	    			return false;
	    		}
	    	}
	    	
	    	if(pesoInicial < pesoUltimo)
	    	{
	    		if((pesoUltimo - pesoInicial) <= rangoPeso)
	    		{
	    			return true;
	    		}
	    		else
	    		{
	    			return false;
	    		}
	    	}
    	}
   
        return false;
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

	@Override
	public boolean ProponerMantenerFigura() {
		// TODO Auto-generated method stub
		return false;
	}
}