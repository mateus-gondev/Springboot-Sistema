package com.mateus.example.projetospring.controller;

import org.springframework.web.bind.annotation.*;

import com.mateus.example.projetospring.models.Turma;
import com.mateus.example.projetospring.service.TurmaService;

import java.util.List;

@RestController
@RequestMapping("/turmas")
public class TurmaController {
    private final TurmaService turmaService;

    public TurmaController(TurmaService turmaService) {
        this.turmaService = turmaService;
    }

    @GetMapping
    public List<Turma> getAllTurmas() {
        return turmaService.findAll();
    }

    @PostMapping
    public Turma createTurma(@RequestBody Turma turma) {
        return turmaService.save(turma);
    }
}