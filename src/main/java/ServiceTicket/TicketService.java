package ServiceTicket;

import EntityTicket.Ticket;
import EntityTicket.Usuario;

import java.util.ArrayList;
import java.util.List;

public class TicketService {

    public String crearTicket(Ticket t, Usuario u) {

        List<Ticket> listaTickets = new ArrayList<>();

        for (Ticket ticket : listaTickets) {
            if (ticket.getCodigo().equals(t.getCodigo())) {
                return "El código ya existe";
            }
        }

        if (!esPrioridadValida(t.getPrioridad())) {
            return "Prioridad inválida";
        }

        if (u == null) {
            return "Usuario no registrado";
        }

        if (u.getTicketsAbiertos() >= 5) {
            return "Máximo de tickets abiertos alcanzado";
        }

        t.setTecnico(asignarTecnico());
        u.setTicketsAbiertos(u.getTicketsAbiertos() + 1);

        return "Ticket creado correctamente";
    }

    private boolean esPrioridadValida(String p) {
        return p.equals("alta") || p.equals("media") || p.equals("baja");
    }

    private String asignarTecnico() {
        int num;
        num=(int)(Math.random()*11);
        return "tecnico" + num;

    }

}
