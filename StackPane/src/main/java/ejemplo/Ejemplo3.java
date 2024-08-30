package ejemplo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// El punto de entrada de una app JavaFX debe heredar de Application
public class Ejemplo3 extends Application {

    // Implementa el método 'start' definido en Application
    public void start (Stage stage) throws Exception {
        // Esta instrucción abre el archivo FXML con la GUI de la aplicación
        // y lo parsea como un árbol de elementos JavaFX
        Parent root = FXMLLoader.load(
                getClass().getResource("/GatitoTriste.fxml"));

        // Crea una nueva escena con el árbol de elementos leido en la
        // sentencia anterior como su jerarquía de controles
        Scene scene = new Scene(root);

        stage.setTitle("Pikachu");
        
     
        // Indica al escenario que muestre la escena que cargamos desde el
        // archivo FXML
        stage.setScene(scene);
        
        // Indica a la ventana (el escenario) que se muestre
        stage.show();
    }

    // Punto de inicio de la aplicación que llama al método 'launch' de Application
    public static void main(String[] args) {
         Application.launch(args);
    }
}
