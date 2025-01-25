package com.example.demo.controler;



import com.example.demo.produtos.Cadastro_produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {
    @Autowired
    private Cadastro_produto cadastro;


    @GetMapping("/Cadastro")
    public Cadastro_produto cadastro() {
        return cadastro;
    }

}
