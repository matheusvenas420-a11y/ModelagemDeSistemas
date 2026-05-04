package com.mycompany.model;

import java.util.ArrayList;

public class Veiculo {
    private static int count;
    private int id;
    
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private double quilometragem;
    private ArrayList<Servico> servicosFeitos;

    public Veiculo(String placa, String marca, String modelo, int ano, double quilometragem) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
        count++;
        this.id = count;
        this.servicosFeitos = new ArrayList<>();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
    
    public String getInfoVeiculo() {
        String info = "===== VEICULO =====\n";
        info += "ID: " + id + "\n";
        info += "Placa: " + placa + "\n";
        info += "Marca: " + marca + "\n";
        info += "Modelo: " + modelo + "\n";
        info += "Ano: " + ano + "\n";
        info += String.format("Quilometragem: %.2f km%n", quilometragem);
        return info;
    }
}