package mediciones;

import java.lang.reflect.Constructor;

public abstract class IMedicionesExternas extends MedicionesExternas
{

	public Medicion registrarMedicionAdapter() {
		return registrarMedicion();
	}
	
	public double getMetidiconesIdealesAdapter() {
		return getMetidiconesIdeales();
	}

}
	
