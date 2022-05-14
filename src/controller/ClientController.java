/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author dell
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import model.Plat;

/**
 *
 * @author dell
 */




public class ClientController implements Initializable {
    
    public static final String CURRENCY = "DH";
    
      @FXML
    private Button btnDeconnexion;

    @FXML
    private Button btnInfo;

    @FXML
    private Button btnPartner;

    @FXML
    private GridPane grid;

    @FXML
    private ScrollPane scroll;
    
    private List<Plat> plats = new ArrayList();
    
    private List<Plat> getData()
    {
        List<Plat> plats = new ArrayList<>();
        Plat plat;
        
       // for(int i = 0; i<20; i++)
       // {
            plat = new Plat();
            plat.setName("Riz Yassa");
            plat.setPrice(30);
            plat.setImgSrc("/img/RizYassa.png");
            plat.setColor("F4FEFF");
            plats.add(plat);
            
            plat = new Plat();
            plat.setName("Caracolo");
            plat.setPrice(30);
            plat.setImgSrc("/img/Caracolo.png");
            plat.setColor("F4FEFF");
            plats.add(plat);
            
            plat = new Plat();
            plat.setName("Cari");
            plat.setPrice(30);
            plat.setImgSrc("/img/CariSudeAfrcain.png");
            plat.setColor("F4FEFF");
            plats.add(plat);
            
            plat = new Plat();
            plat.setName("Chicken_Ragout");
            plat.setPrice(30);
            plat.setImgSrc("/img/Chickenragou.png");
            plat.setColor("F4FEFF");
            plats.add(plat);
            
            plat = new Plat();
            plat.setName("Deguè");
            plat.setPrice(12);
            plat.setImgSrc("/img/Degue.png");
            plat.setColor("F4FEFF");
            plats.add(plat);
            
            plat = new Plat();
            plat.setName("Harira");
            plat.setPrice(5);
            plat.setImgSrc("/img/HariraMarocain.png");
            plat.setColor("F4FEFF");
            plats.add(plat);
            
            plat = new Plat();
            plat.setName("Thieboudienne");
            plat.setPrice(25);
            plat.setImgSrc("/img/RizThieboudienne.png");
            plat.setColor("F4FEFF");
            plats.add(plat);
            
            plat = new Plat();
            plat.setName("Tagine");
            plat.setPrice(220);
            plat.setImgSrc("/img/TaginCouscous.png");
            plat.setColor("F4FEFF");
            plats.add(plat);
            
            plat = new Plat();
            plat.setName("Tchep");
            plat.setPrice(31);
            plat.setImgSrc("/img/TcheptSenegalais.png");
            plat.setColor("F4FEFF");
            plats.add(plat);
            
            plat = new Plat();
            plat.setName("Bissap");
            plat.setPrice(5);
            plat.setImgSrc("/img/bissap.png");
            plat.setColor("F4FEFF");
            plats.add(plat);
            
            plat = new Plat();
            plat.setName("Vegetarien");
            plat.setPrice(30);
            plat.setImgSrc("/img/couscousvegetarien.png");
            plat.setColor("F4FEFF");
            plats.add(plat);
            
            plat = new Plat();
            plat.setName("sauce arachide");
            plat.setPrice(30);
            plat.setImgSrc("/img/rizsaucearachide.png");
            plat.setColor("F4FEFF");
            plats.add(plat);
            
            plat = new Plat();
            plat.setName("steck pomme de terre");
            plat.setPrice(30);
            plat.setImgSrc("/img/steckGrillerPommeDeTerre.png");
            plat.setColor("F4FEFF");
            plats.add(plat);
            
            
      //  }
        return plats;
    }
    
    private void setChosenPlat(Plat plat)
    {
        
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        //System.out.println("You clicked me!");
        //label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        plats.addAll(getData());
        int column = 0;
        int row = 1;
        try
        {
      
        for(int i = 0; i<plats.size(); i++)
        {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/view/Item.fxml"));
            
            AnchorPane anchorPane = fxmlLoader.load();
            
            ItemController itemController = fxmlLoader.getController();
            itemController.setData(plats.get(i));
            
            if(column == 3)
            {
                column = 0;
                row++;
            }
            
            grid.add(anchorPane, column++, row);
            //set grid width
            grid.setMinWidth(Region.USE_COMPUTED_SIZE);
            grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
            grid.setMaxWidth(Region.USE_PREF_SIZE);
            
             //set grid Height
            grid.setMinHeight(Region.USE_COMPUTED_SIZE);
            grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
            grid.setMaxHeight(Region.USE_PREF_SIZE);
            
            
            GridPane.setMargin(anchorPane,new Insets(10));
            
            
        }
              
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }  
    
}
