import entrenamiento.Objetivo;
import socio.Socio;
import enums.Sexo;
import objetivo.BajarPeso;
import objetivo.TipoObjetivo;
import rutina.Rutina;

public class AppTest {

	static TipoObjetivo tipo = new BajarPeso();
	static Objetivo obj = new Objetivo(tipo);
	static Socio socio = new Socio(25, Sexo.Masculino, 1.7f, obj);
	
	public static void main(String[] args) 
	{
		generarRutina();

	}
	
	public static void generarRutina()
	{
		tipo = new BajarPeso();
		obj = new Objetivo(tipo);
		socio = new Socio(25, Sexo.Masculino, 1.7f, obj);
	}
	
	public static void comenzarEntrenamiento()
	{
		Rutina r = obj.getRutina();
	}
}
