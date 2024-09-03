package ejemplo;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class GatitoTristeController {

    @FXML
    private Button miBoton;

    @FXML
    private StackPane miPane;

    private Random random = new Random();

    @FXML
    private void initialize() {
        // Asegurarse de que el botón esté habilitado desde el inicio
        if (miBoton != null) {
            miBoton.setDisable(false);
        }
    }

    @FXML
    private void handleButtonClick() {
        if (miPane == null) {
            return;  // Salir si miPane es null
        }

        // Crear un nuevo Text (label) de color rojo
        Text labelRojo = new Text("X");
        labelRojo.setFill(Color.RED);
        labelRojo.setStyle("-fx-font-size: 24;");

        // Obtener el tamaño del StackPane y del Text
        double paneWidth = miPane.getWidth();
        double paneHeight = miPane.getHeight();
        
        
        double textWidth = labelRojo.getLayoutBounds().getWidth();
        double textHeight = labelRojo.getLayoutBounds().getHeight();

        // Posicionar el label en una posición aleatoria dentro del StackPane
        double randomX = random.nextDouble() * (paneWidth ) -150;
        double randomY = random.nextDouble() * (paneHeight )- 150;

        labelRojo.setTranslateX(randomX);
        labelRojo.setTranslateY(randomY);

        // Agregar el label al StackPane
        miPane.getChildren().add(labelRojo);
        
    }
}
