module com.example.flaecherechteckberechnen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.flaecherechteckberechnen to javafx.fxml;
    exports com.example.flaecherechteckberechnen;
}