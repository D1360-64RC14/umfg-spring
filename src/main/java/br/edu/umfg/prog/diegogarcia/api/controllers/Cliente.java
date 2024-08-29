package br.edu.umfg.prog.diegogarcia.api.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class Cliente {
    private List<Cliente> clientes = new ArrayList<>();

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cliente> post(@RequestBody Cliente cliente) {
        clientes.add(cliente);

        return ResponseEntity.ok(cliente);
    }
}
