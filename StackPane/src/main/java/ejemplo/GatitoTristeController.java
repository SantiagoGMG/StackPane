package ejemplo;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.util.Random;

public class GatitoTristeController {

    @FXML
    private Button miBoton;

    @FXML
    private Pane miPane;  // Pane dentro del StackPane

    private Random random = new Random();

    @FXML
    private void initialize() {
        // Agregar un ChangeListener para esperar a que el Pane esté completamente inicializado
        miPane.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                miBoton.setDisable(false);  // Habilitar el botón cuando el Pane tenga un ancho válido
            }
        });
        
        miBoton.setDisable(true);  // Deshabilitar el botón hasta que el Pane esté listo
    }

    @FXML
    private void handleButtonClick() {
        // Crear un nuevo Text (label) de color rojo
        Text labelRojo = new Text("X");
        labelRojo.setFill(Color.RED);

        // Establecer un tamaño y fuente para el Text (opcional)
        labelRojo.setStyle("-fx-font-size: 24;");

        // Posicionar el label en una posición aleatoria dentro del Pane
        double maxX = miPane.getWidth() - labelRojo.getBoundsInLocal().getWidth();
        double maxY = miPane.getHeight() - labelRojo.getBoundsInLocal().getHeight();
        double randomX = random.nextDouble() * maxX;
        double randomY = random.nextDouble() * maxY;

        labelRojo.setLayoutX(randomX);
        labelRojo.setLayoutY(randomY);

        // Agregar el label al Pane
        miPane.getChildren().add(labelRojo);
    }
}
