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
import com.example.demo.models.MedicoModelo;
import com.example.demo.services.MedicoService;

@RestController
@RequestMapping(value = "/medico")
public class MedicoController {

    @Autowired
    MedicoService medicoService;

    @GetMapping(value = "/ver")
    public ArrayList<MedicoModelo> obtenermedico(){
        return medicoService.obtenermedico();
    }

    @PostMapping(value = "/guardar")
    public MedicoModelo guardarmedico(@RequestBody MedicoModelo medico){
        return this.medicoService.guardarmedico(medico);
    }

    @DeleteMapping(value = "/eliminar/{idmedico}")
    public String eliminarmedico(@PathVariable("idmedico") Integer id) {
        boolean borrar = this.medicoService.eliminarmedico(id);
        if (borrar) {
            return "Se elimino el medico con id " + id;
        } else {
            return "No se elimino el medico con id " + id;
        }
    }

    @GetMapping(value = "/verxid/{id}")
    public Optional<MedicoModelo> obtenerxid(@PathVariable("id") Integer id) {
        return this.medicoService.obtenerxid(id);
    }

    @PutMapping(value="/actualizar/{id}")
    public MedicoModelo actualizarmedico(@PathVariable String id, @RequestBody MedicoModelo medico) {
        return this.medicoService.actualizarmedico(medico);
    }

}
