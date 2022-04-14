package edu.elp.SISELP.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "administrador")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Administrador extends Persona {

    @Column(name = "area_labor",length = 50)
    private  String areaLabor;

    @Column(name = "cod_admi",length = 12)
    private  String codAdmi;

    public Administrador() {

    }

    public String getAreaLabor() {
        return areaLabor;
    }

    public void setAreaLabor(String areaLabor) {
        this.areaLabor = areaLabor;
    }

    public String getCodAdmi() {
        return codAdmi;
    }

    public void setCodAdmi(String codAdmi) {
        this.codAdmi = codAdmi;
    }
}
