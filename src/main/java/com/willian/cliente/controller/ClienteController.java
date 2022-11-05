package com.willian.cliente.controller;

import com.willian.cliente.model.Cliente;
import com.willian.cliente.model.dto.ClienteFiltrosDTO;
import com.willian.cliente.service.ClienteService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@CrossOrigin("*")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping("/salvar")
    public Cliente salvar(@RequestBody Cliente cliente) {
        return clienteService.salvar(cliente);
    }

    @PostMapping("/listar")
    public Page<Cliente> listar(@RequestBody ClienteFiltrosDTO filtros, Pageable pageable) {
        return clienteService.listar(filtros, pageable);
    }

    @PostMapping("/buscarPorId")
    public Cliente buscarPorId(@RequestBody Long id) {
        return clienteService.buscarPorId(id);
    }
}
