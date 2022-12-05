package mediciones;

import java.util.List;
import mediciones.Medicion;
import socio.Socio;
import mediciones.IMedicionesExternas;

public class MedicionesExternas implements IMedicionesExternas
{
	
	//valores de pesaje actual de usaurio
	public void registrarMedicionAdapter(List<Medicion> l) 
	{
		Medicion medicionActual = new Medicion(80, 20, 40);
		guardarMedicionesSocio(l, medicionActual);
		
	}
	
	//valores de pesaje ideal de usaurio
	public Medicion getMetidiconesIdealesAdapter(Medicion medicionActual) 
	{

		double pesoActual = medicionActual.getPeso();
		double pesoIdeal = pesoActual * 0.95; 

		double GrasaActual = medicionActual.getGrasaMuscular();
		double GrasaIdeal = GrasaActual * 0.9; 

		double MasaActual = medicionActual.getGrasaMuscular();
		double MasaIdeal = MasaActual * 0.9;

		Medicion medicionIdeal = new Medicion(pesoIdeal, GrasaIdeal, MasaIdeal);
		return medicionIdeal;
	}
	
	private void guardarMedicionesSocio(List<Medicion> l, Medicion m)
	{
		l.add(m);
	}
}
