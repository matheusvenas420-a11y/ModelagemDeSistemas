package com.mycompany.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrdemServico {
    private static int count;
    private int id;
    
    private String numeroOS;
    private LocalDate dataAbertura;
    private LocalDate dataEntrega;
    private Status status;
    private Orcamento orcamento;
    private final List<OrdemExecutada> servicos;
    
    public enum Status {
        ABERTA,
        EXECUTADA,
        CONCLUIDA,
        CANCELADA
    }

    private double valorTotal;
    private String descricao;
    
    public OrdemServico(double valorTotal, String descricao) {
        count++;
        this.id = count;

        this.numeroOS = "OS-" + id;
        this.valorTotal = valorTotal;
        this.descricao = descricao;

        this.dataAbertura = LocalDate.now();
        this.status = Status.ABERTA;

        this.servicos = new ArrayList<>();
    }
    
    public void addServico(OrdemExecutada e){
        this.servicos.add(e);
    }
    public void removeServico(int posicaoServico){
        if(posicaoServico >= 0 && posicaoServico < servicos.size()){
            this.servicos.remove(posicaoServico);
        } else {
            System.out.println("Posição inválida!");
        }
    }
    public void listar(){
        
    }
    public void executada(){
        this.status = Status.EXECUTADA;
    }
    public void concluir() {
        this.status = Status.CONCLUIDA;
        this.dataEntrega = LocalDate.now();
    }
    public void cancelar(){
        this.status = Status.CANCELADA;
    }

    public String getNumeroOS() {
        return numeroOS;
    }

    public void setNumeroOS(String numeroOS) {
        this.numeroOS = numeroOS;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}