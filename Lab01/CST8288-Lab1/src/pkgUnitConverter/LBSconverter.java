
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
 *This class will convert Pound(LBS) to Kilogram(KG)
 * and implement UnitConverter class.
 * Basically 1KG is 2.205LBS.
 * THis class implements UniConverter interface class.
 * This class also override convert method which is convert
 * pound to kilogram.
 * @author Dongkwan Kim
 */
public class LBSconverter implements  UnitConverter{
    private final double convBase=1;
    private final double convOrigin=2.205;
    /**
     * This method override for convert LBS to KG
     * @param LBS this LBS value will be converted to KG
     * @return value after converted (LBS to KG)
     */
    @Override
    public double convert(double LBS) {
        return (LBS*convBase) / convOrigin;
    }
}
