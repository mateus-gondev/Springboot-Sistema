package com.mateus.example.projetospring.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_ALUNO")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(mappedBy = "alunos")
    private List<Turma> turmas;

    // Getters and Setters
}