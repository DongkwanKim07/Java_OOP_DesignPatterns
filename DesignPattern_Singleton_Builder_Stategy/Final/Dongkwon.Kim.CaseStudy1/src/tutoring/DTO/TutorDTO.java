/** 
 * Assignment 01 concentrates on bringing home the established design patterns learned in the course. Student and Tutor
 * Serve as Strategy for our User context applied through our UserStrat Interface. Builder design pattern is applied on
 * CourseBuilder for fast Course building, and AvailableCourses applies our Singleton design pattern serving as a
 * static board for all users to get information.
 * Course: CST 8288
 * Last updated on: June 24th
 * @author Daniel Barboza and Dongkwon Kim
 */
package tutoring.DTO;

/**
 * TutorDTO models a Tutor object for data transfer. Tutor Data Transfer Object
 * has all get and set methods for all attributes of the Tutor entity.
 * @author Daniel Barboza and Dongkwon Kim
 */

public class TutorDTO {
    private Integer tutorID;
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;
    private String status;
    private Integer experienceID;
    
    public Integer getTutorID(){
        return tutorID;
    }
    public void setTutorID(Integer tutorID){
        this.tutorID = tutorID;
    }
    
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getFirstName(){
        return lastName;
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
    
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    
    public Integer getExperienceID(){
        return experienceID;
    }
    public void setExperienceID(Integer experienceID){
        this.experienceID = experienceID;
    }

}
