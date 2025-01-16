package com.example.demo.controler;

import com.example.demo.Acesso_Ao_Banco.Verifica;
import com.example.demo.Usuario.Login;
import com.example.demo.produtos.Cadastro_produto;
import com.example.demo.produtos.Data_do_calendario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {
    @Autowired
    private Cadastro_produto cadastro;

    @Autowired
    private Login Login;
    @GetMapping("/Cadastro")
    public Cadastro_produto cadastro() {
        return cadastro;
    }
    @GetMapping("/")
    public Login Login(){
        return Login;
    }
}
