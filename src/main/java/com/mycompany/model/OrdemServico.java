package com.mycompany.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class OrdemServico {
    private static int count;
    private int id;
    
    private String numeroOS;
    private LocalDate dataAbertura;
    private LocalDate dataEntrega;
    private Cliente cliente;
    private Veiculo veiculo;
    private Status status;
    private Orcamento orcamento;
    private final ArrayList<Servico> servicos;
    
    public enum Status {
        ABERTA,
        EXECUCAO,
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
    public void execucao(){
        this.status = Status.EXECUCAO;
    }
    public void concluir() {
        this.status = Status.CONCLUIDA;
        this.dataEntrega = LocalDate.now();
    }
    public void cancelar(){
        this.status = Status.CANCELADA;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void getInfo() {
        double total = calcularTotalServicos();
        if (orcamento != null) {
            total += orcamento.calcularValorPecas();
            total += orcamento.getValorMaoDeObra();
        }
        System.out.println("===== ORDEM DE SERVICO =====");
        System.out.println("ID: " + id);
        System.out.println("Numero: " + numeroOS);
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor Total: R$ " + total);
        System.out.println("Status: " + status);
        System.out.println("Data Abertura: " + dataAbertura);
        System.out.println("Data Entrega: " + 
            (dataEntrega != null ? dataEntrega : "Nao concluida"));

        if(servicos.isEmpty()){
            System.out.println("Nenhum servico adicionado");
        } else {
            for(int i = 0; i < servicos.size(); i++){
                System.out.println(servicos.get(i).getInfo());
            }
        }
        System.out.println(cliente.getInfoCliente());
        System.out.println(veiculo.getInfoVeiculo());
                
        if (orcamento != null) {
            System.out.println(orcamento.getInfoOrcamento());
        } else {
            System.out.println("Nenhum orcamento definido");
        }
        System.out.println("\n============================");
    }
}