package mediciones;
 
import java.util.List;
import mediciones.Medicion;
 
public class MedicionesExternas 
{
    
    //valores de pesaje actual de usaurio
    public Medicion registrarMedicion() {
        
        Medicion medicionActual = new Medicion(80, null, 20, 40);
        
        return medicionActual;
    }
    
    //valores de pesaje ideal de usaurio
    public Medicion getMetidiconesIdeales(Medicion medicionActual) {
 
        double pesoActual = medicionActual.getPeso();
        double pesoIdeal = pesoActual * 0.95; 
 
        double GrasaActual = medicionActual.getGrasaMuscular();
        double GrasaIdeal = GrasaActual * 0.9; 
 
        double MasaActual = medicionActual.getGrasaMuscular();
        double MasaIdeal = MasaActual * 0.9;
 
        Medicion medicionIdeal = new Medicion(pesoIdeal, null, GrasaIdeal, MasaIdeal);
        
        return medicionIdeal;
    }
    
 
}