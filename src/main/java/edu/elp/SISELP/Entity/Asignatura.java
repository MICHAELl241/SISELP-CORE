package edu.elp.SISELP.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Asignatura ")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Asignatura  extends Persona{

    @Column(name = "idAsignatura",length = 12,nullable = false)
    private  String idAsignatura;

    @Column(name = "sigla",length = 20,nullable = false)
    private  String sigla;

    @Column(name = "denominacion",length = 20,nullable = false)
    private  String denominacion;

    @Column(name = "creditos",length = 20,nullable = false)
    private  String creditos;

    @Column(name = "hteoricas",length = 20,nullable = false)
    private  String hteoricas;

    @Column(name = "hpeoricas",length = 20,nullable = false)
    private  String hpeoricas;

    public Asignatura() {

    }

    public Asignatura(String idAsignatura, String sigla, String denominacion, String creditos, String hteoricas, String hpeoricas) {
        this.idAsignatura = idAsignatura;
        this.sigla = sigla;
        this.denominacion = denominacion;
        this.creditos = creditos;
        this.hteoricas = hteoricas;
        this.hpeoricas = hpeoricas;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "idAsignatura='" + idAsignatura + '\'' +
                ", sigla='" + sigla + '\'' +
                ", denominacion='" + denominacion + '\'' +
                ", creditos='" + creditos + '\'' +
                ", hteoricas='" + hteoricas + '\'' +
                ", hpeoricas='" + hpeoricas + '\'' +
                '}';
    }
}
