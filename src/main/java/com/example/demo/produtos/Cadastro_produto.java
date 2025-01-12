package com.example.demo.produtos;

import org.springframework.stereotype.Service;

@Service
public class Cadastro_produto {

    // classe para o cadastro de produtos //

    private String nome;
    private String empresa;
    private String Serie;



    Data_do_calendario data = new Data_do_calendario(29,02,2025);

    public void cadastrar(String nome, String empresa, String Serie, Data_do_calendario data){

    this.nome=nome;
    this.empresa=empresa;
    this.Serie=Serie;
    this.data=data;
    }
    public  Cadastro_produto(){
        cadastrar("smarthphone","apple","1231wse",data);
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
    public Data_do_calendario getData() {
        return data;
    }
    }

