package gamificacion;

import observer.IObservador;
import notificacion.Notificacion;
import gamificacion.Trofeo;
import socio.Socio;

import java.util.List;


public class Gamificacion implements IObservador 
{
	private List<Trofeo> trofeos;
	
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

	@Override
	public void objetivoCumplido(Trofeo trofeo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notificar(Notificacion notificacion) {
		// TODO Auto-generated method stub
		
	}
}
