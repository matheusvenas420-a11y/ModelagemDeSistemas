package com.mycompany.model;

import java.util.ArrayList;

public class Orcamento {
    private static int count;
    private int id;
    
    private double valorMaoDeObra;
    private double valorPecas;
    private ArrayList<Pecas> listaPecas;

    public Orcamento(double valorMaoDeObra) {
        count++;
        this.id = count;
        
        this.listaPecas = new ArrayList<>();
        this.valorMaoDeObra = valorMaoDeObra;
        this.valorPecas = calcularValorPecas();
    }
    public double calcularValorPecas(){
        double valordaPecas = 0;
        for (int i = 0; i < listaPecas.size(); i++) {
            valordaPecas += listaPecas.get(i).getValorPeca();
        }
        return valordaPecas;
    }
    public void addPecas(Pecas p){
        this.listaPecas.add(p);
    }
    public void listarPecas() {
        if (listaPecas.isEmpty()) {
            System.out.println("Nenhuma peca adicionada");
            return;
        }

        for (int i = 0; i < listaPecas.size(); i++) {
            System.out.println("Posicao: " + i + " | Peca: " + listaPecas.get(i));
        }
    }
    public void removerPeca(int posicao) {
        if (posicao < 0 || posicao >= listaPecas.size()) {
            System.out.println("Posição inválida.");
            return;
        }

        listaPecas.remove(posicao);
        System.out.println("Peça removida com sucesso.");
    }
    public String getInfoOrcamento() {
        double totalPecas = calcularValorPecas();
        double total = valorMaoDeObra + totalPecas;

        String relatorio = "===== ORCAMENTO =====\n"
                        +"Pecas: R$ " + totalPecas + "\n"
                        +"Mao de Obra: R$ " + valorMaoDeObra + "\n"
                        +"Total Pecas + Mao de obra: R$ " + total + "\n";

        relatorio += "\nLista de Pecas:\n";

        if (listaPecas.isEmpty()) {
            relatorio += "Nenhuma peca adicionada\n";
        } else {
            for (int i = 0; i < listaPecas.size(); i++) {
                relatorio += i + " - " + listaPecas.get(i).getNomePeca() + " | R$ " + listaPecas.get(i).getValorPeca() + "\n";
            }
        }

        relatorio += "=====================";

        return relatorio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorMaoDeObra() {
        return valorMaoDeObra;
    }

    public void setValorMaoDeObra(double valorMaoDeObra) {
        this.valorMaoDeObra = valorMaoDeObra;
    }

    public double getValorPecas() {
        return valorPecas;
    }

    public void setValorPecas(double valorPecas) {
        this.valorPecas = valorPecas;
    }

    public ArrayList<Pecas> getListaPecas() {
        return listaPecas;
    }

    public void setListaPecas(ArrayList<Pecas> listaPecas) {
        this.listaPecas = listaPecas;
    }
    
}