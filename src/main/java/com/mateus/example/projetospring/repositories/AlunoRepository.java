package com.mateus.example.projetospring.repositories;

import com.mateus.example.projetospring.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel, UUID> {

    // Utilizar os Medotos para o crud

}