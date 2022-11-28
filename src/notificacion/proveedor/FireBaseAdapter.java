package notificacion.proveedor;

import notificacion.IAdapterNotificationPush;
import notificacion.Notificacion;

public class FireBaseAdapter implements IAdapterNotificationPush {

    @Override
    public void notificar(Notificacion notificacion) {
        System.out.println("Notificacion " + notificacion.getMensaje());
    }
}
