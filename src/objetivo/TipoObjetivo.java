package objetivo;

import mediciones.Medicion;
import rutina.Rutina;

import java.util.List;

/**
 * 
 */
public abstract class TipoObjetivo {

    public TipoObjetivo() { }

    public abstract Rutina crearRutina();

    public abstract boolean cumpleObjetivo(List<Medicion> mediciones);

    /*
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

     */

}