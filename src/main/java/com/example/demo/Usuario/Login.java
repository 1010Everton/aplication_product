package com.example.demo.Usuario;

import com.example.demo.Acesso_Ao_Banco.Verifica;
import org.springframework.stereotype.Service;

@Service
public class Login {
    private String login;
    private String senha;
    Verifica verifier = new Verifica();
    public void Login_usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;


        if (verifier.checkLogin(this.login, this.senha)) {
            System.out.print("usuario ja cadastrado em nosso sistema");
        } else {
            System.out.print("cadastro feito com sucesso");
        }

    }
    public Login(){
        Login_usuario("everton","123");

    }


    public String getLogin() { return login; }

    public String getSenha() { return senha; }
}
