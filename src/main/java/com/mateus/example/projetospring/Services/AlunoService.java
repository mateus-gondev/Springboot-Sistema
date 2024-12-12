package com.mateus.example.projetospring.Services;

import org.springframework.stereotype.Service;
import com.mateus.example.projetospring.repositories.AlunoRepository;

@Service
public class AlunoService {

    // Criei esse Ponto de injeçaõ pelo mode construtor
    final AlunoRepository alunoRepository;

    AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

}
