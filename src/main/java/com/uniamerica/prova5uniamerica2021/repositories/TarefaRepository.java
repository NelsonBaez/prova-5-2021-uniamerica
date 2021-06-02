package com.uniamerica.prova5uniamerica2021.repositories;

import com.uniamerica.prova5uniamerica2021.models.Cliente;
import com.uniamerica.prova5uniamerica2021.models.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface  TarefaRepository extends JpaRepository<Tarefa, Integer> {
    List<Tarefa> findTarefasByCliente(Cliente cliente);
}
