package com.mateus.example.projetospring.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.example.projetospring.models.*;

public interface AlunoRepository extends JpaRepository<Aluno, UUID> {
}