package ejemplo;

import java.util.HashSet;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Ejemplo2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        //Crear un StackPane
        StackPane stackPane = new StackPane();

        //Crear una imagen y un boton
   
        ImageView imagen = new ImageView(new Image("https://www.blogdelfotografo.com/wp-content/uploads/2014/08/71.jpg"));

        /*
        Image image = new Image("file:src/main/resources/monster5.png");// Cambia a la ruta adecuada
        if (image.isError()) {
            System.out.println("Error al cargar la imagen: " + image.getException());
        } else {
            System.out.println("Imagen cargada correctamente.");
        }
        
        ImageView imagen = new ImageView(image);*/
        
        Button boton1 = new Button("Cancelar todos los servicios");
        //Button boton2 = new Button("Click me");
        //CheckBox checkBox = new CheckBox("Aceptar términos y condiciones");
        
        //Label etiqueta = new Label("Hola a todos");
        //etiqueta.setTextFill(Color.WHITE);

        //stackPane.getChildren().addAll(imagen, boton, boton2);
        stackPane.getChildren().add(imagen);
        stackPane.getChildren().add(boton1);
        //stackPane.getChildren().add(boton2);
        //stackPane.getChildren().add(checkBox);

        //Alineacion
        boton1.setMaxSize(200, 60);
        //StackPane.setAlignment(checkBox, Pos.TOP_CENTER);

        // Crear una escena y mostrarla
        Scene scene = new Scene(stackPane);
        primaryStage.setTitle("StackPane ejemplo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
