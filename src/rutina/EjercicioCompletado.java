package rutina;

public class EjercicioCompletado 
{
	
	private String nombre;
	private int series;
	private int repeticiones;
	private int pesoAsignado;
	
	
	public void crearEjercicioCompletado(String n, int s, int r, int p)
	{
		this.nombre = n;
		this.series = s;
		this.repeticiones = r;
		this.pesoAsignado = p;
	}
	
	
	public void mostrarEjC()
	{
		System.out.println("Nombre: " + this.nombre);
    	System.out.println("Series: " + this.series);
    	System.out.println("Repeteciones: " + this.repeticiones);    	
    	System.out.println("Peso: " + this.pesoAsignado);
	}
}
