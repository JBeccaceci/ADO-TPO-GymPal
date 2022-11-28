package notificacion;

import gamificacion.Trofeo;

public class Notificacion {
    private Trofeo trofeo;
    private String mensaje;

    public Notificacion() {
    }

    public Notificacion(Trofeo trofeo, String mensaje) {
        this.trofeo = trofeo;
        this.mensaje = mensaje;
    }

    public Trofeo getTrofeo() {
        return trofeo;
    }

    public void setTrofeo(Trofeo trofeo) {
        this.trofeo = trofeo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
