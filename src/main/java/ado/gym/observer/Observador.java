package ado.gym.observer;

import java.util.*;

/**
 * 
 */
public interface Observador {

    /**
     * @param objetivo 
     * @return
     */
    public void objetivoCumplido(String objetivo);

    /**
     * @return
     */
    public void medicionCumplida();

    /**
     * @return
     */
    public void contanciaCumplida();

}