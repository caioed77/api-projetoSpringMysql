package com.packege.project.controller;


import com.packege.project.models.Cliente;
import com.packege.project.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/clientes")
public class ClientController {

    @PersistenceContext
    private EntityManager manager;

    private ClienteRepository clienteRepository;
    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }
    @GetMapping("/{clientId}")
    public ResponseEntity<Cliente> buscar(@PathVariable Long clientId){
       return clienteRepository.findById(clientId)
             .map(ResponseEntity::ok)
             .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@RequestBody Cliente client) {
        return clienteRepository.save(client);
    }

}
