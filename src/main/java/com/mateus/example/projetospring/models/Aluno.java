package com.mateus.example.projetospring.models;

import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TB_ALUNO")
public class Aluno {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;

    private String nome;

    @ManyToMany(mappedBy = "alunos")
    private List<Turma> turmas;

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}