package edu.elp.SISELP.Entity;

import javax.persistence.*;

@Entity
@Table(name = " FichaMatricula")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class FichaMatricula  extends  Persona{

    @Column(name = "idFechaMatricula",length = 12,nullable = false)
    private  String idFechaMatricula;

    @Column(name = "semestre",length = 20,nullable = false)
    private  String semestre;

    @Column(name = "anioacademico",length = 20,nullable = false)
    private  String anioacademico;

    @Column(name = "fmatricula",length = 20,nullable = false)
    private  String fmatricula;

    @JoinColumn(referencedColumnName = "idestudinate")
    private Estudiante estudiante;

    @JoinColumn(referencedColumnName = "idasignatura")
    private Asignatura asignatura;

    public FichaMatricula() {

    }

    public FichaMatricula(String idFechaMatricula, String semestre, String anioacademico, String fmatricula, Estudiante estudiante, Asignatura asignatura) {
        this.idFechaMatricula = idFechaMatricula;
        this.semestre = semestre;
        this.anioacademico = anioacademico;
        this.fmatricula = fmatricula;
        this.estudiante = estudiante;
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "FichaMatricula{" +
                "idFechaMatricula='" + idFechaMatricula + '\'' +
                ", semestre='" + semestre + '\'' +
                ", anioacademico='" + anioacademico + '\'' +
                ", fmatricula='" + fmatricula + '\'' +
                ", estudiante=" + estudiante +
                ", asignatura=" + asignatura +
                '}';
    }
}
