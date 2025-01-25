package com.example.demo.Usuario;

import com.example.demo.Acesso_Ao_Banco.Entidade;

import com.example.demo.Acesso_Ao_Banco.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inserir")
public class Controlador_Login {
    @Autowired
    Repositorio rep;

    @PostMapping
    public @ResponseBody Entidade inserirdados(@RequestParam String login, String senha) {
        Entidade ent = new Entidade("everton","123");
        ent.setLogin(login);
        ent.setSenha(senha);
        rep.save(ent);
        return ent;
    }
}