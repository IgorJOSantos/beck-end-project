package com.dev.backend.service;

import com.dev.backend.entity.Regiao;
import com.dev.backend.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Regiao> listar() {
        return estadoRepository.findAll();
    }

    public Regiao inserir(Regiao regiao) {
        Regiao novoRegiao = estadoRepository.saveAndFlush(regiao); //SaveAndFlush salva e já envia para o banco
        return novoRegiao;
    }

    public Regiao alterar(Regiao regiao){
        return estadoRepository.saveAndFlush(regiao);
    }

    public void excluir(Long id){
        Regiao regiao = estadoRepository.findById(id).get();
        estadoRepository.delete(regiao);

    }
}
