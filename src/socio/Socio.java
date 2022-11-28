package socio;

import entrenamiento.Objetivo;
import enums.Sexo;
import enums.TipoMedicion;
import gamificacion.Gamificacion;
import mediciones.Medicion;
import objetivo.TipoObjetivo;
import observer.Notificador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Socio {
    private int edad;
    private Sexo sexo;
    private int peso;
    private int altura;
    private Objetivo objetivo;
    private List<Medicion> mediciones;
    private Historial historial;
    private Gamificacion gami;
    private Notificador notificador;

    public Socio(int edad, Sexo sexo, int altura, Objetivo objetivo) {
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.mediciones = new ArrayList<>();
        this.objetivo = objetivo;
        this.historial = new Historial();
        this.gami = new Gamificacion();
        this.notificador = new Notificador();

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