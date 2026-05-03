package com.mycompany.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class OrdemServico {
    private static int count;
    private int id;
    
    private String numeroOS;
    private LocalDate dataAbertura;
    private LocalDate dataEntrega;
    private Status status;
    private Orcamento orcamento;
    private final ArrayList<Servico> servicos;
    
    public enum Status {
        ABERTA,
        EXECUTADA,
        CONCLUIDA,
        CANCELADA
    }

    private double valorTotal;
    private String descricao;
    
    public OrdemServico(String descricao) {
        count++;
        this.id = count;

        this.numeroOS = "OS-" + id;
        this.descricao = descricao;

        this.dataAbertura = LocalDate.now();
        this.status = Status.ABERTA;

        this.servicos = new ArrayList<>();
    }
    private double calcularTotalServicos(){
        double total = 0;
        for (int i = 0; i < servicos.size(); i++) {
            total += servicos.get(i).getValorUnitario();
        }
        return total;
    }
    public void addServico(Servico e){
        this.servicos.add(e);
    }
    public void removeServico(int posicaoServico){
        if(posicaoServico >= 0 && posicaoServico < servicos.size()){
            this.servicos.remove(posicaoServico);
        } else {
            System.out.println("Posição inválida!");
        }
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
    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }
    public void getInfo() {
        System.out.println("===== ORDEM DE SERVICO =====");
        System.out.println("ID: " + id);
        System.out.println("Numero: " + numeroOS);
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor Total: R$ " + (valorTotal +orcamento.calcularValorPecas() + orcamento.getValorMaoDeObra() + calcularTotalServicos()));
        System.out.println("Status: " + status);
        System.out.println("Data Abertura: " + dataAbertura);
        System.out.println("Data Entrega: " + 
            (dataEntrega != null ? dataEntrega : "Nao concluida"));

        System.out.println("\n===== SERVICOS =====");

        if(servicos.isEmpty()){
            System.out.println("Nenhum servico adicionado");
        } else {
            for(int i = 0; i < servicos.size(); i++){
                System.out.println(servicos.get(i).getInfo());
            }
        }

        if (orcamento != null) {
            System.out.println(orcamento.getOrcamento());
        } else {
            System.out.println("Nenhum orcamento definido");
        }

        System.out.println("\n============================");
    }
}