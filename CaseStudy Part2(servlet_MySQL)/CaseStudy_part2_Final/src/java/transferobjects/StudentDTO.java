/* Assignment 2 demonstrates DAO design patterns with servlet implementation
 * Course: CST 8288
 * Section: 010
 * Author: Daniel Barboza and Dongkwan Kim based on Algonquin Collge staff code
 * Date: Aug 2022
 */
package transferobjects;

/**
 * StudentDTO models a Course object for data transfer. Student Data Transfer Object
 * has all get and set methods for all attributes of the Student entity.
 * @author Daniel Barboza and Dongkwon Kim
 */
public class StudentDTO {
    private Integer studentID;
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;
                               
    
    public Integer getStudentID(){
        return studentID;
    }
    public void setStudentID(Integer studentID){
        this.studentID = studentID;
    }
    
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
}
