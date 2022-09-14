package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.models.ClienteModelo;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteModelo,Integer> {
    
}
