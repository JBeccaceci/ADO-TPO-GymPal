import socio.Socio;
import objetivo.Objetivo;
import objetivo.TipoObjetivo;
import objetivo.TonificarCuerpo;
import enums.Sexo;
import gamificacion.Constancia;
import gamificacion.Creido;
import gamificacion.Dedicacion;
import gamificacion.ItrofeoObservador;
import objetivo.BajarPeso;
import objetivo.MantenerFigura;
import rutina.EntrenamientoCompletado;
import rutina.Rutina;


public class AppTest {

	static Objetivo obj;
	static Socio socio;
	
	public static void main(String[] args) 
	{
		//SOCIO
		generarSocio();
		generarRutina(socio);
		
		//RUTINA
		//reforzarRutina(obj.getRutina());
		//realizarEntrenamiento(obj.getRutina());
		
		//realizarEntrenamiento(obj.getRutina());
		
		//OBJETIVO
		socio.ingresarMediciones();
		socio.ingresarMediciones();
		//socio.ingresarMediciones();
		verificarCumpleObj(socio);
		
		//realizamos el entrenamiento 4 veces porque seria las 4 semanas, teniendo solo un entrenamiento a la semana (por eso cumple con el trofeo constancia)
		realizarEntrenamiento(socio.getObjetivo().getRutina());
		realizarEntrenamiento(socio.getObjetivo().getRutina());
		realizarEntrenamiento(socio.getObjetivo().getRutina());
		//realizarEntrenamiento(socio.getObjetivo().getRutina());
		
		//TROFEOS-OBSERVER
		controlTrofeoCreido(socio);
		controlTrofeoConstancia(socio.getObjetivo().getRutina());
		controlTrofeoDedicacion(socio.getObjetivo());
	}
	
	public static void generarSocio()
	{
		//null seria el objetivo que luego lo seteamos en generarRutina()
		socio = new Socio(25, Sexo.Masculino, 1.7f, null);
	}
	
	public static void generarRutina(Socio socio)
	{
		//La rutina se genera cuando se selecciona el objetivo
		obj = new Objetivo();
		obj.cambiarObjetivo(new BajarPeso());
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
		//eC.mostrarEntrenamiento();
		r.mostrarEntrenamientosCompletados();
	}
	
	public static void reforzarRutina(Rutina r)
	{
		r.refuerzo();
	}
	
	public static void verificarCumpleObj(Socio socio)
	{
		System.out.println("Verificamos el cumplimiento del objetivo....");
		
		
		if(socio.getObjetivo().verificarCumpleObjetivo(socio) == true)
		{
			System.out.println("Cumpliste con el objetivo!!!");
			if(socio.getObjetivo().getTipoObjetivo().ProponerMantenerFigura() == true)
			{
				socio.getObjetivo().cambiarObjetivo(new MantenerFigura());
			}
		}
		else
		{
			System.out.println("No cumpliste con el objetivo...:c");
		}
	}
	
	public static void controlTrofeoCreido(Socio socio)
	{
		Creido creido = new Creido("creido");
		socio.agregarObservador(creido);
		
		if(creido.cumpleTrofeo(socio) == true)
		{
			socio.notificarObservadores();
		}
		
		socio.eliminarObservador(creido);
	}
	
	public static void controlTrofeoConstancia(Rutina r)
	{
		Constancia constancia = new Constancia("constancia");
		r.agregarObservador(constancia);
		
		if(constancia.cumpleTrofeo(r) == true)
		{
			r.notificarObservadores();
		}
		
		r.eliminarObservador(constancia);
	}
	
	public static void controlTrofeoDedicacion(Objetivo obj)
	{
		Dedicacion dedicacion = new Dedicacion("dedicacion");
		obj.agregarObservador(dedicacion);
		
		if(dedicacion.cumpleTrofeo(obj) == true)
		{
			obj.notificarObservadores();
		}
		
		obj.eliminarObservador(dedicacion);
	}
}
