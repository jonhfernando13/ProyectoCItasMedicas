package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ClienteModelo;
import com.example.demo.repositories.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public ArrayList<ClienteModelo> obtenerclientes() {
        return (ArrayList<ClienteModelo>) clienteRepository.findAll();
    }

    public ClienteModelo guardarcliente(ClienteModelo cliente) {
        return clienteRepository.save(cliente);
    }

    public boolean eliminarcliente(Integer id) {
        try {
            clienteRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Optional<ClienteModelo> obtenerxid(Integer id) {
        return clienteRepository.findById(id);
    }

    public ClienteModelo actualizarcliente(ClienteModelo cliente) {
        return clienteRepository.save(cliente);
    }

}
