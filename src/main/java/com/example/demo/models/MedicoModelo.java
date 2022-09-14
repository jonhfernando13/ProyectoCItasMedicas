package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medico")
public class MedicoModelo {

    @Id
    private Integer idmedico;

    private String nombre_medic;

    private String apellido_medic;

    private String correo_medic;

    public Integer getIdmedico() {
        return idmedico;
    }

    public void setIdmedico(Integer idmedico) {
        this.idmedico = idmedico;
    }

    public String getNombre_medic() {
        return nombre_medic;
    }

    public void setNombre_medic(String nombre_medic) {
        this.nombre_medic = nombre_medic;
    }

    public String getApellido_medic() {
        return apellido_medic;
    }

    public void setApellido_medic(String apellido_medic) {
        this.apellido_medic = apellido_medic;
    }

    public String getCorreo_medic() {
        return correo_medic;
    }

    public void setCorreo_medic(String correo_medic) {
        this.correo_medic = correo_medic;
    }

    
    
}
