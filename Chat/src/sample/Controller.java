package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public TextArea textArea;
    public TextField textField;
    public String UserName = "Fedor";
    public void sendMessage(){
        if(!textField.getText().isEmpty()){

            textArea.appendText(UserName + ": " + textField.getText() + "\n");
            textField.setText("");
        }
    }

    public void send(ActionEvent actionEvent) {
        sendMessage();
    }

    public void keyPressed(KeyEvent keyEvent) {
        if(keyEvent.getCode().getName().equals("Enter")){
            sendMessage();
        }
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
