package com.example.demo.model;

import jakarta.persistence.Entity;

@Entity
public class MetaisAlcalinos extends Elemento{

    private String reatividade;
    private String pontoDeFusao;

    public MetaisAlcalinos() {
    }

    public MetaisAlcalinos(String nome, String simboloQuimico, int numeroAtomico, double massaAtomica, String reatividade, String pontoDeFusao) {
        super(nome, simboloQuimico, numeroAtomico, massaAtomica);
        this.reatividade = reatividade;
        this.pontoDeFusao = pontoDeFusao;
    }

    public String getReatividade() {
        return reatividade;
    }

    public void setReatividade(String reatividade) {
        this.reatividade = reatividade;
    }

    public String getPontoDeFusao() {
        return pontoDeFusao;
    }

    public void setPontoDeFusao(String pontoDeFusao) {
        this.pontoDeFusao = pontoDeFusao;
    }
}

