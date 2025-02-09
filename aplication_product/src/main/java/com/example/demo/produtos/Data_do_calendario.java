package com.example.demo.produtos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class Data_do_calendario {
    private int dia;
    private int mes;
    private int ano;

    // Construtor que recebe dia, mês e ano separadamente
    public Data_do_calendario(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Construtor que recebe uma string no formato "dd/MM/yyyy"
    @JsonCreator
    public Data_do_calendario(String data) {
        String[] partes = data.split("/");
        if (partes.length == 3) {
            this.dia = Integer.parseInt(partes[0]);
            this.mes = Integer.parseInt(partes[1]);
            this.ano = Integer.parseInt(partes[2]);
        } else {
            throw new IllegalArgumentException("Formato de data inválido. Use dd/MM/yyyy.");
        }
    }

    // Método para serializar a data para JSON
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