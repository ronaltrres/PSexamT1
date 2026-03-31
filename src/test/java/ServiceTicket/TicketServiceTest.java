package ServiceTicket;

import EntityTicket.Ticket;
import EntityTicket.Usuario;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class TicketServiceTest {

    @Test
    void noDebePermitirMasDe5Tickets() {


        Usuario usuarioMock = Mockito.mock(Usuario.class) ;
        Mockito.when(usuarioMock.getTicketsAbiertos()).thenReturn(5);


        Ticket t = new Ticket();
        t.setCodigo("t001");
        t.setPrioridad("prueba");

        TicketService service = new TicketService();

        String resultado = service.crearTicket(t, usuarioMock);

        assertEquals("Máximo de tickets abiertos alcanzado", resultado);
    }
}