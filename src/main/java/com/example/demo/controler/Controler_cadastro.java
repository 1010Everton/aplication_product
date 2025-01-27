package com.example.demo.controler;



import com.example.demo.Acesso_Ao_Banco.Entidade_Login;
import com.example.demo.Acesso_Ao_Banco.Entidade_cadastro;
import com.example.demo.Acesso_Ao_Banco.Repositorio;
import com.example.demo.produtos.Cadastro_produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler_cadastro {
    @Autowired
    private Cadastro_produto cadastro;
    @Autowired
    Repositorio rep;

    @PostMapping("/Cadastro")
    public Entidade_cadastro cadastro(@RequestParam String nome, @RequestParam String empresa, @RequestParam String serie){
        Entidade_cadastro ent = new Entidade_cadastro(nome, empresa, serie);
        ent.setNome(nome);
        ent.setEmpresa(nome);
        ent.setSerie(nome);
        return ent;
    }

    }
