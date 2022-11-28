package observer;

import socio.Socio;

public class Notificacion {
    private Socio socio;
    private String mensaje;

    public Notificacion() {
    }

    public Notificacion(Socio socio, String mensaje) {
        this.socio = socio;
        this.mensaje = mensaje;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
