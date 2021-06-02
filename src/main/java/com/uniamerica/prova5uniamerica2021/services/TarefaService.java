package com.uniamerica.prova5uniamerica2021.services;

import com.uniamerica.prova5uniamerica2021.models.Cliente;
import com.uniamerica.prova5uniamerica2021.models.Tarefa;
import com.uniamerica.prova5uniamerica2021.repositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository repository;

    public List<Tarefa> findAll() {
        return repository.findAll();
    }

    public Tarefa store(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public List<Tarefa> findTarefasByCliente(Cliente cliente){
        return repository.findTarefasByCliente(cliente);
    }
}
