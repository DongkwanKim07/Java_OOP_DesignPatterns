/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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

package launch;

import model.ShannonsTheorem;
import view.ShannonPresenter;
import view.ShannonView;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This is main class for this lab03,
 * @author Dongkwan Kim
 */
public class ShannonLaunch01 extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    /**
     * start() method will instantiate container, then add controls/elements
     * to container.
     * nest containers as required and instantiate Scene
     * Then use the primary stage and invoke setScene and show()
     * @param stage corresponds to basic window
     */
    @Override
    public void start(Stage stage){
        ShannonsTheorem model = new ShannonsTheorem();
        ShannonView view = new ShannonView();
        
        Scene scene = new Scene(view);
        
        ShannonPresenter presenter = new ShannonPresenter(model, view);
        
        stage.setScene(scene);
        stage.setTitle("Shannons Theorem");
        stage.show();
        
    }

    
}
