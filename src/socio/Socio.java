package socio;

import enums.Sexo;
import gamificacion.Creido;
import gamificacion.Dedicacion;
import mediciones.IMedicionesExternas;
import mediciones.Medicion;
import mediciones.MedicionesExternas;
import notificacion.Notificacion;
import objetivo.TipoObjetivo;
import gamificacion.IObservable;
import gamificacion.ItrofeoObservador;

import java.util.*;
import java.util.stream.Collectors;

import objetivo.Objetivo;


public class Socio implements IObservable 
{
    private int edad;
    private Sexo sexo;
    private int peso;
    private float altura;
    private Objetivo objetivo;
    private IMedicionesExternas AdapterM;
    private List<Medicion> mediciones;
    private List<ItrofeoObservador> observadores;

    public Socio(int edad, Sexo sexo, float altura, Objetivo objetivo)
    {
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.mediciones = new ArrayList<Medicion>();
        this.objetivo = objetivo;
        this.observadores = new ArrayList<ItrofeoObservador>();
        this.AdapterM = (IMedicionesExternas) new MedicionesExternas();
    }
    
    public void ingresarMediciones()
    {
    	AdapterM.registrarMedicionAdapter(mediciones);
    }
    
	public void agregarObservador(ItrofeoObservador obs) 
	{
		
	}
	
	public void eliminarObservador(ItrofeoObservador obs) 
	{
		
	}
	
	public void notificartrofeo() 
	{
		
	}
	
    public int getPeso() 
    {
        return this.peso;
    } 
    
    public int getEdad() 
    {
        return this.edad;
    } 

    public float getAltura() 
    {
        return this.altura;
    }

    public Sexo getSexo() 
    {
        return this.sexo;
    }
    
    public IMedicionesExternas getAdapter()
    {
    	return this.AdapterM;
    }

    public List<Medicion> getMediciones() 
    {
       return mediciones;
    }

    public Objetivo getObjetivo() 
    {
        return objetivo;
    }
    
    public void setObjetivo(Objetivo obj) 
    {
        this.objetivo = obj;
    }
}