/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author dell
 */
public class PartnerController implements Initializable{
    
     @FXML
    private Label label;
     
     @FXML
    private Button btnDeconnexion;
     
     @FXML
    private Button btnPartner;
     
     @FXML
    private Button btnInfo;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        //System.out.println("You clicked me!");
        //label.setText("Hello World!");
        
         if(event.getSource() == btnDeconnexion)
          {
               try
                {
                    Node node = (Node) event.getSource();
                    Stage stage = (Stage) node.getScene().getWindow();
                    stage.close();
                    
                    Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
                catch(Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
          }
         
          if(event.getSource() == btnPartner)
          {
               try
                {
                    Node node = (Node) event.getSource();
                    Stage stage = (Stage) node.getScene().getWindow();
                    stage.close();
                    
                    Parent root = FXMLLoader.load(getClass().getResource("/view/Partner.fxml"));
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
                catch(Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
          }
          
           if(event.getSource() == btnInfo)
          {
               try
                {
                    Node node = (Node) event.getSource();
                    Stage stage = (Stage) node.getScene().getWindow();
                    stage.close();
                    
                    Parent root = FXMLLoader.load(getClass().getResource("/view/FXMLDocument.fxml"));
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
                catch(Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
          }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
}
