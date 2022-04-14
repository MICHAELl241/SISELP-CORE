package edu.elp.SISELP.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "docente")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Docente extends Persona {

    @Column(name = "cod_docente",length = 12)
    private  String codDocente;

    @Column(name = "indet_docente",length = 20)
    private  String identdocente;

    public Docente() {
    }

    public String getCodDocente() {
        return codDocente;
    }

    public void setCodDocente(String codDocente) {
        this.codDocente = codDocente;
    }

    public String getIdentdocente() {
        return identdocente;
    }

    public void setIdentdocente(String identdocente) {
        this.identdocente = identdocente;
    }
}
