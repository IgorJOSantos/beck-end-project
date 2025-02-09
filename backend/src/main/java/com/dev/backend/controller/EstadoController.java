package com.dev.backend.controller;

import com.dev.backend.entity.Regiao;
import com.dev.backend.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estado")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("/listar")
    public List<Regiao> buscarTodos(){
        return estadoService.listar();
    }

    @PostMapping("/inserir")
    public Regiao inserir(@RequestBody Regiao regiao) {
        return estadoService.inserir(regiao);
    }

    @PutMapping("/alterar{id}")
    public Regiao alterar(@RequestBody Regiao regiao) {
        return estadoService.alterar(regiao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        estadoService.excluir(id);
        return ResponseEntity.ok().build();
    }


}
