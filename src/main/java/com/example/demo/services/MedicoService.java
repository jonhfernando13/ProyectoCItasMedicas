package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.MedicoModelo;
import com.example.demo.repositories.MedicoRepository;

@Service
public class MedicoService {

    @Autowired
    MedicoRepository medicoRepository;

    public ArrayList<MedicoModelo> obtenermedico() {
        return (ArrayList<MedicoModelo>) medicoRepository.findAll();
    }

    public MedicoModelo guardarmedico(MedicoModelo medico) {
        return medicoRepository.save(medico);
    }

    public boolean eliminarmedico(Integer id) {
        try {
            medicoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Optional<MedicoModelo> obtenerxid(Integer id) {
        return medicoRepository.findById(id);
    }

    public MedicoModelo actualizarmedico(MedicoModelo medico) {
        return medicoRepository.save(medico);
    }

}
