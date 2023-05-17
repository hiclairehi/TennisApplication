/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.binding.Bindings;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Club;
import model.ClubDAOException;
import model.Court;


/**
 *
 * @author jsoler
 */
public class LoginController implements Initializable {
    @FXML
    private TextField nickname;
    
    private BooleanProperty validNickname;
    
    @FXML
    private PasswordField password;
    
    private Club club;
    @FXML
    private Button add;
    @FXML
    private Label errorMessage;
    
    
    
    
    
    
    
    //=========================================================
    // event handler, fired when button is clicked or 
    //                      when the button has the focus and enter is pressed
    //*private void handleButtonAction(ActionEvent event) {
    // labelMessage.setText("Hello, this is your first JavaFX project - IPC");}
    
    //=========================================================
    // you must initialize here all related with the object 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            club= Club.getInstance();
            
        } catch (ClubDAOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            add.disableProperty().bind(Bindings.and(nickname.textProperty().isEmpty(), password.textProperty().isEmpty()));
        
            
                
        
    }

     

  
        
        
//        
//    }

    @FXML
    private void signUp(ActionEvent event) throws IOException {
        FXMLLoader myFXMLloader= new FXMLLoader(getClass().getResource("/views/SignUpFXML.fxml"));
        Parent root= myFXMLloader.load();
        SignUpController signup = myFXMLloader.getController();
        Scene scene= new Scene(root,500,300);
        Stage stage=new Stage();
        stage.setTitle("Sign up");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    @FXML
    private void login(ActionEvent event) {
        // check if the user is Member of the club
        if(!club.existsLogin(nickname.textProperty().getValueSafe())){
            errorMessage.setVisible(true);
            nickname.clear();
            password.clear();
        } else{
            // change window to the home page
        }
    }

    @FXML
    private void availability(ActionEvent event) {
        
    }
    
    
    
}
