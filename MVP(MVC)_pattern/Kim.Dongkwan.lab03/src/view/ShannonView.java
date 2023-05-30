/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Provided for lab03 by professor.
 * Student name : Dongkwan Kim
 * Student number : 040993905
 * Course & Section # : 22S_CST8288_010_013
 * Professor: George Kriger and Siju Philip
 * Description: Demonstration of javaFX Model view present pattern
 * Declaration : This is my own original work and is free from plagiarism.
 */

package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/**
 * This class is view for display. 
 * @author Dongkwan Kim
 */
public class ShannonView extends GridPane{
    
    //Labels
    Label bandWidth = new Label("BandWidth");
    Label sNoiseR = new Label("Signal to Noise Ratio");
    Label maxDataR = new Label("Max Data Rate");
    
    //Fields
    TextField bandWidthFld = new TextField();
    TextField sNoiseRFld = new TextField();
    TextField maxDataRFld = new TextField();
    
    //Button
    Button calculateBtn = new Button("Calculate");
    
    public ShannonView(){
        layoutForm();
    }

    private void layoutForm(){
        this.setHgap(5);
        this.setVgap(5);
        
        this.add(bandWidth, 1, 2);
        this.add(sNoiseR, 1, 3);
        this.add(maxDataR, 1, 4);
        
        this.add(bandWidthFld, 2, 2);
        this.add(sNoiseRFld, 2, 3);
        this.add(maxDataRFld, 2, 4);
        
        maxDataRFld.setEditable(false);
        
        //Add Calculate Button
        VBox buttonBox = new VBox(calculateBtn);
        calculateBtn.setMaxWidth(Double.MAX_VALUE);
        
        this.add(buttonBox, 3, 1, 1, 5);
        
    }
    
}
