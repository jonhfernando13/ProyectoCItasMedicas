package com.example.demo.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.CitaModelo;
import com.example.demo.repositories.CitaRepository;

@Service
public class CitaService {

    @Autowired
    CitaRepository citaRepository;

    public List<CitaModelo> obtenercitas() {
        return (List<CitaModelo>) citaRepository.findAll();
    }

    public CitaModelo guardarcita(CitaModelo cita) {
        return citaRepository.save(cita);
    }

    public boolean eliminarcita(Integer id) {
        try {
            citaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Optional<CitaModelo> obtenerxid(Integer id) {
        return citaRepository.findById(id);
    }

    public CitaModelo actualizarcita(CitaModelo cita) {
        return citaRepository.save(cita);
    }

}
