package ejemplo;
    
import java.util.HashSet;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;


public class Ejemplo2 extends Application 
{
    @Override
    public void start(Stage primaryStage) 
    {
        //Crear un StackPane
        StackPane stackPane = new StackPane();

        //Crear una imagen y un boton
        ImageView imagen = new ImageView(new Image("C:\\Users\\Lenovo\\Documents\\GitHub\\StackPane\\StackPane\\src\\main\\resources\\gatito.jpg"));
        Button boton = new Button("Cancelar todos los servicios");
        Button boton2 = new Button("Click me");
        //Label etiqueta = new Label("Hola a todos");
        //etiqueta.setTextFill(Color.WHITE);
        
        //stackPane.getChildren().addAll(imagen, boton, boton2);
        stackPane.getChildren().add(imagen);
        stackPane.getChildren().add(boton);
        stackPane.getChildren().add(boton2);
        
        //Alineacion
        //StackPane.setAlignment(boton, Pos.CENTER_RIGHT);
        boton.setMinSize(100, 40);
        boton.setPrefSize(150, 50);
        boton.setMaxSize(200, 60);

        
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
