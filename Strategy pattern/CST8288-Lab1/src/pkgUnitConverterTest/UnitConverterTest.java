/**
 * 
 * Student name : Dongkwan Kim
 * Student number : 040993905
 * Course & Section # : 22S_CST8288_010_013
 * Professor: George Kriger and Siju Philip
 * Declaration : This is my own original work and is free from plagiarism.
 */

package pkgUnitConverterTest;

import pkgUnitConverter.*;
/**
 * This class is the class to test classes for converting. This class includes the methods
 * which is test 4 classes for converting Fahrenheit to Celsius and the reverse, Kilogram to Pound and the reverse.
 * 
 * @author DOngkwan Kim
 * This class is provided for Lab01 by professor.
 */
public class UnitConverterTest {

    /**
     *This is main class for Lab01 which is understanding Strategy pattern.
     * This class need to import the package (pkgUnitConverter)
     * This class is provided for Lab01 to run the code FCconverter and CFconverter.
     * And add more methods which is convert to Kilogram to pound, also pound to Kilogram.
     * 
     * @param args command line arguments this is main method for lab01 and simple test 4 classes.
     */
    public static void main(String[] args) {
        
        Converted change = new Converted();
                //this will shows that converted value fahrenheit to celsius
		System.out.printf("%5.2f in Fahrenheit is %5.2f Celsius\n", 70.0, change.changer(70.0));
		//this will shows that converted value celsius to fahrenheit
                change.changeBehavior(new CFconverter());
		System.out.printf("%5.2f in Celsius is %5.2f Fahrenheit\n", 20.0, change.changer(20.0));
		
                //this will shows that converted value kg to lbs
                change.changeBehavior(new KGconverter());
                System.out.printf("%5.3f in KG is %5.3f LBS\n", 1.0, change.changer(1.0));
                //this will shows that converted value lbs to kg
                change.changeBehavior(new LBSconverter());
                System.out.printf("%5.3f in LBS is %5.3f KG\n", 20.0, change.changer(20));
             
                
                
	}

}
