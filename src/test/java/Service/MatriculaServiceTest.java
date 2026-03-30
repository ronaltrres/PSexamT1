package Service;

import Entity.Matricula;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


class MatriculaServiceTest {

    @Test
    @DisplayName("Nombre inválido")
    void nombreInvalidoTest() {
        MatriculaService service = new MatriculaService();

        Matricula m = new Matricula();
        m.setCodigoMatricula("IN1234");
        m.setNombreEstudiante("");
        m.setCodigoCurso("");
        m.setCreditos(0);
        m.setFecha(LocalDate.now());

        String resultado = service.registrar(m);

        assertEquals("El nombre del estudiante debe tener al menos cuatro caracteres alfabéticos", resultado);
    }





}