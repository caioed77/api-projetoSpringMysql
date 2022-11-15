package com.packege.project.controller;


import com.packege.project.models.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController{

    @GetMapping("/clientes")
    public List<Client> listaClientes (String name) {
        var client1 = new Client();
        client1.setId(1L);
        client1.setName("Caio");
        client1.setEmail("caio@gmail");

        var client2 = new Client();
        client2.setId(2L);
        client2.setName("jarders");
        return Arrays.asList(client1, client2);
    }
}
