package Service;

import Entity.Matricula;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


class MatriculaServiceTest {

    @Test
    @DisplayName("validation of codigo")
    void matriculaServiceTest() {
        MatriculaService service = new MatriculaService();

        Matricula m = new Matricula();
        m.setCodigoMatricula("2344565615");

        String resultado = service.registrar(m);

        assertEquals("El nombre del estudiante debe tener al menos cuatro caracteres alfabéticos", resultado);
    }






}