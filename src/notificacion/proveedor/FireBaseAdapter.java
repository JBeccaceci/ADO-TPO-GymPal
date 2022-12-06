package notificacion.proveedor;

import notificacion.IAdapterNotificationPush;
import notificacion.Notificacion;

public class FireBaseAdapter implements IAdapterNotificationPush 
{
    public void notificar(Notificacion notificacion) 
    {
        System.out.println("Mensaje para " + notificacion.getSocio() + ".");
        System.out.println(notificacion.getMensaje() + " " + notificacion.getTrofeo() + ".\n");
    }
}
