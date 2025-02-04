package com.example.demo.controler;



import com.example.demo.Acesso_Ao_Banco.Entidade_Login;
import com.example.demo.Acesso_Ao_Banco.Entidade_cadastro;
import com.example.demo.Acesso_Ao_Banco.Repositorio;
import com.example.demo.Acesso_Ao_Banco.Repositorio_Cadastro;
import com.example.demo.produtos.Cadastro_produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class Controler_cadastro {
    @Autowired
    Repositorio_Cadastro rep;

    @PostMapping("/Cadastro")
    public Entidade_cadastro cadastro(@RequestParam String nome, @RequestParam String empresa, @RequestParam String serie){
        Entidade_cadastro ent = new Entidade_cadastro(nome, empresa, serie);
        ent.setNome(nome);
        ent.setEmpresa(empresa);
        ent.setSerie(serie);
        return rep.save(ent);
    }

    }
