package mediciones;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import mediciones.Medicion;
import socio.Socio;
import mediciones.IMedicionesExternas;

public class MedicionesExternas implements IMedicionesExternas
{
	private float ideal = 1;
	private int cantPesajesMes = 0;
	private int mesUltimaMedicion;
	
	//valores de pesaje actual de usaurio
	public void registrarMedicionAdapter(List<Medicion> l) 
	{
		Medicion medicionActual = new Medicion(80, 20, 40);
		guardarMedicionesSocio(l, medicionActual);
		actualizarCantPesajes();
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
	
	public int getCantPesajesMes()
	{
		return this.cantPesajesMes;
	}
	
	private void actualizarCantPesajes()
	{
		if(mesUltimaMedicion != mesActual())
		{
			cantPesajesMes = 1;
			mesUltimaMedicion = mesActual();
		}
		else
		{
			cantPesajesMes++;
		}
	}
	
	private int mesActual()
	{
		Date date= new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int mesActual = cal.get(Calendar.MONTH);
		
		return mesActual;
	}
}
