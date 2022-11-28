package gamificacion;

import observer.IObservador;
import notificacion.Notificacion;

import java.util.List;


public class Gamificacion implements IObservador 
{
	private List<TipoTrofeo> trofeos;
	
	//eliminarTrofeo() no hace falta, porque nunca vamos a eliminar o modificar alguno de esta lista.
	//una vez agregado 
	private void agregarTrofeo(Trofeo t) 
	{
		trofeos.add(t);
	}

	public void OtorgarTrofeo(Trofeo trofeo, Socio socio)
	{
		if(trofeo.cumpleTrofeo(socio) == true)
		{
			agregarTrofeo(trofeo);
		}
	}

	public void notificarOtorgarTrofeo()
	{

	}

	public void notificar(String mensaje)
	{

	}
}
