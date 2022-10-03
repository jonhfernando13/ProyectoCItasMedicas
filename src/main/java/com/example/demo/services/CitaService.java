package com.example.demo.services;

import java.util.List;

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

    public void eliminarcita(Integer idcita) {
        citaRepository.deleteById(idcita);
    }

    public CitaModelo obtenerxid(Integer id) {
        return citaRepository.findById(id).get();
    }

    public CitaModelo actualizarcita(CitaModelo cita) {
        return citaRepository.save(cita);
    }

}
