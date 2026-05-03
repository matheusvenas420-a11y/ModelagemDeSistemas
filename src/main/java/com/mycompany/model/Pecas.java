package com.mycompany.model;

public class Pecas {
    private String nomePeca;
    private double valorPeca;

    public Pecas(String nomePeca, double valorPeca) {
        this.nomePeca = nomePeca;
        this.valorPeca = valorPeca;
    }

    public String getNomePeca() {
        return nomePeca;
    }

    public void setNomePeca(String nomePeca) {
        this.nomePeca = nomePeca;
    }

    public double getValorPeca() {
        return valorPeca;
    }

    public void setValorPeca(double valorPeca) {
        this.valorPeca = valorPeca;
    }
    
}
