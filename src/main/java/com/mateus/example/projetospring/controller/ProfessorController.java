package com.mateus.example.projetospring.controller;

//Anotações do Spring que mapeiam requisições HTTP
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController //Indica que essa classe é um controlador REST
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired //Permite a injeção de dependências
    private ProfessorRepository professorRepository;

    @GetMapping 
    public List<ProfessorModel> getAllProfessores() {
        return professorRepository.findAll();
    }

    @PostMapping
    public ProfessorModel createProfessor(@RequestBody ProfessorModel professor) {
        return professorRepository.save(professor);
    }
}
