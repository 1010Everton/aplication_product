package com.example.demo.produtos;

import javax.xml.crypto.Data;

public class Cadastro_produto {

    // classe para o cadastro de produtos //

    private String nome;
    private String empresa;
    private String Serie;



    private Data_do_calendario validade;


    public Cadastro_produto(String nome, String empresa, String Serie,Data_do_calendario data){

    this.nome=nome;
    this.empresa=empresa;
    this.Serie=Serie;
    this.validade=data;
    }
    public String getNome() {
        return nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getSerie() {
        return Serie;
    }
    public Data_do_calendario getValidade() {
        return validade;
    }
}
