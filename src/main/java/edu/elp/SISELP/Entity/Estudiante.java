package edu.elp.SISELP.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Estudiante extends Persona {

    @Column(name = "codigo",length = 10,nullable = false)
    private  String codigo;

    @Column(name = "serie",length = 8,nullable = false)
    private  String serie;

    @Column(name = "estado_egreso",length =5 ,nullable = false)
    private  String estadoEgreso; //sie s un egresado si, no

    @ManyToOne(optional = false,  fetch = FetchType.EAGER)
    private Escuela escuela;


    public Estudiante() {

    }

    public Estudiante(String codigo, String serie, String estadoEgreso, Escuela escuela) {
        this.codigo = codigo;
        this.serie = serie;
        this.estadoEgreso = estadoEgreso;
        this.escuela = escuela;
    }

    public Estudiante(long idpersona, String codigo, String serie, String estadoEgreso, Escuela escuela) {
        super(idpersona);
        this.codigo = codigo;
        this.serie = serie;
        this.estadoEgreso = estadoEgreso;
        this.escuela = escuela;
    }

    public Estudiante(String nombre, String apellido, String edad, String sexo, String dni, String direccion, String telefeno, Date fechaNacimiento, String codigo, String serie, String estadoEgreso, Escuela escuela) {
        super(nombre, apellido, edad, sexo, dni, direccion, telefeno, fechaNacimiento);
        this.codigo = codigo;
        this.serie = serie;
        this.estadoEgreso = estadoEgreso;
        this.escuela = escuela;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getEstadoEgreso() {
        return estadoEgreso;
    }

    public void setEstadoEgreso(String estadoEgreso) {
        this.estadoEgreso = estadoEgreso;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", serie='" + serie + '\'' +
                ", estadoEgreso='" + estadoEgreso + '\'' +
                '}';
    }
}
