package com.mateus.example.projetospring.models;

import jakarta.persistence.*;
import java.io.Serializable; //interface de marcação
import java.util.UUID;

@Entity // Indica que essa classe é uma entidade JPA
@Table(name = "TB_ALUNO")
public class AlunoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Anotação para informa como iram ser gerado os valores
    private UUID id;
    private int matricula;
    private String nome;
    private String cpf;
    private String status;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int matricula() {
        return matricula;
    }

    public void setmatricula(int matricula) {
        this.matricula = matricula;
    }

    public String nome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String cpf() {
        return cpf;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    public String status() {
        return status;
    }
    public void setstatus(String status) {
        this.status = status;
    }

}
