package com.example.interface_visual;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {
        // Criando os componentes da interface
        Label senhaLabel = new Label("Senha");
        Label welcomeText = new Label("Login");
        Button confirmarButton = new Button("Confirmar");

        // Adicionando ação ao botão
        confirmarButton.setOnAction(event -> welcomeText.setText("Botão pressionado!"));

        // Criando o layout VBox
        VBox vbox = new VBox(20, senhaLabel, welcomeText, confirmarButton);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(20));

        // Criando a cena e configurando o palco
        Scene scene = new Scene(vbox, 280, 308);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}