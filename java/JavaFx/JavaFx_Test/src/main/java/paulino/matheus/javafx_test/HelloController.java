package paulino.matheus.javafx_test;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Olá Mundo! Este é o Scene Builder com JavaFX!");
    }
}
