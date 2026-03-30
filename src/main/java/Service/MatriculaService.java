package Service;

import Entity.Matricula;

import java.time.LocalDate;

class MatriculaService {

    public String registrar(Matricula m) {

        if (m.getCodigoMatricula() == null || m.getNombreEstudiante() == null ||
                m.getCodigoCurso() == null || m.getFecha() == null) {
            return "Debe ingresar todos los datos requeridos";
        }

        if (!m.getCodigoMatricula().matches("[A-Z]{2}\\d{4}")) {
            return "Ingrese un código de matrícula válido";
        }

        if (!m.getNombreEstudiante().matches("[A-Za-z]{4,}")) {
            return "El nombre del estudiante debe tener al menos cuatro caracteres alfabéticos";
        }

        if (!m.getCodigoCurso().matches("[A-Za-z0-9]{5}")) {
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
}