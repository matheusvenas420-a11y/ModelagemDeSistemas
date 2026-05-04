package com.mycompany.model;

public class Mecanico extends Funcionario{
    private static int count;
    private String id;
    protected String especialidade;

    public Mecanico(double salario,String especialidade) {
        super(salario);
        this.especialidade = especialidade;
        count++;
        this.id = "ME-" + count;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
