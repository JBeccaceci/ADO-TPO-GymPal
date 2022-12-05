package rutina;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class EntrenamientoCompletado 
{
	private LocalDateTime fecha;
	private List<EjercicioCompletado> ejercicios;
	
	public void crearEntrenamientoCompletado()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		LocalDateTime f = LocalDateTime.now();  
		//System.out.println(dtf.format(fecha));
		
		this.fecha = f;
	}
	
	public void agregarEjercicio(EjercicioCompletado j)
	{
		ejercicios.add(j);
	}
	
}
