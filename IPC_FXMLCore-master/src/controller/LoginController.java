/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Club;


/**
 *
 * @author jsoler
 */
public class LoginController implements Initializable {
    //private Label labelMessage;
    @FXML
    private Button signUp;
    @FXML
    private TextField nickname;
    @FXML
    private PasswordField password;
    @FXML
    private Button login;
    
    private Club club;
    
    
    //=========================================================
    // event handler, fired when button is clicked or 
    //                      when the button has the focus and enter is pressed
    //*private void handleButtonAction(ActionEvent event) {
    // labelMessage.setText("Hello, this is your first JavaFX project - IPC");}
    
    //=========================================================
    // you must initialize here all related with the object 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

//    @FXML
//    private void signUp(ActionEvent event) throws IOException {
//        FXMLLoader myFXMLloader= new FXMLLoader(getClass().getResource("SignUpFXML"));
//        Parent root= myFXMLloader.load();
//        SignUpController signup = myFXMLloader.getController();
//        Scene scene= new Scene(root,500,300);
//        Stage stage=new Stage();
//        stage.setTitle("Sign up");
//        stage.initModality(Modality.APPLICATION_MODAL);
//        stage.show();
//        
        
        
        
//        
//    }
    
}
