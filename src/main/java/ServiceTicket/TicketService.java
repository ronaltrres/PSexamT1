package ServiceTicket;

import EntityTicket.Ticket;
import EntityTicket.Usuario;

public class TicketService {

    public String crearTicket(Ticket t, Usuario u) {

        if (t.getCodigo() == null) {
            return "Código inválido";
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
