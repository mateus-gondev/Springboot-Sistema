package com.mateus.example.projetospring.service;

import org.springframework.stereotype.Service;

import com.mateus.example.projetospring.models.Professor;
import com.mateus.example.projetospring.repositories.*;

import java.util.List;

@Service
public class ProfessorService {
    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<Professor> findAll() {
        return professorRepository.findAll();
    }

    public Professor save(Professor professor) {
        return professorRepository.save(professor);
    }
}