package com.example.demo.Usuario;

import com.example.demo.Acesso_Ao_Banco.Verifica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


@Service
public class Login {
    @Autowired
    private Verifica verifier;
    private String login;
    private String senha;
    public void Login_usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;


        if (verifier.checkLogin(login, senha)) {
            System.out.print("usuario ja cadastrado em nosso sistema");
        } else {
            String insertQuery = "INSERT INTO usuarios (Login, Senha) VALUES (?, ?)";
            try (Connection conn = DriverManager.getConnection(verifier.url, verifier.username, verifier.password);
                 PreparedStatement stmt = conn.prepareStatement(insertQuery)) {

                stmt.setString(1, login);
                stmt.setString(2, senha);

                int rowsInserted = stmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.print("cadastro feito com sucesso");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    public Login(){
        Login_usuario("everton","123");

    }


    public String getLogin() { return login; }

    public String getSenha() { return senha; }
}
