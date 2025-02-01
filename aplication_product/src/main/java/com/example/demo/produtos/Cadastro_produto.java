package com.example.demo.produtos;

import org.springframework.stereotype.Service;

@Service
public class Cadastro_produto {

    // classe para o cadastro de produtos //



    private String nome;
    private String empresa;
    private String Serie;

    public  Cadastro_produto(){
        cadastrar("smarthphone","apple","1231wse");
    }

    public void cadastrar(String nome, String empresa, String Serie){

    this.nome=nome;
    this.empresa=empresa;
    this.Serie=Serie;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setSerie(String serie) {
        Serie = serie;
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

    }

