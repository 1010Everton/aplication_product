package com.example.demo.controler;



import com.example.demo.Acesso_Ao_Banco.Entidade_Login;
import com.example.demo.Acesso_Ao_Banco.Entidade_cadastro;
import com.example.demo.Acesso_Ao_Banco.Repositorio;
import com.example.demo.Acesso_Ao_Banco.Repositorio_Cadastro;
import com.example.demo.produtos.Cadastro_produto;
import com.example.demo.produtos.Data_do_calendario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
public class Controler_cadastro {
    @Autowired
    Repositorio_Cadastro rep;

    @PostMapping("/inserir")
    public Entidade_cadastro cadastro(@RequestBody Entidade_cadastro cadastro){
        return rep.save(cadastro);
    }

    }
