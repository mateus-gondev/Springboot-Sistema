package com.mateus.example.projetospring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mateus.example.projetospring.repositories.AlunoRepository;

@RestController
@RequestMapping("/Aluno")
public class AlunoController {
    // Ponto de injeção via construtor
    final AlunoRepository alunoRepository;

    AlunoController(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

}
