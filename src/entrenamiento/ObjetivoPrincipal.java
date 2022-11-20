package entrenamiento;

import java.util.*;

//TipoObjetivo
public interface ObjetivoPrincipal 
{
	public void cambiarObjetivo(ObjetivoPrincipal objetivo);
	public boolean verificarCumplimiento();
}