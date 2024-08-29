package br.edu.umfg.prog.diegogarcia.api.controllers;

import br.edu.umfg.prog.diegogarcia.api.entities.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    @GetMapping
    public ResponseEntity<List<Cliente>> get() {
        return ResponseEntity.ok(clientes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> get(
            @PathVariable UUID id
    ) {
        for (var cliente : clientes) {
            if (cliente.getId().equals(id)) {
                return ResponseEntity.ok(cliente);
            }
        }

        return null;
    }
}
