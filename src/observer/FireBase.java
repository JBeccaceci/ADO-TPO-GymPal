package observer;

/**
 * 
 */
public class FireBase implements IFireBase
{
    public FireBase() {
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificacion " + mensaje);
    }
}