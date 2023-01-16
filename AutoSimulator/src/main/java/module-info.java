module ch.css.autosimulator {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.css.autosimulator to javafx.fxml;
    exports ch.css.autosimulator;
}