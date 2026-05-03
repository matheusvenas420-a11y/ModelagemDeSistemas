package com.mycompany.model;

public class Cliente extends Pessoa{
    private String endereco;

    public Cliente(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
