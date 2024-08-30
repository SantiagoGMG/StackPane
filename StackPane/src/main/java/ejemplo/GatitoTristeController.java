package ejemplo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.util.Random;

public class GatitoTristeController {

    @FXML
    private Button miBoton;

    @FXML
    private StackPane miStackPane;

    private Random random = new Random();

    @FXML
    private void handleButtonClick() {
        // Crear un nuevo Text (label) de color rojo
        Text labelRojo = new Text("X");
        labelRojo.setFill(Color.RED);

        // Establecer un tamaño y fuente para el Text (opcional)
        labelRojo.setStyle("-fx-font-size: 24;");

        // Posicionar el label en una posición aleatoria dentro del StackPane
        double maxX = miStackPane.getWidth() - labelRojo.getBoundsInLocal().getWidth();
        double maxY = miStackPane.getHeight() - labelRojo.getBoundsInLocal().getHeight();
        double randomX = random.nextDouble() * maxX;
        double randomY = random.nextDouble() * maxY;

        labelRojo.setLayoutX(randomX);
        labelRojo.setLayoutY(randomY);

        // Agregar el label al StackPane
        miStackPane.getChildren().add(labelRojo);
    }
}
