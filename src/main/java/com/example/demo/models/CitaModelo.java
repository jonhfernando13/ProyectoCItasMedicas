package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cita")
public class CitaModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcita;

    private String fecha_hora;

    private String motivo;

    private Integer medico_idmedico;

    private Integer cliente_idusuario;



    public Integer getIdcita() {
        return idcita;
    }

    public void setIdcita(Integer idcita) {
        this.idcita = idcita;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Integer getMedico_idmedico() {
        return medico_idmedico;
    }

    public Integer getCliente_idusuario() {
        return cliente_idusuario;
    }

    public void setCliente_idusuario(Integer cliente_idusuario) {
        this.cliente_idusuario = cliente_idusuario;
    }


}
