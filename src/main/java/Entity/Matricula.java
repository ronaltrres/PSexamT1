package Entity;

import java.time.LocalDate;

public class Matricula {


    private String codigoMatricula;
    private String nombreEstudiante;
    private String codigoCurso;
    private int creditos;
    private LocalDate fecha;

    public Matricula(LocalDate fecha, int creditos, String codigoCurso, String nombreEstudiante, String codigoMatricula) {
        this.fecha = fecha;
        this.creditos = creditos;
        this.codigoCurso = codigoCurso;
        this.nombreEstudiante = nombreEstudiante;
        this.codigoMatricula = codigoMatricula;
    }

    public Matricula() {

    }


    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(String codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }






}
