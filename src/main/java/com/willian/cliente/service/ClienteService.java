package com.willian.cliente.service;

import com.willian.cliente.model.Cliente;
import com.willian.cliente.model.dto.ClienteFiltrosDTO;
import com.willian.cliente.repository.ClienteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Page<Cliente> listar(ClienteFiltrosDTO filtros, Pageable pageable) {
        return clienteRepository.listar(filtros.getId(), filtros.getNome().concat("%"), pageable);
    }

    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }
}
