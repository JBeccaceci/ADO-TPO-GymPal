import socio.Socio;
import objetivo.Objetivo;
import enums.Sexo;
import objetivo.BajarPeso;
import objetivo.TipoObjetivo;
import rutina.EntrenamientoCompletado;
import rutina.Rutina;


public class AppTest {

	static TipoObjetivo tipo;
	static Objetivo obj;
	static Socio socio;
	
	public static void main(String[] args) 
	{
		generarSocio();
		generarRutina(socio);
		//reforzarRutina(obj.getRutina());
		
		realizarEntrenamiento(obj.getRutina());
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
		EntrenamientoCompletado eC = new EntrenamientoCompletado();
		
		r.comenzarEntrenamiento(r.getEntrenamientoActual());
		eC = r.finalizarEntrenamiento(r.getEntrenamientoActual());
		r.reinciarNmroEntActual();
		r.guardarEC(eC);
		System.out.println("\n");
		System.out.println("**************************EC**************************" + "\n");
		eC.mostrarEntrenamiento();
	}
	
	public static void reforzarRutina(Rutina r)
	{
		r.refuerzo();
	}
}
