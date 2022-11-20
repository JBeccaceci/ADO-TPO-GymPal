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
    private int altura;
    private Objetivo objetivo;
    private List<Medicion> medicion;

    public Socio(int edad, Sexo sexo, int altura, Objetivo objetivo) 
    {
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.medicion = new ArrayList<>();
        this.objetivo = this.objetivo;
    }

    public void ActualizarDatos(Socio Cliente) {

    }

    public void OtorgarTrofeo() {

    }

    public void NuevaMedicion(Medicion medicion) {

    }

}