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
 * This class is the key of this lab01 and represents the strategy Design
 * pattern of unitconverter.
 * @author Dongkwan Kim
 */
public class Converted {
 
    private UnitConverter behavior;
    private double value = 0;

    
    /**
     * There is no arguments constructor to initialize .
     */
    public Converted() {
    this.behavior = new FCconverter();
}
    /**
     * This method calls a converter from behavior
     * @param value this value will be converted
     * @return eqivalent in each converted value
     */
   public double changer(double value){
       this.value = value;
       return behavior.convert(value);
   }
      /**
       * This changebehavior method will use for convert value
       * @param behavior this behavior is abstract object form interface
       */     
   public void changeBehavior(UnitConverter behavior){
       this.behavior = behavior;
   }
}
