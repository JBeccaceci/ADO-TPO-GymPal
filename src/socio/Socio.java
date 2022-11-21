package socio;

import entrenamiento.Objetivo;
import enums.Sexo;
import mediciones.Medicion;
import observer.Observados;

import java.util.*;


public class Socio extends Observados 
{
    private int edad;
    private Sexo sexo;
    private int peso;
    private int altura;
    private Objetivo objetivo;
    private List<Medicion> medicion;
    private Historial historial;

    public Socio(int edad, Sexo sexo, int altura, Objetivo objetivo, Historial historial) 
    {
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.medicion = new ArrayList<>();
        this.objetivo = objetivo;
        this.historial = historial;
    }

    public void ActualizarDatos(Socio Cliente) 
    {

    }

    public void NuevaMedicion(Medicion medicion) 
    {
        historial.SumarCantPesajesMes();
    }

    public int getPeso()
    {
        return this.peso;
    } 

    public int getAltura()
    {
        return this.altura;
    }

    public Sexo getSexo()
    {
        return this.sexo;
    }

    public List<Medicion> getMediciones()
    {
       return medicion;
    }

    public Objetivo getObjetivo()
    {
        return objetivo;
    }

    public Historial getHistorial()
    {
        return historial;
    }
}