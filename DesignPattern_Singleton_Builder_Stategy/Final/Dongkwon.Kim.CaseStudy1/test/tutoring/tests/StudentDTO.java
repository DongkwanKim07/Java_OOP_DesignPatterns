/** 
 * Assignment 01 concentrates on bringing home the established design patterns learned in the course. Student and Tutor
 * Serve as Strategy for our User context applied through our UserStrat Interface. Builder design pattern is applied on
 * CourseBuilder for fast Course building, and AvailableCourses applies our Singleton design pattern serving as a
 * static board for all users to get information.
 * Course: CST 8288
 * Last updated on: June 24th
 * @author Daniel Barboza and Dongkwon Kim
 */
package tutoring.tests;

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
