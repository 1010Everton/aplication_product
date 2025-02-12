package com.example.demo.controler;

import com.example.demo.Acesso_Ao_Banco.Entidade_Login;
import com.example.demo.Acesso_Ao_Banco.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/verificar")
public class Controlador_Login {
    @Autowired
    Repositorio rep;
    @PostMapping
    public ResponseEntity<String> autenticarUsuario(@RequestBody LoginDTO loginDTO) {
        Optional<Entidade_Login> usuario = rep.findByLoginAndSenha(loginDTO.getLogin(), loginDTO.getSenha());

        if (usuario.isPresent()) {
            // Aqui você pode adicionar lógica adicional para autenticar o usuário, como gerar um token de sessão
            return ResponseEntity.ok("{\"message\": \"Login bem-sucedido!\"}");
        } else {
            return ResponseEntity.status(401).body("{\"message\": \"Login ou senha incorretos.\"}");
        }
    }
    @PutMapping
    public String alterar(@RequestBody Entidade_Login login) {
        try {
            // Tente salvar a entidade
            rep.save(login);
            return "Alteração feita com sucesso";
        } catch (Exception e) {
            // Capture qualquer exceção e retorne uma mensagem de erro
            return "Algo deu errado: " + e.getMessage();
        }
    }
}
