/**
 * Provided for lab02 by professor.
 * Student name : Dongkwan Kim
 * Student number : 040993905
 * Course & Section # : 22S_CST8288_010_013
 * Professor: George Kriger and Siju Philip
 * Description: Demonstration of DAO Design Pattern, MVC Design Pattern
 * Declaration : This is my own original work and is free from plagiarism.
 */

package businesslayer;
/**
 * This is validationException class extends from Exception
 * @author Dongkwan Kim
 */
public class ValidationException extends Exception {
	
	public ValidationException(){
		super("Data not in valid format");
	}
	
	public ValidationException(String message){
		super(message);
	}
	
	public ValidationException(String message, Throwable throwable){
		super(message, throwable);
	}
	
	public ValidationException(Throwable throwable){
		super(throwable);
	}
}
