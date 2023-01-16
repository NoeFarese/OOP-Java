package com.example.flaecherechteckberechnen;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField textFieldWidth;
    @FXML
    private TextField textFieldHeight;
    @FXML
    private TextField textFieldResult;

    @FXML
    private void ButtonCalculateClick() {

        textFieldResult.isDisabled();
      /*  if (textFieldWidth.getText().equals("") || textFieldHeight.getText().equals("")) {
            this.showMessageBox("Bitte gib eine Höhe und eine Breite ein.");

            return;
        } */

        try {
            double width = Double.parseDouble(textFieldWidth.getText());
            double height = Double.parseDouble(textFieldHeight.getText());
            double result = width * height;

            Rechteck rechteck = new Rechteck();
            rechteck.setWidth(width);
            rechteck.setHeight(height);

            textFieldResult.setText(String.valueOf(rechteck.getArea()));


            // showMessageBox(String.valueOf(result));
        }
        catch (NumberFormatException ex) {
            this.showMessageBox("Bitte geben Sie eine Zahl ein.");
        }
        catch (Exception ex){
            this.showMessageBox(ex.toString());
        }

        if (textFieldWidth.getText().equals("") || textFieldHeight.getText().equals("")) {
            this.showMessageBox("Bitte gib eine Höhe und eine Breite ein.");

            return;
        }
    }

    private void showMessageBox(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Die Eingabe ist ungültig!");
        alert.setHeaderText("Ungültige oder fehlende Eingabe.");
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    private void ButtonExitClick(){
        Platform.exit();
    }
}