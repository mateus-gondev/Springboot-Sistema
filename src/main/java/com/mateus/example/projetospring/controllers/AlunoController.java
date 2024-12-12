package com.mateus.example.projetospring.controllers;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.example.projetospring.Services.AlunoService;
import com.mateus.example.projetospring.models.AlunoModel;
import com.mateus.example.projetospring.repositories.AlunoRepository;

@RestController
@RequestMapping("/Aluno")
public class AlunoController {

    // Ponto de injeção via construtor
    final AlunoRepository alunoRepository;
    final AlunoService alunoService;

    AlunoController(AlunoRepository alunoRepository, AlunoService alunoService) {
        this.alunoRepository = alunoRepository;
        this.alunoService = alunoService;
    }
    // --

    @PostMapping // Criar Entidade Aluno | Create (POST)
    public ResponseEntity<AlunoModel> criarAluno(@RequestBody AlunoModel aluno) {
        AlunoModel alunoSalvo = alunoRepository.save(aluno);
        return ResponseEntity.created(URI.create("/alunos/" + alunoSalvo.getId())).body(alunoSalvo);
    }

}
