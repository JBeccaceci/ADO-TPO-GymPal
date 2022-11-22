package socio;

import entrenamiento.Objetivo;
import enums.Sexo;
import enums.TipoMedicion;
import gamificacion.Gamificacion;
import mediciones.Medicion;
import objetivo.TipoObjetivo;
import observer.Observados;

import java.util.*;


public class Socio extends Observados {
    private int edad;
    private Sexo sexo;
    private int peso;
    private int altura;
    private Objetivo objetivo;
    private List<Medicion> mediciones;
    private Historial historial;
    private Observados observados;
    private Gamificacion gami;

    public Socio(int edad, Sexo sexo, int altura, Objetivo objetivo) {
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.mediciones = new ArrayList<>();
        this.objetivo = objetivo;
        this.observados = new Observados();
        this.historial = new Historial();
        this.gami = new Gamificacion();

        init();
    }

    private void init() {
        mediciones.add(new Medicion(TipoMedicion.Altura, this.altura));
    }
    
    /**
     * Actualizamos una medicion, si existe ya esa medicion en la lista
     * debemos de verifica si se cumple o no el objetivo para pasar al siguiente.
     * @param medicion
     */
    public void actualizarMedicion(Medicion medicion) {
        Optional<Medicion> existeMedicion = mediciones.stream()
                .filter(m -> m.getTipo() == medicion.getTipo()).findAny();
        if (existeMedicion.isPresent()) 
        {
        	TipoObjetivo tipo = objetivo.getTipoObjetivo(); 
        	tipo.cumpleObjetivo(this.mediciones);
        }
    }

    public void OtorgarTrofeo() {

    }

    public void nuevaMedicion(Medicion medicion) {
        mediciones.add(medicion);
    }

    public void NuevaMedicion(Medicion medicion) {
        historial.SumarCantPesajesMes();
    }

    public int getPeso() {
        return this.peso;
    } 

    public int getAltura() {
        return this.altura;
    }

    public Sexo getSexo() {
        return this.sexo;
    }

    public List<Medicion> getMediciones() {
       return mediciones;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public Historial getHistorial() {
        return historial;
    }
}