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
 * class to convert Fahrenheit to Celsius
 * THis class implements UniConverter interface class.
 * @author kriger
 * This class is provided for Lab01 by professor.
 */
public class FCconverter implements  UnitConverter{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	
	/**
         * This method override for convert Fahrenheit to Celsius
	 * @param fahrenheit value in Fahrenheit to be converted
	 * @return equivalent in Celsius
	 */
        @Override
	public double convert(double fahrenheit) {
		return (fahrenheit - convOrigin)/convFactor;
	}

 
}
