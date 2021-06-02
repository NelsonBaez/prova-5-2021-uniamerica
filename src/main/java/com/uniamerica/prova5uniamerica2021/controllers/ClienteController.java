package com.uniamerica.prova5uniamerica2021.controllers;

import com.uniamerica.prova5uniamerica2021.models.Cliente;
import com.uniamerica.prova5uniamerica2021.models.Tarefa;
import com.uniamerica.prova5uniamerica2021.services.ClienteService;
import com.uniamerica.prova5uniamerica2021.services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<Cliente> listar(){
        return clienteService.findAll() ;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente cadastrar(@Valid @RequestBody Cliente cliente){
        return clienteService.store(cliente);
    }

    @GetMapping("/{id}")
    public Cliente find(@PathVariable("id") Integer id){
        return clienteService.find(id);
    }

    @GetMapping("/{id}/tarefas")
    public List<Tarefa> tarefas(@PathVariable("id") Integer id){
        Cliente cliente = clienteService.find(id);
        return tarefaService.findTarefasByCliente(cliente);
    }
}
