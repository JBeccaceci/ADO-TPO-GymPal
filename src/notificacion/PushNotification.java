package notificacion;



public class PushNotification implements IEstrategiaNotificacion 
{
    private IAdapterNotificationPush adapter;

    
    public PushNotification(IAdapterNotificationPush adapter)
    {
    	super();
    	this.adapter = adapter;
    }
    
	public void setAdapter(IAdapterNotificationPush adapter) 
    {
        this.adapter = adapter;
    }
    
    public void notificar(Notificacion notificacion) 
    {
    	adapter.notificar(notificacion);
    }
}
