/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.ConnectionDB;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author dell
 */
public class LoginController implements Initializable{
    
     @FXML
    private Label label;
     
      @FXML
    private TextField tfUsername;
      
       @FXML
    private TextField tfPassword;
       
        @FXML
    private Button btnLogin;
        
            @FXML
    private Button btnInfo;
            
                   @FXML
    private Button btnPartner;
            
               @FXML
    private Button btnInscription;
               
                 @FXML
    private Button btnDeconnexion;
        
          @FXML
    private Label tfError;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       // System.out.println("You clicked me!");
        //label.setText("Hello World!");
        
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
        
        if(event.getSource() == btnInscription)
          {
               try
                {
                    Node node = (Node) event.getSource();
                    Stage stage = (Stage) node.getScene().getWindow();
                    stage.close();
                    
                    Parent root = FXMLLoader.load(getClass().getResource("/view/Inscription.fxml"));
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
        
        if(event.getSource() == btnLogin)
        {
            //login here
            
            if(login().equals("Success"))
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
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    
    public LoginController()
    {
        con = ConnectionDB.getConnection();
    }
    
    //--
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rst = null;
    
    
    // we use the String in order to check the status
    private String login()
    {
        String email = tfUsername.getText().toString();
        String password = tfPassword.getText().toString();
        
        //query
        
        String sql = "SELECT * FROM admins WHERE email = ? AND password = ? ";
        
        try
        {
            st = con.prepareStatement(sql);
            st.setString(1, email);
            st.setString(2, password);
            rst = st.executeQuery();
            if(!rst.next())
            {
                tfError.setTextFill(Color.TOMATO);
                tfError.setText("Username ou password erroné. Entrez les bones données !");
                System.err.println("Mauvais Login.....");
                return "Error";
            }
            else
            {
                 tfError.setTextFill(Color.GREEN);
                tfError.setText("Login successful .... redirecting ...");
                System.out.println("Successful Login...");
                return "Success";
                //showDialog("Login successful", null, "successful");
            }
                    
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return "Exception";
        }
        
    }
    
   // private void showDialog(String info, String header, String title)
    //{
      //  Alert alert =new Alert(Alert.AlertType.CONFIRMATION);
        //alert.setContentText(info);
        //alert.setHeaderText(header);
        //alert.showAndWait();
    //}
    
}
