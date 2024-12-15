package com.mateus.example.projetospring.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_TURMA")
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    private Professor professor;

    @ManyToMany
    @JoinTable(name = "turma_aluno", joinColumns = @JoinColumn(name = "turma_id"), inverseJoinColumns = @JoinColumn(name = "aluno_id"))
    private List<Aluno> alunos;

    // Getters and Setters
}
