import socio.Socio;
import objetivo.Objetivo;
import objetivo.TipoObjetivo;
import enums.Sexo;
import objetivo.BajarPeso;
import rutina.EntrenamientoCompletado;
import rutina.Rutina;


public class AppTest {

	static Objetivo obj;
	static Socio socio;
	
	public static void main(String[] args) 
	{
		generarSocio();
		generarRutina(socio);
		//reforzarRutina(obj.getRutina());
		
		realizarEntrenamiento(obj.getRutina());
		verificarCumpleObj(obj.getTipoObjetivo(), socio);
	}
	
	public static void generarSocio()
	{
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
		eC.mostrarEntrenamiento();
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
			tipo.ProponerMantenerFigura();
		}
		else
		{
			System.out.println("No cumpliste con el objetivo...:c");
		}
	}
}
