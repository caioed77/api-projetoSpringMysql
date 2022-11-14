package com.packege.project.controller;


import com.packege.project.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController{

    @GetMapping("/clientes")
    public List<Cliente> listaClientes (String name) {
        var client1 = new Cliente();
        client1.setId(1L);
        client1.setName("Caio");
        client1.setEmail("caio@gmail");

        var client2 = new Cliente();
        client2.setId(2L);
        client2.setName("jarders");
        return Arrays.asList(client1, client2);
    }
}
