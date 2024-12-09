package com.mateus.example.projetospring.models;
//package com.mateus.example.projetospring;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity //Indica que essa classe é uma entidade JPA
@Table(name = "TB_PROFESSOR")
public class ProfessorModel implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;
    private String nome;
    private float salario;
    private String status;
    

    public UUID getId(){
        return id;
    }
    public void setId(UUID id){
        this.id=id;
    }

    public String nome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome=nome;
    }

    public float getsalario(){
        return salario;
    }
    public void setsalario(float salario){
        this.salario=salario;
    }

    public String status(){
        return status;
    }
    public void setstatus(String status){
        this.status=status;
    }
}
