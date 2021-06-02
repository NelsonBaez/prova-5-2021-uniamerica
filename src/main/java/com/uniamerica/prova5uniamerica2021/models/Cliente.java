package com.uniamerica.prova5uniamerica2021.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Cliente {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id_cliente;

    @NotBlank(message = "nome é obrigatório")
    private String nome;

    @JsonManagedReference
    @OneToMany(mappedBy="cliente")
    private List<Tarefa> tarefas = new ArrayList<>();;
}
