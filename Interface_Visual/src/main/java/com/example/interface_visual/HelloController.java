package com.example.interface_visual;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label campoLogin;
    @FXML
    private Label campoSenha;

    @FXML
    protected void onHelloButtonClick(ActionEvent event) {
        String Login = campoLogin.getText();
        String Senha = campoSenha.getText();

    }
}