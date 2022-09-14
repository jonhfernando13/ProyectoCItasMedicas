package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class ClienteModelo {

    @Id
    private Integer idusuario;
   
    private String nombre_user;
  
    private String apellido_user;
 
    private String correo_user;
 
    private Integer telefono_user;

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre_user() {
        return nombre_user;
    }

    public void setNombre_user(String nombre_user) {
        this.nombre_user = nombre_user;
    }

    public String getApellido_user() {
        return apellido_user;
    }

    public void setApellido_user(String apellido_user) {
        this.apellido_user = apellido_user;
    }

    public String getCorreo_user() {
        return correo_user;
    }

    public void setCorreo_user(String correo_user) {
        this.correo_user = correo_user;
    }

    public Integer getTelefono_user() {
        return telefono_user;
    }

    public void setTelefono_user(Integer telefono_user) {
        this.telefono_user = telefono_user;
    }
    
}
