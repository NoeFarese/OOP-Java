package ch.css.tannenbaum;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import ch.css.tannenbaum.Tanne;




public class HelloController {

    private Tanne tanne;

    @FXML
    private TextField textFieldStammbreite;

    @FXML
    private TextField textFieldStammhoehe;

    @FXML
    private TextField textFieldKronenhoehe;

    @FXML
    private TextArea textAreaZeichnungsFlaeche;

    @FXML
    private void ButtonClickZeichnen() {
        if (textFieldKronenhoehe.getText().trim().equals("")
                || textFieldStammhoehe.getText().equals("")
                || textFieldStammbreite.getText().equals("")) {
            return;
        }


        Tanne t = new Tanne(Integer.valueOf(textFieldStammbreite.getText())
                , Integer.valueOf(textFieldStammhoehe.getText())
                , Integer.valueOf(textFieldKronenhoehe.getText()));

        t.zeichne();

        textAreaZeichnungsFlaeche.setText(t.getZeichnung());
    }

    @FXML
    private void ButtonExitClick(){
        Platform.exit();
    }

}