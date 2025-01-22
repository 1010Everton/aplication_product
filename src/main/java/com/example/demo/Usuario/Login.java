package com.example.demo.Usuario;



import org.springframework.stereotype.Service;



@Service
public class Login {
    private String login;
    private String senha;
    public void Login_usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;




    }
    public Login(){
        Login_usuario("everton","123");

    }


    public String getLogin() { return login; }

    public String getSenha() { return senha; }
}
