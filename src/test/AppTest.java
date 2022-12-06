import socio.Socio;
import objetivo.Objetivo;
import objetivo.TipoObjetivo;
import objetivo.TonificarCuerpo;
import enums.Sexo;
import gamificacion.Constancia;
import gamificacion.Creido;
import gamificacion.Dedicacion;
import gamificacion.ItrofeoObservador;
import notificacion.IEstrategiaNotificacion;
import notificacion.Notificacion;
import notificacion.Notificador;
import notificacion.PushNotification;
import notificacion.proveedor.FireBaseAdapter;
import objetivo.BajarPeso;
import objetivo.MantenerFigura;
import rutina.EntrenamientoCompletado;
import rutina.Rutina;


public class AppTest {

	static Objetivo obj;
	static Socio socio;
	
	public static void main(String[] args) 
	{
		Notificador notificador = new Notificador();
		IEstrategiaNotificacion estrategia = new PushNotification(new FireBaseAdapter());
		notificador.cambiarEstrategiaNotificacion(estrategia);
		
		//SOCIO
		generarSocio();
		generarRutina(socio);
		
		//RUTINA
		reforzarRutina(socio.getObjetivo().getRutina());
		//realizarEntrenamiento(socio.getObjetivo().getRutina());
		
		
		//OBJETIVO
		//ingresamos 3 veces las mediciones para lograr el trofeo creido
		socio.ingresarMediciones();
		socio.ingresarMediciones();
		socio.ingresarMediciones();
		verificarCumpleObj(socio);
		
		//realizamos el entrenamiento 4 veces porque seria las 4 semanas, teniendo solo un entrenamiento a la semana (por eso cumple con el trofeo constancia)
		realizarEntrenamiento(socio.getObjetivo().getRutina());
		//realizarEntrenamiento(socio.getObjetivo().getRutina());
		//realizarEntrenamiento(socio.getObjetivo().getRutina());
		//realizarEntrenamiento(socio.getObjetivo().getRutina());
		
		//TROFEOS-OBSERVER
		controlTrofeoCreido(socio, notificador);
		controlTrofeoConstancia(socio.getObjetivo().getRutina(), notificador);
		controlTrofeoDedicacion(socio.getObjetivo(), notificador);
	}
	
	public static void generarSocio()
	{
		//null seria el objetivo que luego lo seteamos en generarRutina()
		socio = new Socio(25, Sexo.Masculino, 1.7f, null, "tomas01234");
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
	
	public static void controlTrofeoCreido(Socio socio, Notificador notificador)
	{
		Creido creido = new Creido("creido");
		socio.agregarObservador(creido);
		
		Notificacion noti = new Notificacion();
		noti.setMensaje("Ganaste el trofeo");
		noti.setSocio(socio.getCuenta().getNombreCuenta());
		noti.setTrofeo(creido.getNombre());
		
		
		if(creido.cumpleTrofeo(socio) == true)
		{
			socio.notificarObservadores(notificador, noti);
		}
		
		socio.eliminarObservador(creido);
	}
	
	public static void controlTrofeoConstancia(Rutina r, Notificador notificador)
	{
		Constancia constancia = new Constancia("constancia");
		r.agregarObservador(constancia);
		
		Notificacion noti = new Notificacion();
		noti.setMensaje("Ganaste el trofeo");
		noti.setSocio(socio.getCuenta().getNombreCuenta());
		noti.setTrofeo(constancia.getNombre());
		
		if(constancia.cumpleTrofeo(r) == true)
		{
			r.notificarObservadores(notificador, noti);
		}
		
		r.eliminarObservador(constancia);
	}
	
	public static void controlTrofeoDedicacion(Objetivo obj, Notificador notificador)
	{
		Dedicacion dedicacion = new Dedicacion("dedicacion");
		obj.agregarObservador(dedicacion);
		
		Notificacion noti = new Notificacion();
		noti.setMensaje("Ganaste el trofeo");
		noti.setSocio(socio.getCuenta().getNombreCuenta());
		noti.setTrofeo(dedicacion.getNombre());
		
		if(dedicacion.cumpleTrofeo(obj) == true)
		{
			obj.notificarObservadores(notificador, noti);
		}
		
		obj.eliminarObservador(dedicacion);
	}
}
