package com.mateus.example.projetospring.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_PROFESSOR")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "professor")
    private List<Turma> turmas;

    // Getters and Setters
}