package mediciones;
 
import java.util.*;
 
public class Medicion 
{
    private double Peso;
    private Date fecha;
    private double GrasaMuscular;
    private double MasaMuscular;
 
    //constructor
    public Medicion(double Peso, Date fecha, double GrasaMuscular, double MasaMuscular ) {
        this.Peso = Peso;
        this.fecha = new Date();
        this.GrasaMuscular = GrasaMuscular;
        this.MasaMuscular = MasaMuscular;
    }
 
    //set
    public void setPeso(double Peso) {
        this.Peso = Peso;
    }
 
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
 
    public void setGrasaMuscular(double GrasaMuscular) {
        this.GrasaMuscular = GrasaMuscular;
    }
 
    public void setMasaMuscular(double MasaMuscular) {
        this.MasaMuscular = MasaMuscular;
    }
    
    //get
    public double getPeso() {
        return Peso;
    }
 
    public Date getFecha() {
        return fecha;
    }
 
    public double getGrasaMuscular() {
        return GrasaMuscular;
    }
 
    public double getMasaMuscular() {
        return MasaMuscular;
    }
 
}