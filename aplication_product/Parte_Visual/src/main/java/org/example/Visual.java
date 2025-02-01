package org.example;

import javafx.application.Application;
import javafx.stage.Stage;

public class Visual extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello JavaFX!");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
