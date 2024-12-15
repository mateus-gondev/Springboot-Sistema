package com.mateus.example.projetospring.service;

import org.springframework.stereotype.Service;

import com.mateus.example.projetospring.models.Aluno;
import com.mateus.example.projetospring.repositories.*;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    public Aluno save(Aluno aluno) {
        return alunoRepository.save(aluno);
    }
}