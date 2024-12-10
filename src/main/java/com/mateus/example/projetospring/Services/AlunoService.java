package com.mateus.example.projetospring.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateus.example.projetospring.models.AlunoModel;
import com.mateus.example.projetospring.repositories.AlunoRepository;

@Service
public class AlunoService {

    @Autowired // Injeção
    private AlunoRepository alunoRepository;

    public AlunoModel salvar(AlunoModel aluno) {
        return alunoRepository.save(aluno);
    }

    public List<AlunoModel> buscarTodos() {
        return alunoRepository.findAll();
    }

    // Gerado Por DIca
    public static Object save(AlunoModel aluno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

}

/*
 * Os 'services' são responsavel pelo encapsulamento logico da aplicação, com
 * isso eu consigo definir as regras e operações que
 * serão execuldades, Ex:. Salva aluno.
 */