package ServiceTicket;

import EntityTicket.Ticket;
import EntityTicket.Usuario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class TicketServiceTest {

    @Test
    @DisplayName("No debe permitir más de 5 tickets abiertos")
    void noDebePermitirMasDe5Tickets() {

        // Arrange (preparar)
        Usuario usuarioMock = Mockito.mock(Usuario.class);
        Mockito.when(usuarioMock.getTicketsAbiertos()).thenReturn(5);

        Ticket t = new Ticket();
        t.setCodigo("T001");
        t.setPrioridad("media");

        TicketService service = new TicketService();


        String resultado = service.crearTicket(t, usuarioMock);


        assertEquals("Máximo de tickets abiertos alcanzado", resultado);
    }


}