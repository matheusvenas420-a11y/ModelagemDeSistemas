package com.mycompany.model;

public class Mecanico extends Funcionario{
    protected String especalidade; 

    public Mecanico(double salario, String cargo) {
        super(salario, cargo);
    }

    public String getEspecalidade() {
        return especalidade;
    }

    public void setEspecalidade(String especalidade) {
        this.especalidade = especalidade;
    }
}
