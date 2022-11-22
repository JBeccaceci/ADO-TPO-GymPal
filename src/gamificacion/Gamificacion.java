package gamificacion;

import java.util.List;


public class Gamificacion 
{
	private List<Trofeo> trofeos;
	
	public void agregarTrofeo(Trofeo t)
	{
		trofeos.add(t);
	}
	
	public void reomverTrofeo(Trofeo t)
	{
		trofeos.remove(t);
	}
	
}
