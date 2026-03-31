package EntityTicket;

public class Usuario {

    private String nombre;
    private int ticketsAbiertos;

    public Usuario(int ticketsAbiertos, String nombre) {
        this.ticketsAbiertos = ticketsAbiertos;
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTicketsAbiertos() {
        return ticketsAbiertos;
    }

    public void setTicketsAbiertos(int ticketsAbiertos) {
        this.ticketsAbiertos = ticketsAbiertos;
    }

}
