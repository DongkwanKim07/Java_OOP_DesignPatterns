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

//import java.awt.geom.Arc2D.Double;
import static java.lang.Double.parseDouble;
import java.util.regex.Pattern;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import model.ShannonsTheorem;

/**
 * This class bind between classes.
 * @author Dongkwan Kim
 */
public class ShannonPresenter {
	private final ShannonsTheorem model;
	private final ShannonView view;
	private final SimpleStringProperty bandWidthInternal = new SimpleStringProperty();
	private final SimpleStringProperty sNoiseRInternal= new SimpleStringProperty();
        private final SimpleStringProperty maxDataRInternal = new SimpleStringProperty();
        private int inputErr = 0;
	
        /**
         * This part uses for bind between classes
         * @param model this is shannons theorem
         * @param view this is view for display
         */
	public ShannonPresenter(ShannonsTheorem model, ShannonView view) {
		this.model = model;
		this.view = view;
	//	bindToModel(); 
		attachViewEvents();
	}


 
        private void attachViewEvents(){
            view.bandWidthFld.textProperty().addListener(new ChangeListener<String>(){
                @Override
                public void changed(final ObservableValue<? extends String> observable, final String oldvalue, final String newValue){
                    if (isDouble(newValue)){
                        bandWidthInternal.set(newValue);
                        model.setBandWidth(Double.parseDouble(bandWidthInternal.get()));

                    }
                    else{
                        inputErr++;
                    }
                }
                });
            
              view.sNoiseRFld.textProperty().addListener(new ChangeListener<String>(){
                @Override
                public void changed(final ObservableValue<? extends String> observable, final String oldvalue, final String newValue){
                    if (isDouble(newValue)){
                        sNoiseRInternal.set(newValue);
                        model.setSignalToNoiseRatio(Double.parseDouble(sNoiseRInternal.get()));
                    }
                    else{
                        inputErr++;
                    }
                }
                });
            
            view.calculateBtn.setOnAction(e -> calculateData());
            
            }
        
        
	private void calculateData() {
                view.maxDataRFld.setText("");
                if (inputErr > 0){
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setTitle("INput Error");
                    alert.setHeaderText("Please enter a valid number and not : ");
                    alert.setContentText(view.bandWidthFld.textProperty().get() + "\n" + view.sNoiseRFld.textProperty().get());
                    alert.showAndWait();
                }
                else {
                    maxDataRInternal.set(String.valueOf(model.maxDataRate(model.getBandWidth(), model.getSignalToNoiseRatio())));
                    view.maxDataRFld.setText(maxDataRInternal.get());
                }
                inputErr = 0;
	//	double isCalcualte = model.maxDataRate();	
	}
       /**
        * 
        * @param str String value
        * @return if this vlaue is double, it will return true
        */ 
        public boolean isDouble(String str){
            
            boolean message = false;
            String regex = "[+-]?([0-9]*[.])?[0-9]+";
            
            if (Pattern.matches(regex, str)){
                message = true;
            }
            return message;
        }
        
}//class

