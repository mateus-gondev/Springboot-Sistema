package com.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.seuprojeto.models.User;


public interface MyRepository extends JpaRepository<User, Long> {

    // Aqui eu botu as consultas 
}

    

