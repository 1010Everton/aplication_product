package com.example.demo.produtos;

import com.fasterxml.jackson.annotation.JsonValue;

public class Data_do_calendario {
    private int dia;
    private int mes;
    private int ano;

    public Data_do_calendario(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Método para retornar a data formatada como string
    @JsonValue
    public String toJson() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    // Getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
