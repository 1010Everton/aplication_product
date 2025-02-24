package com.example.demo.controler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class ControlardorDaPagina {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("mensagem", "Bem-vindo ao meu site!");
        return "index"; // Vai buscar o arquivo index.html em templates
    }
    @GetMapping("/acessado")
    public String pagina(Model model) {
        model.addAttribute("mensagem", "Bem-vindo ao meu site!");
        return "cadastro_produto"; // Vai buscar o arquivo index.html em templates
    }
    @GetMapping("/alterar")
    public String alterar(Model model) {
        model.addAttribute("mensagem", "Bem-vindo ao meu site!");
        return "alterar"; // Vai buscar o arquivo index.html em templates
    }
    @GetMapping("/Deletar")
    public String Deletar(Model model) {
        model.addAttribute("mensagem", "Bem-vindo ao meu site!");
        return "Pagina_Deletar"; // Vai buscar o arquivo index.html em templates
    }
}