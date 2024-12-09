package com.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.seuprojeto.models.User;


public interface MyRepository extends JpaRepository<User, Long> {

    //Aqui é uma interface JPA que fornece métodos para interagir com o banco de dados e realizar operações CRUD 
}

    

