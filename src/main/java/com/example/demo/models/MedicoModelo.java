package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medico")
public class MedicoModelo {

    @Id
    private Integer idmedico;

    private String nombre;

    private String apellido;

    private String correo;


    public Integer getIdmedico() {
        return idmedico;
    }

    public void setIdmedico(Integer idmedico) {
        this.idmedico = idmedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
