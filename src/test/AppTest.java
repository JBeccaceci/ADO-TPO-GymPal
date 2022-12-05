import socio.Socio;
import objetivo.Objetivo;
import objetivo.TipoObjetivo;
import objetivo.TonificarCuerpo;
import enums.Sexo;
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
		verificarCumpleObj(obj.getTipoObjetivo(), socio);
		
		realizarEntrenamiento(obj.getRutina());
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
	
	public static void verificarCumpleObj(TipoObjetivo tipo, Socio socio)
	{
		System.out.println("Verificamos el cumplimiento del objetivo....");
		
		if(tipo.cumpleObjetivo(socio) == true)
		{
			System.out.println("Cumpliste con el objetivo!!!");
			if(tipo.ProponerMantenerFigura() == true)
			{
				socio.getObjetivo().cambiarObjetivo(new MantenerFigura());
			}
		}
		else
		{
			System.out.println("No cumpliste con el objetivo...:c");
		}
	}
}
