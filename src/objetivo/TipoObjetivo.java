package objetivo;

import entrenamiento.Entrenamiento;
import rutina.Rutina;

import java.util.List;

/**
 * 
 */
public abstract class TipoObjetivo {

    public TipoObjetivo() {
    }

    public abstract Rutina crearRutina(List<Entrenamiento> entrenamientos);

    public boolean VerificarCumplimiento() 
    {
        return false;
    }

    private boolean ProponerMantenerFigura()
    {
        System.out.println("Le gustaria pasa al objetivo MANTENER FIGURA: ");
        Scanner usuario = new Scanner (System.in);
        System.out.println("S/N");
    	String opcion = usuario.next();

        if(opcion == "S")
        {
            return true;
        }

        return false;
    }

}