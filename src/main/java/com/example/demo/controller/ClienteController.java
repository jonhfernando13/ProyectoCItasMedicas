package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ClienteModelo;
import com.example.demo.services.ClienteService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping(value = "/ver")
    public ArrayList<ClienteModelo> obtenerclientes() {
        return clienteService.obtenerclientes();

    }

    @PostMapping(value = "/guardar")
    public ClienteModelo guardarcliente(@RequestBody ClienteModelo cliente) {
        return this.clienteService.guardarcliente(cliente);
    }

    @DeleteMapping(value = "/eliminar/{idUsuario}")
    public String eliminarcliente(@PathVariable("idUsuario") Integer id) {
        boolean borrar = this.clienteService.eliminarcliente(id);
        if (borrar) {
            return "Se elimino el usuario con id " + id;
        } else {
            return "No se elimino el usuario con id " + id;
        }
    }

    @GetMapping(value = "/verxid/{id}")
    public Optional<ClienteModelo> obtenerxid(@PathVariable("id") Integer id) {
        return this.clienteService.obtenerxid(id);
    }

    @PutMapping(value="/actualizar/{id}")
    public ClienteModelo actualizarcliente(@PathVariable String id, @RequestBody ClienteModelo cliente) {
        return this.clienteService.actualizarcliente(cliente);
    }

}
