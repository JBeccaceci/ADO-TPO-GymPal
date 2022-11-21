package observer;

import java.util.*;


public interface IObservador 
{
    public void objetivoCumplido(String objetivo);
    public void medicionCumplida();
    public void contanciaCumplida();
	public void Notificar();

}