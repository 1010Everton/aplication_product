package com.example.interface_visual;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class HelloApplication extends Application {

    private double xOffset = 0;
    private double yOffset = 0;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/PainelGrafico.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);

        // Tornar a janela transparente
        stage.initStyle(StageStyle.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT);

        // Tornar a janela arrastável
        root.setOnMousePressed((MouseEvent event) -> {
            if (event.getButton() == MouseButton.PRIMARY) {
                xOffset = stage.getX() - event.getScreenX();
                yOffset = stage.getY() - event.getScreenY();
                scene.setCursor(Cursor.MOVE); // Correção: setCursor() na Scene
            }
        });

        root.setOnMouseDragged((MouseEvent event) -> {
            if (event.getButton() == MouseButton.PRIMARY) {
                stage.setX(event.getScreenX() + xOffset);
                stage.setY(event.getScreenY() + yOffset);
            }
        });

        root.setOnMouseReleased((MouseEvent event) -> {
            if (event.getButton() == MouseButton.PRIMARY) {
                scene.setCursor(Cursor.DEFAULT); // Correção: setCursor() na Scene
            }
        });


        stage.setScene(scene);
        stage.show();
    }




    public static void main(String[] args) {
        launch();
    }
}