package com.dev.backend.controller;

import com.dev.backend.entity.Cidade;
import com.dev.backend.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cidade")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping("/listar")
    public List<Cidade> listar() {
        return cidadeService.listarCidades();
    }

    @PostMapping("/inserir")
    public Cidade inserirCidade(@RequestBody Cidade cidade) {
        return cidadeService.inserirCidade(cidade);
    }

    @PutMapping("/atualizar")
    public Cidade atualizarCidade(@RequestBody Cidade cidade) {
        return cidadeService.atualizarCidade(cidade);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirCidade (@PathVariable("id") Long id) {
        cidadeService.excluirCidade(id);
        return ResponseEntity.ok().build();
    }



}
