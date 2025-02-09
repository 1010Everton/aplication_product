package com.example.demo.Acesso_Ao_Banco;

import com.example.demo.produtos.Data_do_calendario;
import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Data_do_calendario data;
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
    public Data_do_calendario getData() {
        return data;
    }

    public void setData(Data_do_calendario data) {
        this.data = data;
    }
}
