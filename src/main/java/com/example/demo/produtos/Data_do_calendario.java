package com.example.demo.produtos;

public class Data_do_calendario {

    private int dia;
    private int mes;
    private int ano;

    public Data_do_calendario(int dia, int mes, int ano){
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
    }
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
