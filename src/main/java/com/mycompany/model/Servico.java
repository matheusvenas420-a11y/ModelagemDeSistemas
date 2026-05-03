package com.mycompany.model;

public class Servico {

    private static int count;
    private int id;

    private String descricao;
    private int tempoPrevisto;
    private int tempoReal;
    private double valorUnitario;

    public Servico(String descricao, int tempoPrevisto, double valorUnitario) {
        count++;
        this.id = count;
        this.descricao = descricao;
        this.tempoPrevisto = tempoPrevisto;
        this.valorUnitario = valorUnitario;
        this.tempoReal = 0;
    }

    public int getId() {
        return id;
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

    public int getTempoReal() {
        return tempoReal;
    }

    public void setTempoReal(int tempoReal) {
        this.tempoReal = tempoReal;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    public String getInfo() {
        String relatorio =
               "\n----------------------------------------" + 
               "\nID: " + id +
               "\n| Servico: " + descricao +
               "\n | Tempo Previsto: " + tempoPrevisto +
               "\n | Tempo Real: " + tempoReal +
               "\n | Valor Servico: R$ " + valorUnitario +
               "\n----------------------------------------"; 
        
        return relatorio;
    }
}