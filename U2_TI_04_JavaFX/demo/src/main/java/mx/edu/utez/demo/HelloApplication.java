package mx.edu.utez.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label label = new Label("Hello World");
        Label label2 = new Label("Hello World");
        //StackPane stackPane = new StackPane();
        VBox vbox = new VBox(20, label, label2);

        Button AcceptButton = new Button("Boton Aceptar");
        AcceptButton.setOnAction(e -> {
            label.setText("Aceptar");
        });

        Button cancelButton = new Button("Boton Cancelar");
        cancelButton.setOnAction(e -> {
            label2.setText("Cancelar");
        });

        HBox hbox = new HBox(20, label, label2, AcceptButton, cancelButton);

        Scene scene = new Scene( hbox,800, 600);
        stage.setTitle("Hello!");
        Image image = new Image(getClass().getResourceAsStream("/images/pacman.png"));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}