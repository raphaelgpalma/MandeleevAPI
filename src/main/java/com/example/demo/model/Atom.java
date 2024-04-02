package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Atom extends Elemento{


    private int protons;
    private int eletrons;
    private int neutrons;
    private double totalMass;


    public Atom() {
    }
    public Atom(String nome, String simbolo, int numeroAtomico, String grupo, String periodo) {
        super(nome, simbolo, numeroAtomico, grupo, periodo);
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

    public int getNeutrons() {
        return neutrons;
    }

    public void setNeutrons(int neutrons) {
        this.neutrons = neutrons;
    }


    public double calculateAtomicMass() {

        double massaProton = 1.007278;
        double massaNeutron = 1.008665;

        this.totalMass = protons * massaProton + neutrons * massaNeutron;
        return totalMass;
    }

    double atomMass =  calculateAtomicMass();

    public double getAtomMass() {
        return calculateAtomicMass();
    }

    public void setAtomMass(double totalMass) {
        this.totalMass = totalMass;
    }

}

