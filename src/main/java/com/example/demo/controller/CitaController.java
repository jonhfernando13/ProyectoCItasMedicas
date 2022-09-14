package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.CitaModelo;
import com.example.demo.services.CitaService;

@RestController
@RequestMapping(value = "/cita")
public class CitaController {

    @Autowired
    CitaService citaService;

    @GetMapping(value = "/ver")
    public ArrayList<CitaModelo> obtenercitas() {
        return citaService.obtenercitas();

    }

    @PostMapping(value = "/guardar")
    public CitaModelo guardarcita(@RequestBody CitaModelo cita) {

        return this.citaService.guardarcita(cita);
    }

    @DeleteMapping(value = "/eliminar/{idCita}")
    public String eliminarcita(@PathVariable("idCita") Integer id) {
        boolean borrar = this.citaService.eliminarcita(id);
        if (borrar) {
            return "Se elimino el cita con id " + id;
        } else {
            return "No se elimino el cita con id " + id;
        }
    }

    @GetMapping(value = "/verxid/{id}")
    public Optional<CitaModelo> obtenerxid(@PathVariable("id") Integer id) {
        return this.citaService.obtenerxid(id);
    }

    @PutMapping(value = "/actualizar/{id}")
    public CitaModelo actualizarcita(@PathVariable String id, @RequestBody CitaModelo cita) {
        return this.citaService.actualizarcita(cita);
    }

}
