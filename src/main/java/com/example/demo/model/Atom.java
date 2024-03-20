package com.example.demo.model;

import jakarta.persistence.Entity;

@Entity
public class Atom extends Elemento{

    private int protons;
    private int eletrons;
    private int neutrons;
    private double totalMass;


    public Atom() {
    }
    public Atom(String nome, String simboloQuimico, int numeroAtomico, double massaAtomica, String grupo, String periodo) {
        super(nome, simboloQuimico, numeroAtomico, massaAtomica, grupo, periodo);
        this.protons = protons;
        this.eletrons = eletrons;
    }
    public int getProtons() {
        return protons;
    }

    public void setProtons(int protons) {
        this.protons = protons;
    }

    public int getEletrons() {
        return eletrons;
    }

    public void setEletrons(int eletrons) {
        this.eletrons = eletrons;
    }


    public void calculateAtomicMass() {

        double massaProton = 1.007278;
        double massaNeutron = 1.008665;

        this.totalMass = protons * massaProton + neutrons * massaNeutron;
    }

    public double getTotalMass() {
        return totalMass;
    }

    public void setTotalMass(double totalMass) {
        this.totalMass = totalMass;
    }
}

