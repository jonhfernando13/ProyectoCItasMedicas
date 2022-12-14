package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping(value = "/guardar")
    public CitaModelo guardarcita(@RequestBody CitaModelo cita) {

        return this.citaService.guardarcita(cita);
    }

    @GetMapping(value = "/eliminar/{idcita}")
    public String eliminarcita(@PathVariable(name = "idcita") Integer id) {
        this.citaService.eliminarcita(id);
        return "redirect:/gestion";
    }

    @GetMapping(value = "/actualizar/{idcita}")
    public String editarcita(@PathVariable(name = "idcita") Integer id, Model model) {
        CitaModelo cm = citaService.obtenerxid(id);
        model.addAttribute("CitaModelo", cm);

        return "actualizar";
    }

    @PostMapping("/gestion/{idcita}")
    public String actualizarcita(@PathVariable(name = "idcita") Integer id, @ModelAttribute("CitaModelo") CitaModelo cita,Model model) {
   
        CitaModelo citaexisten = citaService.obtenerxid(id);

        citaexisten.setIdcita(id);
        citaexisten.setFecha_hora(cita.getFecha_hora());
        citaexisten.setMotivo(cita.getMotivo());

        citaService.actualizarcita(citaexisten);

        return "redirect:/gestion";
    }

    @RequestMapping("/gestion")
    public String gestion(Model model) {
        List<CitaModelo> cita = citaService.obtenercitas();
        model.addAttribute("cita", cita);
        return "gestion";
    }

}
