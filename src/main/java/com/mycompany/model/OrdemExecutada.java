package com.mycompany.model;

import com.mycompany.model.OrdemServico.Status;

public class OrdemExecutada {
    private static int count;
    private int id;
    
    private String descricao;
    private int tempoPrevisto;
    private int tempoReal;
    private double valorUnitario;

    public OrdemExecutada(String descricao, int tempoPrevisto, double valorUnitario, Status status) {
        count++;
        this.id = count;
        this.descricao = descricao;
        this.tempoPrevisto = tempoPrevisto;
        this.valorUnitario = valorUnitario;
    }
    public void setTempoReal(int tempoReal){
        setTempoReal(this.tempoReal);
    }
    public int getTempoReal() {
        return tempoReal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTempoPrevisto() {
        return tempoPrevisto;
    }

    public void setTempoPrevisto(int tempoPrevisto) {
        this.tempoPrevisto = tempoPrevisto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
}