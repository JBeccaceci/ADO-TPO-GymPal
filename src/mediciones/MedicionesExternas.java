package mediciones;

import java.util.List;
import mediciones.Medicion;
import socio.Socio;
import mediciones.IMedicionesExternas;

public class MedicionesExternas implements IMedicionesExternas
{
	
	private float ideal = 1;
	
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
		double pesoIdeal = pesoActual * ideal; 

		double GrasaActual = medicionActual.getGrasaCorporal();
		double GrasaIdeal = GrasaActual * ideal; 

		double MasaActual = medicionActual.getMasaMuscular();
		double MasaIdeal = MasaActual * ideal;

		Medicion medicionIdeal = new Medicion(pesoIdeal, GrasaIdeal, MasaIdeal);
		return medicionIdeal;
	}
	
	private void guardarMedicionesSocio(List<Medicion> l, Medicion m)
	{
		l.add(m);
	}
}
