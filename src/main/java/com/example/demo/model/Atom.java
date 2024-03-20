package com.example.demo.model;

import jakarta.persistence.Entity;

@Entity
public class Atom extends Elemento{

    private int numProtons;
    private int numEletrons;

    public Atom() {
    }

    public Atom(String nome, String simboloQuimico, int numeroAtomico, double massaAtomica, String grupo, String periodo) {
        super(nome, simboloQuimico, numeroAtomico, massaAtomica, grupo, periodo);
        this.numProtons = numProtons;
        this.numEletrons = numEletrons;
    }
    public int getNumProtons() {
        return numProtons;
    }

    public void setNumProtons(int numProtons) {
        this.numProtons = numProtons;
    }

    public int getNumEletrons() {
        return numEletrons;
    }

    public void setNumEletrons(int numEletrons) {
        this.numEletrons = numEletrons;
    }
}

