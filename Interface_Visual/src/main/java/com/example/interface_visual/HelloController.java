package com.example.interface_visual;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class HelloController {

    @FXML
    private Label campoLogin;

    @FXML
    private Label campoSenha;

    @FXML
    private Pane painel;


    @FXML
    protected void onHelloButtonClick(ActionEvent event) {
        String Login = campoLogin.getText();
        String Senha = campoSenha.getText();
        painel.getStyleClass().add("conteudo");
    }
}