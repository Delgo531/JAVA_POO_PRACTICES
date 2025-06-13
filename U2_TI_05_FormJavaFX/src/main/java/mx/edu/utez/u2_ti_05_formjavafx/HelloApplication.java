package mx.edu.utez.u2_ti_05_formjavafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {



        Label labelNombre = new Label("Ingrese su nombre:");
        TextField tfNombre = new TextField();

        Label labelApellido = new Label("Ingrese su apellido:");
        TextField tfApellido = new TextField();

        Label labelEdad = new Label("Ingrese su edad:");
        TextField tfEdad = new TextField();


        Label labelCargo = new Label("Ingrese su cargo:");
        ObservableList<String> cargo = FXCollections.observableArrayList("Estudiante","Profesor","Administrador");
        ComboBox<String> cbCargo = new ComboBox<>(cargo);

        Button btnCrear = new Button("Crear");
        Button btnReset = new Button("Reset");

        Label labelResultado = new Label();

        GridPane gridFormulario = new GridPane();
        gridFormulario.setAlignment(Pos.CENTER);
        gridFormulario.setHgap(10);
        gridFormulario.setVgap(10);

        gridFormulario.add(labelNombre, 0, 0);
        gridFormulario.add(tfNombre, 1, 0);

        gridFormulario.add(labelApellido, 0, 1);
        gridFormulario.add(tfApellido, 1, 1);

        gridFormulario.add(labelEdad, 0, 2);
        gridFormulario.add(tfEdad, 1, 2);

        gridFormulario.add(labelCargo, 0, 3);
        gridFormulario.add(cbCargo, 1, 3);

        gridFormulario.add(btnCrear, 0, 4);
        gridFormulario.add(btnReset, 1, 4);

        gridFormulario.add(labelResultado, 0, 5);

        Scene scene = new Scene(gridFormulario, 500, 300);







        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Formulario UTEZ");
        stage.setScene(scene);
        stage.show();

        btnCrear.setOnAction(e -> {

            String nombre = tfNombre.getText();
            String apellido = tfApellido.getText();
            String edad = tfEdad.getText();

            String puesto = cbCargo.getSelectionModel().getSelectedItem();
            if (nombre.isEmpty() || apellido.isEmpty() || edad.isEmpty() || puesto.isEmpty()) {
                labelResultado.setText("Debes Ingresar todos los datos correctamente");

                gridFormulario.setStyle("-fx-background-color: white;");
                labelResultado.setStyle("-fx-text-fill: black;");
            } else {
                labelResultado.setText("Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nPuesto: " + puesto);
                gridFormulario.setStyle("-fx-background-color: green;");
                labelResultado.setStyle("-fx-text-fill: lightblue;");


            }



        });

        btnReset.setOnAction(e -> {

            tfNombre.setText("");
            tfApellido.setText("");
            tfEdad.setText("");
            cbCargo.getSelectionModel().clearSelection();

            gridFormulario.setStyle("-fx-background-color: white;");
            labelResultado.setStyle("-fx-text-fill: black;");

            labelResultado.setText("");

        });


    }

    public static void main(String[] args) {
        launch();
    }
}