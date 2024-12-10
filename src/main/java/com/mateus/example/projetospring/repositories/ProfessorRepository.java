package com.mateus.example.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mateus.example.projetospring.models.ProfessorModel;
import java.util.UUID;

@Repository
public interface ProfessorRepository extends JpaRepository<ProfessorModel, UUID> {
    // Utilizar os Medotos para o crud
}
