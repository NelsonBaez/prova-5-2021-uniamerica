package com.uniamerica.prova5uniamerica2021.repositories;

import com.uniamerica.prova5uniamerica2021.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
