import entrenamiento.Objetivo;
import socio.Socio;
import enums.Sexo;
import objetivo.BajarPeso;
import objetivo.TipoObjetivo;
import rutina.Rutina;
import rutina.RutinaReforzada;

public class AppTest {

	static TipoObjetivo tipo = new BajarPeso();
	static Objetivo obj = new Objetivo(tipo);
	static Socio socio = new Socio(25, Sexo.Masculino, 1.7f, obj);
	
	public static void main(String[] args) 
	{
		generarSocio();
		generarRutina(socio);
		comenzarEntrenamiento(socio);
		reforzarRutina(socio);
	}
	
	public static void generarSocio()
	{
		socio = new Socio(25, Sexo.Masculino, 1.7f, null);
	}
	
	public static void generarRutina(Socio socio)
	{
		tipo = new BajarPeso();
		//La rutina se genera cuando se selecciona el objetivo
		obj = new Objetivo(tipo);
		socio.setObjetivo(obj);
	}
	
	public static void comenzarEntrenamiento(Socio socio)
	{
		Rutina r = obj.getRutina();
		r.comenzarEntrenamiento(socio);
		r.finalizarEntrenamiento(socio);
	}
	
	public static void reforzarRutina(Socio socio)
	{
		Objetivo obj = socio.getObjetivo();
		TipoObjetivo tipo = obj.getTipoObjetivo();
		if(tipo.cumpleObjetivo(socio.getMediciones()) == true)
		{
			RutinaReforzada nueva_rutina = new RutinaReforzada();
			nueva_rutina.reforzar(obj.getRutina());
			//es un set rutina
			obj.ReforzarRutina(nueva_rutina);
			socio.setObjetivo(obj);
		}
	}
}
