package mediciones;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Medicion 
{
    private double Peso;
    private LocalDateTime fecha;
    private double GrasaCorporal;
    private double MasaMuscular;

    //constructor
    public Medicion(double Peso, double GrasaMuscular, double MasaMuscular ) 
    {
    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		LocalDateTime f = LocalDateTime.now();  
		//System.out.println(dtf.format(fecha));
    	
        this.Peso = Peso;
        this.fecha = f;
        this.GrasaCorporal = GrasaMuscular;
        this.MasaMuscular = MasaMuscular;
    }


    //set
    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setGrasaCorporal(double GrasaMuscular) {
        this.GrasaCorporal = GrasaMuscular;
    }

    public void setMasaMuscular(double MasaMuscular) {
        this.MasaMuscular = MasaMuscular;
    }
    
    //get
    public double getPeso() {
        return Peso;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public double getGrasaCorporal() {
        return GrasaCorporal;
    }

    public double getMasaMuscular() {
        return MasaMuscular;
    }


}