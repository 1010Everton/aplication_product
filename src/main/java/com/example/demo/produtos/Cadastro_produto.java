package com.example.demo.produtos;

import javax.xml.crypto.Data;

public class Cadastro_produto {

    // classe para o cadastro de produtos //

    private String nome;
    private String empresa;
    private int Serie;
    private int Data;
    private int Fabricacao;
    private int Vencimento;



    public Cadastro_produto(String nome, String empresa, int Serie){

    this.nome=nome;
    this.empresa=empresa;
    this.Serie=Serie;

    }
    public String getNome() {
        return nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public int getSerie() {
        return Serie;
    }

}
