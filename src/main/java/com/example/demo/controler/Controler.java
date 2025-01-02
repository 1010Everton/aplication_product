package com.example.demo.controler;

import com.example.demo.produtos.Cadastro_produto;
import com.example.demo.produtos.Data_do_calendario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {

    private Cadastro_produto cadastro;
    private Data_do_calendario Data;

    @GetMapping("/")
    public Cadastro_produto cadastro() {
        return new Cadastro_produto("maça", "apple", 121234);
    }
}
