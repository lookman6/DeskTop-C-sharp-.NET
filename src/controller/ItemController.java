/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Plat;

/**
 *
 * @author dell
 */
public class ItemController {
    
    
    @FXML
    private ImageView imPlat;

    @FXML
    private Label lbNom;

    @FXML
    private Label lbPrix;
    
    private Plat plat;
    
    public void setData(Plat plat)
    {
        this.plat=plat;
        lbNom.setText(plat.getName());
        lbPrix.setText(  plat.getPrice() + ClientController.CURRENCY);
        Image image = new Image(getClass().getResourceAsStream(plat.getImgSrc()));
        imPlat.setImage(image);
    }
    
}
