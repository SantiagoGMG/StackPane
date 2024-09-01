package ejemplo;

import java.util.HashSet;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ejemplo1 extends Application 
{

    @Override
    public void start(Stage primaryStage) 
    {
        //Crear un StackPane
        StackPane stackPane = new StackPane();

        //Crear una imagen y un boton
        ImageView imagen = new ImageView(new Image("https://www.blogdelfotografo.com/wp-content/uploads/2014/08/71.jpg"));

        Button boton1 = new Button("Cancelar todos los servicios");
        //Button boton2 = new Button("Click me");
        //CheckBox checkBox = new CheckBox("Aceptar términos y condiciones");
        
        //boton1.setTranslateX(200); // Mover en X
        //boton1.setTranslateY(30); // Mover en Y

        //stackPane.getChildren().addAll(imagen, boton1, boton2);
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

    public static void main(String[] args) 
    {
        launch();
    }
}
