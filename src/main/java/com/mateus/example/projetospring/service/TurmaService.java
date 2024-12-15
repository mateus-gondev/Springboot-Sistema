package com.mateus.example.projetospring.service;

import org.springframework.stereotype.Service;

import com.mateus.example.projetospring.models.Turma;
import com.mateus.example.projetospring.repositories.*;

import java.util.List;

@Service
public class TurmaService {
    private final TurmaRepository turmaRepository;

    public TurmaService(TurmaRepository turmaRepository) {
        this.turmaRepository = turmaRepository;
    }

    public List<Turma> findAll() {
        return turmaRepository.findAll();
    }

    public Turma save(Turma turma) {
        return turmaRepository.save(turma);
    }
}