package mx.edu.utez.demo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
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

        Label lblNombre = new Label("Nombre");
        TextField tfNombre = new TextField();
        Label lblApellido = new Label("Apellido");
        TextField tfApellido = new TextField();
        Label lblEmail = new Label("Comentarios");
        TextArea tfComentario = new TextArea();
        Label lblGrupo = new Label("Grupo");
        ObservableList<String> grupos = FXCollections.observableArrayList("3A", "3B", "3C");
        ComboBox<String> cbGrupo = new ComboBox<>(grupos);
        Button btnEnviar = new Button("Enviar");
        Label lblResultado = new Label();

        btnEnviar.setOnAction(e -> {
            String nombre = tfNombre.getText();
            String apellido = tfApellido.getText();
            String comentario = tfComentario.getText();
            String grupo = cbGrupo.getSelectionModel().getSelectedItem();
            if (nombre.isEmpty() || apellido.isEmpty() || comentario.isEmpty()) {
                lblResultado.setText("Debes ingresar todos los campos");
            } else {
                lblResultado.setText("El nombre es " + nombre + " Apellido: " + apellido + " Comentario: " + comentario + " Grupo: " + grupo);
            }
        });
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);

        root.add(lblNombre, 0, 0);
        root.add(tfNombre, 1, 0);
        root.add(lblApellido, 0, 1);
        root.add(tfApellido, 1, 1);
        root.add(lblEmail, 0, 2);
        root.add(tfComentario, 1, 2);
        root.add(lblGrupo, 0, 3);
        root.add(cbGrupo, 1, 3);
        root.add(btnEnviar, 0, 4);
        root.add(lblResultado, 1, 5);



        //blablablablabla
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

        Scene scene = new Scene( root,800, 600);
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