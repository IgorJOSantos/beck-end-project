package com.dev.backend.controller;

import com.dev.backend.entity.Estado;
import com.dev.backend.service.EstadoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/estado")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("/listar")
    public List<Estado> buscarTodos(){
        return estadoService.listar();
    }

    @PostMapping("/inserir")
    public Estado inserir(@RequestBody Estado estado) {
        return estadoService.inserir(estado);
    }

    @PutMapping("/alterar{id}")
    public Estado alterar(@RequestBody Estado estado) {
        return estadoService.alterar(estado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        estadoService.excluir(id);
        return ResponseEntity.ok().build();
    }


}
