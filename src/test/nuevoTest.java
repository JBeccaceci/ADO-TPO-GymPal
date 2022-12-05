import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import rutina.EntrenamientoCompletado;


public class nuevoTest {

	public static void main(String[] args) 
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		LocalDateTime fecha = LocalDateTime.now();  
		
		//System.out.println(dtf.format(fecha));  		
		
		//da 2 y 1 
		int r = (int)  ((Math.random() * (3 - 1)) + 1);
		
		System.out.println(4/r);
		
		List<String> entrenamientosCompletados = new ArrayList<>();
		entrenamientosCompletados.add("a");
		
		System.out.println(entrenamientosCompletados.size() - 1);

	}

}
