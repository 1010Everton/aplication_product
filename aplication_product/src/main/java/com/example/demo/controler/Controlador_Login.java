package com.example.demo.controler;

import com.example.demo.Acesso_Ao_Banco.Entidade_Login;
import com.example.demo.Acesso_Ao_Banco.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/inserir")
public class Controlador_Login {
    @Autowired
    Repositorio rep;
    @PostMapping
    public ResponseEntity<String> inserirUsuario(@RequestBody Entidade_Login usuario) {
        rep.save(usuario);
        return ResponseEntity.ok("{\"message\": \"Usuário cadastrado com sucesso!\"}");
    }
    @GetMapping("{login}/{senha}")
    public ResponseEntity<Entidade_Login> buscarUsuario(@PathVariable String login, @PathVariable String senha) {
        Optional<Entidade_Login> usuario = rep.findByLoginAndSenha(login, senha);
        return usuario.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}
