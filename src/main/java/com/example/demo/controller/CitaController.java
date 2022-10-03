package com.example.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.models.CitaModelo;
import com.example.demo.services.CitaService;


@Controller
public class CitaController {

    @Autowired
    private CitaService citaService;

    

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("crearcita", citaService.obtenercitas());
        return "crearcita";
    }

    @GetMapping("/crearcita")
    public String listStudents(Model model) {
        model.addAttribute("crearcita", citaService.obtenercitas());
        return "crearcita";
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
    @RequestMapping("/gestion")
    public String gestion(Model model) {
        List<CitaModelo>cita=citaService.obtenercitas();
        model.addAttribute("cita", cita);
        return "gestion";
    }
    
}
