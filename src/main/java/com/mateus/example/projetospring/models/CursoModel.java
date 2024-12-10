package com.mateus.example.projetospring.models;

import jakarta.persistence.*;
import java.io.Serializable; //interface de marcação
import java.util.UUID;

@Entity // Indica que essa classe é uma entidade JPA
@Table(name = "TB_CURSO")
public class CursoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Anotação para informa como iram ser gerado os valores
    private UUID id;
    private int codigo;
    private String nome;
    private String duracao;
    private String quantidade;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int codigo() {
        return codigo;
    }

    public void setcodigo(int codigo) {
        this.codigo = codigo;
    }

    public String nome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String duracao() {
        return duracao;
    }

    public void setduracao(String duracao) {
        this.duracao = duracao;
    }

    public String quantidade() {
        return quantidade;
    }

    public void setquantidade(String quantidade) {
        this.quantidade = quantidade;
    }

}
