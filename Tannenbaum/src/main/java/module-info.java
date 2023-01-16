module com.example.tannenbaum {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ch.css.tannenbaum to javafx.fxml;
    exports ch.css.tannenbaum;
}