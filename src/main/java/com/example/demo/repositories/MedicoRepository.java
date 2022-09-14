package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.MedicoModelo;

@Repository
public interface MedicoRepository extends CrudRepository<MedicoModelo,Integer>{
    
}
