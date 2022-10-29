package ado.gym.socio;

import ado.gym.entrenamiento.Objetivo;
import ado.gym.enums.Sexo;
import ado.gym.objetivo.TipoObjetivo;
import ado.gym.socio.mediciones.Medicion;
import ado.gym.observer.Observados;

import java.util.*;

/**
 * 
 */
public class Socio extends Observados {
    private int edad;
    private Sexo sexo;
    private int altura;
    private Objetivo objetivo;
    private List<Medicion> medicion;

    public Socio(int edad, Sexo sexo, int altura, TipoObjetivo tipoObjetivo) {
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.medicion = new ArrayList<>();
        this.objetivo = new Objetivo(tipoObjetivo);
    }

    public void ActualizarDatos(Socio Cliente) {

    }

    public void OtorgarTrofeo() {

    }

    public void NuevaMedicion(Medicion medicion) {

    }

}