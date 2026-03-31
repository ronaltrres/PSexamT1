package Service;

import Entity.Matricula;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


public class MatriculaServiceTest {

    @Test
    void testMatriculaCorrecta() {
        Matricula m = new Matricula();
        m.setCodigoMatricula("IN1234");
        m.setNombreEstudiante("Juan");
        m.setCodigoCurso("CS101");
        m.setCreditos(3);
        m.setFecha(LocalDate.now());

        MatriculaService service = new MatriculaService();
        String resultado = service.registrar(m);

        assertEquals("La matrícula ha sido registrada correctamente", resultado);
    }

    @Test
    void testCodigoInvalido() {
        Matricula m = new Matricula();
        m.setCodigoMatricula("123456");
        m.setNombreEstudiante("Juan");
        m.setCodigoCurso("CS101");
        m.setCreditos(3);
        m.setFecha(LocalDate.now());

        MatriculaService service = new MatriculaService();
        String resultado = service.registrar(m);

        assertEquals("Ingrese un código de matrícula válido", resultado);
    }

    @Test
    void testNombreInvalido() {
        Matricula m = new Matricula();
        m.setCodigoMatricula("IN1234");
        m.setNombreEstudiante("J1");
        m.setCodigoCurso("CS101");
        m.setCreditos(3);
        m.setFecha(LocalDate.now());

        MatriculaService service = new MatriculaService();
        String resultado = service.registrar(m);

        assertEquals("El nombre del estudiante debe tener al menos cuatro caracteres alfabéticos", resultado);
    }

    @Test
    void testCreditosInvalidos() {
        Matricula m = new Matricula();
        m.setCodigoMatricula("IN1234");
        m.setNombreEstudiante("Juan");
        m.setCodigoCurso("CS101");
        m.setCreditos(7);
        m.setFecha(LocalDate.now());

        MatriculaService service = new MatriculaService();
        String resultado = service.registrar(m);

        assertEquals("La cantidad de créditos debe estar entre 1 y 6", resultado);
    }
}