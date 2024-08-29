package br.edu.umfg.prog.diegogarcia.api.controllers;

import br.edu.umfg.prog.diegogarcia.api.entities.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private final List<Cliente> clientes = new ArrayList<>();

    @PostMapping
    public ResponseEntity<Cliente> post(
            @RequestBody Cliente cliente
    ) {
        clientes.add(cliente);
        return ResponseEntity.ok(cliente);
    }
}
