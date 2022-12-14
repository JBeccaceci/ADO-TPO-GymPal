package gamificacion;

import notificacion.Notificacion;
import notificacion.Notificador;
import rutina.Rutina;

public class Constancia extends ItrofeoObservador
{
    private String Nombre;

    public Constancia(String nombre) {
        this.Nombre = nombre;
    }

    public void notificarTrofeo(Notificador notificador, Notificacion notificacion) 
    {
    	notificador.enviar(notificacion);
		//System.out.println("Ganaste el trofeo " + Nombre + ".");
	}
    
    public boolean cumpleTrofeo(Rutina r) 
    {
    	int largoRutina = r.getEntrenamientos().size() * 4;
    	int largoEntrenamientoCompletado = r.getECs().size();
    	
    	//el largo de la rutina se multiplica por 4, por la cantidad de semandas del mes
    	//System.out.println("A: " + largoRutina + "  B: " + largoEntrenamientoCompletado);
    	return largoRutina == largoEntrenamientoCompletado;
    }
    
    public String getNombre()
    {
    	return this.Nombre;
    }
}