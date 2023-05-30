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
 * CourseDTO models a Course object for data transfer. Course Data Transfer Object
 * has all get and set methods for all attributes of the Course entity.
 * @author Daniel Barboza and Dongkwon Kim
 */
public class CourseDTO {
    private int courseCode;
    private String courseName;
    private String courseDescription;
    
    public int getCourseCode(){
        return courseCode;
    }
    public void setCourseCode(int courseCode){
        this.courseCode = courseCode;
    }
    
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    
    public String getCourseDescription(){
        return courseDescription;
    }
    public void setCourseDescription(String courseDescription){
        this.courseDescription = courseDescription;
    }
    
    
}
