package EntityTicket;

import java.time.LocalDate;

public class Ticket {

    private String codigo;
    private String prioridad;
    private String usuario;
    private String tecnico;
    private boolean resuelto;
    private LocalDate fechaCreacion;

    public Ticket(String codigo, String prioridad, String usuario, String tecnico, boolean resuelto, LocalDate fechaCreacion) {
        this.codigo = codigo;
        this.prioridad = prioridad;
        this.usuario = usuario;
        this.tecnico = tecnico;
        this.resuelto = resuelto;
        this.fechaCreacion = fechaCreacion;
    }

    public Ticket() {

    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean isResuelto() {
        return resuelto;
    }

    public void setResuelto(boolean resuelto) {
        this.resuelto = resuelto;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }



}
