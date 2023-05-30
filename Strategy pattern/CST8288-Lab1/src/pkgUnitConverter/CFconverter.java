/**
 * 
 * Student name : Dongkwan Kim
 * Student number : 040993905
 * Course & Section # : 22S_CST8288_010_013
 * Professor: George Kriger and Siju Philip
 * Declaration : This is my own original work and is free from plagiarism.
 */
package pkgUnitConverter;

/**
 * class to convert Celsius to Fahrenheit.
 * THis class implements UniConverter interface class.
 * @author Dongkwan Kim
 * This class is provided for Lab by professor and modified by Dongkwan Kim
 */
public class CFconverter implements  UnitConverter {

	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	/**This method override for convert Celsius to Fahrenheit
	 * @param celsius value in Celsius to be converted
	 * @return equivalent in Fahrenheit
	 */  
        @Override
	public double convert(double celsius) {
		return celsius*convFactor + convOrigin;
	}

 
}
