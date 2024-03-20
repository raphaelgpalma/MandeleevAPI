package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Elemento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String simboloQuimico;
    private int numeroAtomico;
    private double massaAtomica;
    private String grupo;
    private String periodo;

    private String configuracaoEletronica;


    public Elemento() {}


    public Elemento(String nome, String simboloQuimico, int numeroAtomico, double massaAtomica, String grupo, String periodo) {
        this.nome = nome;
        this.simboloQuimico = simboloQuimico;
        this.numeroAtomico = numeroAtomico;
        this.massaAtomica = massaAtomica;
        this.grupo = grupo;
        this.periodo = periodo;
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSimboloQuimico() {
        return simboloQuimico;
    }

    public void setSimboloQuimico(String simboloQuimico) { this.simboloQuimico = simboloQuimico;}

    public int getNumeroAtomico() {
        return numeroAtomico;
    }

    public void setNumeroAtomico(int numeroAtomico) {
        this.numeroAtomico = numeroAtomico;
    }

    public double getMassaAtomica() { return  massaAtomica; }

    public void setMassaAtomica(double massaAtomica) { this.massaAtomica = massaAtomica; }

    public String getGrupo() {
        return grupo;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getConfiguracaoEletronica() {
        return configuracaoEletronica;
    }
    public void setConfiguracaoEletronica(String configuracaoEletronica) {
        this.configuracaoEletronica = configuracaoEletronica;
    }
}