package com.mycompany.model;

public class Funcionario {
    protected double salario;
    protected String cargo;

    public Funcionario(double salario, String cargo) {
        this.salario = salario;
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
