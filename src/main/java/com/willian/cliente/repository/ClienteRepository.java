package com.willian.cliente.repository;

import com.willian.cliente.model.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query("SELECT cli FROM Cliente cli " +
            "WHERE (:id IS NULL OR cli.id = :id) " +
            "AND cli.nome LIKE :nome ")
    Page<Cliente> listar(Long id, String nome, Pageable pageable);
}
