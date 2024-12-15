package com.mateus.example.projetospring.controller;

import org.springframework.web.bind.annotation.*;

import com.mateus.example.projetospring.models.Professor;
import com.mateus.example.projetospring.service.ProfessorService;

import java.util.List;

@RestController
@RequestMapping("/professors")
public class ProfessorController {
    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping
    public List<Professor> getAllProfessors() {
        return professorService.findAll();
    }

    @PostMapping
    public Professor createProfessor(@RequestBody Professor professor) {
        return professorService.save(professor);
    }
}