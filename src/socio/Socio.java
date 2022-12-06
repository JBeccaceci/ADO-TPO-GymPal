package socio;

import enums.Sexo;
import gamificacion.Creido;
import gamificacion.Dedicacion;
import mediciones.IMedicionesExternas;
import mediciones.Medicion;
import mediciones.MedicionesExternas;
import notificacion.Notificacion;
import notificacion.Notificador;
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
    private Cuenta cuenta;
    private IMedicionesExternas AdapterM;
    private List<Medicion> mediciones;
    private List<ItrofeoObservador> observadores;

    public Socio(int edad, Sexo sexo, float altura, Objetivo objetivo, String cuenta)
    {
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.mediciones = new ArrayList<Medicion>();
        this.objetivo = objetivo;
        this.observadores = new ArrayList<ItrofeoObservador>();
        this.AdapterM = (IMedicionesExternas) new MedicionesExternas();
        this.cuenta = new Cuenta(cuenta);
    }
    
    public void ingresarMediciones()
    {
    	AdapterM.registrarMedicionAdapter(mediciones);
    }
    
	public void agregarObservador(ItrofeoObservador obs) 
	{
		observadores.add(obs);
	}
	
	public void eliminarObservador(ItrofeoObservador obs) 
	{
		observadores.remove(obs);
	}
	
	public void notificarObservadores(Notificador notificador, Notificacion notificacion) 
	{
		for(ItrofeoObservador observador: observadores)
		{
			observador.notificarTrofeo(notificador, notificacion);
		}
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
    
    public Cuenta getCuenta()
    {
    	return cuenta;
    }
    
    public void setObjetivo(Objetivo obj) 
    {
        this.objetivo = obj;
    }
}