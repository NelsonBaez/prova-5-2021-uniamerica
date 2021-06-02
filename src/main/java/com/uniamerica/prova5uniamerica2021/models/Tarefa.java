package com.uniamerica.prova5uniamerica2021.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
public class Tarefa {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id_tarefa;

    @NotBlank(message = "titulo é obrigatório")
    private String titulo;

    private String descricao;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

}
