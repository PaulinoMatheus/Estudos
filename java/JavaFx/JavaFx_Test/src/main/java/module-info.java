module paulino.matheus.javafx_test {
    requires javafx.controls;
    requires javafx.fxml;


    opens paulino.matheus.javafx_test to javafx.fxml;
    exports paulino.matheus.javafx_test;
}