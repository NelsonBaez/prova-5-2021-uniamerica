package com.uniamerica.prova5uniamerica2021.controllers;

import com.uniamerica.prova5uniamerica2021.models.Cliente;
import com.uniamerica.prova5uniamerica2021.models.Tarefa;
import com.uniamerica.prova5uniamerica2021.services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<Tarefa> listar(){
        return tarefaService.findAll() ;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tarefa cadastrar(@Valid @RequestBody Tarefa tarefa){
        return tarefaService.store(tarefa);
    }
}
