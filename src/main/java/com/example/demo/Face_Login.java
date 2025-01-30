package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Face_Login extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox box = new VBox();
        Button bottonA = new Button("A");
        Button bottonB = new Button("B");


        box.getChildren().add(bottonA);
        box.getChildren().add(bottonB);
        Scene cena = new Scene(box);
        stage.setScene(cena);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
