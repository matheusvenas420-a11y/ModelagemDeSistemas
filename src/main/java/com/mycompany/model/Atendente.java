package com.mycompany.model;

public class Atendente {
    private String turno;

    public Atendente(String turno) {
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }   
}