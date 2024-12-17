package com.example.demo.produtos;

import javax.xml.crypto.Data;

public class cadastro_produto {

    private String nome;
    private String empresa;
    private Float Serie;
    private Data data;
    private Data Fabricacao;
    private Data Vencimento;


    public cadastro_produto(String nome, String empresa, Float Serie, Data Fabricacao, Data Vencimento){

    this.nome=nome;
    this.empresa=empresa;
    this.Serie=Serie;
    this.Fabricacao=Fabricacao;
    this.Vencimento=Vencimento;

    }
    public String getNome() {
        return nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public Float getSerie() {
        return Serie;
    }

    public Data getData() {
        return data;
    }

    public Data getFabricacao() {
        return Fabricacao;
    }

    public Data getVencimento() {
        return Vencimento;
    }


}
