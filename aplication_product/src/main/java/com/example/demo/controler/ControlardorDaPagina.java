package com.example.demo.controler;

import com.example.demo.Acesso_Ao_Banco.Entidade_Login;

import com.example.demo.Acesso_Ao_Banco.Repositorio;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
public class ControlardorDaPagina {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("mensagem", "Bem-vindo ao meu site!");
        return "index"; // Vai buscar o arquivo index.html em templates
    }
}