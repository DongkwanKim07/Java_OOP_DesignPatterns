
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
 * This class will convert Kilogram(KG) to Pound(LBS)
 * and implement UnitConverter class.
 * Basically 1KG is 2.205LBS.
 * THis class implements UniConverter interface class.
 * This class also override convert method which is convert
 * kilogram to pounds.
 * @author Dongkwan Kim
 */
public class KGconverter implements  UnitConverter {
        private final double convBase=1;
    private final double convOrigin=2.205;
    /**
     *  This method override for convert KG to LBS
     * @param kg this KG value will be converted to LBS
     * @return value after converted(KG to LBS)
     */
        @Override
    public double convert(double kg) {
        return kg*convBase*convOrigin;
    }
}
