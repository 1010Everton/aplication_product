package com.example.demo.controler;

import com.example.demo.Acesso_Ao_Banco.Entidade_cadastro;
import com.example.demo.Acesso_Ao_Banco.Repositorio_Cadastro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
public class Controler_cadastro {
    @Autowired
    Repositorio_Cadastro rep;

    @PostMapping("/inserir")
    public ResponseEntity<String> cadastro(@RequestBody Entidade_cadastro cadastro) {
        Entidade_cadastro novoCadastro = rep.save(cadastro);

        String jsonResposta = String.format(
                "{\"message\": \"Produto cadastrado com sucesso!\", \"id\": %d, \"nome\": \"%s\"}",
                novoCadastro.getId(),
                novoCadastro.getNome()
        );

        return ResponseEntity.ok(jsonResposta);
    }

    }
