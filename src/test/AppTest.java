import socio.Socio;
import objetivo.Objetivo;
import enums.Sexo;
import objetivo.BajarPeso;
import objetivo.TipoObjetivo;
import rutina.Rutina;


public class AppTest {

	static TipoObjetivo tipo;
	static Objetivo obj;
	static Socio socio;
	
	public static void main(String[] args) 
	{
		generarSocio();
		generarRutina(socio);
		realizarEntrenamiento(obj.getRutina());
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
	
	public static void realizarEntrenamiento(Rutina r)
	{	
		r.comenzarEntrenamiento(r.getEntrenamientoActual());
		r.finalizarEntrenamiento(r.getEntrenamientoActual());
	}
	
	public static void reforzarRutina(Socio socio)
	{
		
	}
}
