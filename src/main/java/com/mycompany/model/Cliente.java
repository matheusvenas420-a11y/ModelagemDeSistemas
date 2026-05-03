package com.mycompany.model;

import java.util.ArrayList;

public class Cliente extends Pessoa{
    private String endereco;
    private ArrayList<Veiculo> veiculos;

    public Cliente(String endereco, String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.endereco = endereco;
        this.veiculos = new ArrayList<>();
    }
    

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
