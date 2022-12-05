package mediciones;

import java.util.List;
import mediciones.Medicion;

public class MedicionesExternas 
{
	
	//valores de pesaje actual de usaurio
	public Medicion registrarMedicion() {
		
		Medicion medicionActual = new Medicion();
		medicionActual.setPeso(80);
		medicionActual.setFecha(null);
		medicionActual.setGrasaMuscular(20);
		medicionActual.setMasaMuscular(40);
	}
	
	//valores de pesaje ideal de usaurio
	public Medicion getMetidiconesIdeales(Medicion medicionActual) {

		double pesoActual = medicionActual.getPeso();
		double pesoIdeal = pesoActual * 0.95; 

		double GrasaActual = medicionActual.getGrasaMuscular();
		double GrasaIdeal = GrasaActual * 0.9; 

		double MasaActual = medicionActual.getGrasaMuscular();
		double MasaIdeal = MasaActual * 0.9;

		Medicion medicionIdeal = new Medicion();
		medicionIdeal.setPeso(pesoIdeal);
		medicionIdeal.setFecha(null);
		medicionIdeal.setGrasaMuscular(GrasaIdeal);
		medicionIdeal.setMasaMuscular(MasaIdeal);
	}
	

}
