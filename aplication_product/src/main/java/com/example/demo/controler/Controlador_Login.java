package com.example.demo.controler;

import com.example.demo.Acesso_Ao_Banco.Entidade_Login;

import com.example.demo.Acesso_Ao_Banco.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inserir")
public class Controlador_Login {
    @Autowired
    Repositorio rep;

    @PostMapping
    public @ResponseBody Entidade_Login inserirdados(@RequestParam String login, @RequestParam String senha) {
        Entidade_Login ent = new Entidade_Login(login, senha);
        ent.setLogin(login);
        ent.setSenha(senha);
        rep.save(ent);
        return ent;
    }
}