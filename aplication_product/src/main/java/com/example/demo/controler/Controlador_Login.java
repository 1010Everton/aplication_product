package com.example.demo.controler;

import com.example.demo.Acesso_Ao_Banco.Entidade_Login;
import com.example.demo.Acesso_Ao_Banco.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
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
    public ResponseEntity<Map<String, String>> alterar(@RequestBody Entidade_Login login) {
        Map<String, String> response = new HashMap<>();
        try {
            Optional<Entidade_Login> usuarioExistente = rep.findById(login.getId());

            if (usuarioExistente.isPresent()) {
                rep.save(login);
                response.put("message", "Alteração feita com sucesso");
            } else {
                response.put("message", "Usuário não encontrado");
            }

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            // Capture qualquer exceção e retorne uma mensagem de erro
            response.put("message", "Algo deu errado: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
    @DeleteMapping
    public ResponseEntity<Map<String, String>> Deletar(@RequestBody Entidade_Login login) {
        Map<String, String> response = new HashMap<>();
        try {
            Optional<Entidade_Login> usuarioExistente = rep.findById(login.getId());

            if (usuarioExistente.isPresent()) {
                rep.delete(usuarioExistente.get());
                response.put("message", "Alteração feita com sucesso");
            } else {
                response.put("message", "Usuário não encontrado");
            }

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            // Capture qualquer exceção e retorne uma mensagem de erro
            response.put("message", "Algo deu errado: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}
