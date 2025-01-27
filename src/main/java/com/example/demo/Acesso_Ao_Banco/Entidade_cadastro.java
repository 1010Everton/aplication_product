package com.example.demo.Acesso_Ao_Banco;

import jakarta.persistence.*;

@Entity
@Table(name="produto")
public class Entidade_cadastro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String empresa;
    private String Serie;
    private String data;

    public Entidade_cadastro(String nome, String empresa, String serie) {
        this.nome = nome;
        this.empresa = empresa;
        Serie = serie;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String serie) {
        Serie = serie;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
