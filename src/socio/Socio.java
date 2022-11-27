package socio;

import entrenamiento.Objetivo;
import enums.Sexo;
import enums.TipoMedicion;
import gamificacion.Creido;
import gamificacion.Dedicacion;
import gamificacion.Gamificacion;
import mediciones.Medicion;
import objetivo.TipoObjetivo;
import observer.Notificaciones;
import observer.Observados;

import java.util.*;
import java.util.stream.Collectors;


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
    private Notificaciones notificaciones;

    public Socio(int edad, Sexo sexo, int altura, Objetivo objetivo) {
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.mediciones = new ArrayList<>();
        this.objetivo = objetivo;
        this.observados = new Observados();
        this.historial = new Historial();
        this.gami = new Gamificacion();
        this.notificaciones = new Notificaciones();

        this.agregarObservador(gami);
        this.agregarObservador(notificaciones);

        this.objetivo.agregarObservador(gami);
        this.objetivo.agregarObservador(notificaciones);

        this.objetivo.getRutina().agregarObservador(gami);
        this.objetivo.getRutina().agregarObservador(notificaciones);

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
        if (existeMedicion.isPresent()) {
        	TipoObjetivo tipo = objetivo.getTipoObjetivo(); 
        	if (tipo.cumpleObjetivo(this.mediciones)) {
                this.notificarObservadores(new Dedicacion("Dedicacion"), "Objetivo Dedicacion cumplido");
            }
        }
    }

    public void OtorgarTrofeo() {

    }

    public void nuevaMedicion(Medicion medicion) {
        mediciones.add(medicion);

        //  Agregar filtro de fecha, validar que las 3 mediciones
        //  esten el el rango de 1 mes
        List<Medicion> pesoMediciones = mediciones
                .stream()
                .filter(m -> m.getTipo() == TipoMedicion.Peso).collect(Collectors.toList());
        if (pesoMediciones.size() > 3) {
            this.notificarObservadores(new Creido("Creido"), "Objetivo creido cumplido");
        }
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