package com.uniamerica.prova5uniamerica2021.services;

import com.uniamerica.prova5uniamerica2021.models.Cliente;
import com.uniamerica.prova5uniamerica2021.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public List<Cliente> findAll() {
        return repository.findAll();
    }

    public Cliente store(Cliente cliente) {
        return repository.save(cliente);
    }

    public Cliente find(Integer id){
        return repository.findById(id)
            .orElseThrow(
                () -> new IllegalStateException("Cliente não Existe. id: " + id)
            );
    }
}
