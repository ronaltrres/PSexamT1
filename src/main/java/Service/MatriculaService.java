package Service;

import Entity.Matricula;
import java.time.LocalDate;

public class MatriculaService {

    private static final String PATRON_CODIGO = "[A-Z]{2}\\d{4}";
    private static final String PATRON_NOMBRE = "[A-Za-z]{4,}";
    private static final String PATRON_CURSO = "[A-Za-z0-9]{5}";

    public String registrar(Matricula m) {

        if (m.getCodigoMatricula() == null || m.getNombreEstudiante() == null ||
                m.getCodigoCurso() == null || m.getFecha() == null) {
            return "Debe ingresar todos los datos requeridos";
        }

        if (!cumplePatron(m.getCodigoMatricula(), PATRON_CODIGO)) {
            return "Ingrese un código de matrícula válido";
        }

        if (!cumplePatron(m.getNombreEstudiante(), PATRON_NOMBRE)) {
            return "El nombre del estudiante debe tener al menos cuatro caracteres alfabéticos";
        }

        if (!cumplePatron(m.getCodigoCurso(), PATRON_CURSO)) {
            return "Ingrese un código de curso válido";
        }

        if (m.getCreditos() < 1 || m.getCreditos() > 6) {
            return "La cantidad de créditos debe estar entre 1 y 6";
        }

        if (m.getFecha().isAfter(LocalDate.now())) {
            return "Ingrese una fecha de matrícula válida";
        }

        return "La matrícula ha sido registrada correctamente";
    }

    private boolean cumplePatron(String valor, String patron) {
        return valor != null && valor.matches(patron);
    }
}