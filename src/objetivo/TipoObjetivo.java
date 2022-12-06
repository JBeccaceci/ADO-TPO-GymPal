package objetivo;

import rutina.Rutina;
import socio.Socio;

public interface TipoObjetivo 
{
    public abstract Rutina crearRutina();
    public abstract boolean cumpleObjetivo(Socio socio);
    public boolean ProponerMantenerFigura();
}