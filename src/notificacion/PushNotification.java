package notificacion;

public class PushNotification implements IEstrategiaNotificacion {
    private IAdapterNotificationPush adapterNotificationPush;

    public PushNotification() {
    }

    public void setAdapterNotificationPush(IAdapterNotificationPush adapterNotificationPush) {
        this.adapterNotificationPush = adapterNotificationPush;
    }

    @Override
    public void notificar(Notificacion notificacion) {
        adapterNotificationPush.notificar(notificacion);
    }
}
