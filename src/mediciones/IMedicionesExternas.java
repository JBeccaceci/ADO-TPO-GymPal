package mediciones;

import java.lang.reflect.Constructor;
import java.util.List;

import socio.Socio;

public interface IMedicionesExternas  
{
	public void registrarMedicionAdapter(List<Medicion> l);
	public Medicion getMetidiconesIdealesAdapter(Medicion medicionActual);
}
	
