package com.mateus.example.projetospring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.example.projetospring.Services.AlunoService;
import com.mateus.example.projetospring.models.AlunoModel;
import com.mateus.example.projetospring.repositories.AlunoRepository;

@RestController
public class AlunoController {

    @Autowired // Ponto de Injeção para a intercafe
    AlunoRepository alunoRepository;

    // Construtor para criar um Aluno
    @PostMapping("/create")
    public ResponseEntity<Object> create(@RequestBody AlunoModel aluno) {
        return ResponseEntity.ok(AlunoService.save(aluno));
    }

    /*
     * @GetMapping //Lista tudo
     * public ResponseEntity<List<AlunoModel>> findAll() {
     * return ResponseEntity.ok(alunoService.findAll());
     * }
     */

    /*
     * @GetMapping("/find/{id}") //BUscar um aluno
     * public ResponseEntity<Optional<AlunoModel>> findById(@PathVariable Long id) {
     * return ResponseEntity.ok(alunoService.findById(id));
     * }
     */

    /*
     * @PutMapping("/update/{id}") //Atualizar
     * public ResponseEntity<AlunoModel> update(@PathVariable Long id, @RequestBody
     * AlunoModel aluno) {
     * return ResponseEntity.ok(alunoService.update(id, aluno));
     * }
     */

    /*
     * @DeleteMapping("/delete/{id}") //Exclui
     * public ResponseEntity<Void> delete(@PathVariable Long id) {
     * alunoService.deleteById(id);
     * return ResponseEntity.noContent().build();
     * }
     */
}
