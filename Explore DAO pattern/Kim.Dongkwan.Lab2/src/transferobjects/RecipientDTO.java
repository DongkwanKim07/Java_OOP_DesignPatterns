
/**
 * Provided for lab02 by professor.
 * Student name : Dongkwan Kim
 * Student number : 040993905
 * Course & Section # : 22S_CST8288_010_013
 * Professor: George Kriger and Siju Philip
 * Description: Demonstration of DAO Design Pattern, MVC Design Pattern
 * Declaration : This is my own original work and is free from plagiarism.
 */

package transferobjects;
/**
 * This is the RecipietnDTO class including getter and setter
 * to get information.
 * @author Dongkwan Kim
 */
public class RecipientDTO {
    private Integer AwardID;
    private String name;
    private int year;
    private String city;
    private String category;
    
    /**
     * This is getter for get Award ID
     * @return return to Award ID
     */
    public int getAwardID(){
        return AwardID;
    }
    /**
     * This is setter for Award ID
     * @param AwardID Award ID from recipients table
     */
    public void setAwardID(Integer AwardID){
        this.AwardID = AwardID;
    }
    /**
     * This is getter for get recipient's name
     * @return return to name
     */
    public String getName(){
    	return name;
    }
    /**
     * This is setter for recipient's name
     * @param name recipient's name from recipients table
     */
    public void setName(String name){
    	this.name = name;
    }
    /**
     * This is getter for year
     * @return return to year
     */
    public int getYear(){
    	return year;
    }
    /**
     * This is setter for year
     * @param year year from recipients table
     */
    public void setYear(int year){
    	this.year = year;
    }
    /**
     * This is getter for city
     * @return return to city
     */
    public String getCity(){
    	return city;
    }
    /**
     * This is setter for city 
     * @param city city from recipients table
     */
    public void setCity(String city){
    	this.city = city;
    }
    /**
     * This is getter for category
     * @return return to category
     */
    public String getCategory(){
        return category;
    }
    /**
     * This is setter for category
     * @param category category from recipients table
     */
    public void setCategory(String category){
        this.category = category;
    }
    
}
