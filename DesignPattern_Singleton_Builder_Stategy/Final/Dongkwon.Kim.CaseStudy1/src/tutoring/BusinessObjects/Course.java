/** 
 * Assignment 01 concentrates on bringing home the established design patterns learned in the course. Student and Tutor
 * Serve as Strategy for our User context applied through our UserStrat Interface. Builder design pattern is applied on
 * CourseBuilder for fast Course building, and AvailableCourses applies our Singleton design pattern serving as a
 * static board for all users to get information.
 * Course: CST 8288
 * Last updated on: June 24th
 * @author Daniel Barboza and Dongkwon Kim
 */
package tutoring.BusinessObjects;

/**
 * Course models a Course entity data transfer object.
 * All get and set methods are available for all attributes.
 * The Course constructor uses a CourseBuilder for instantiation.
 * @author Daniel Barboza and Dongkwon Kim
 */
public class Course {
    
    
    private int courseCode;
    private String courseName;
    private String courseDescription;
    
    /**
     * Course constructor that uses a CourseBuilder for instantiation
     * @param builder the CourseBuilder builder
     */
    public Course (CourseBuilder builder) {    
    }
    
    /**
     * gets course code
     * @return the course code
     */
    public int getCourseCode(){
        return courseCode;
    }
    
    /**
     * sets course code
     * @param courseCode the course code to set 
     */
    public void setCourseCode(int courseCode){
        this.courseCode = courseCode;
    }
    
    /**
     * gets course name
     * @return the course name
     */
    public String getCourseName(){
        return courseName;
    }
    
    /**
     * sets course name
     * @param courseName the course name to set 
     */
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    
    /**
     * gets course description
     * @return the course description
     */
    public String getCourseDescription(){
        return courseDescription;
    }
    
    /**
     * sets course description
     * @param courseDescription the description to set 
     */
    public void setCourseDescription(String courseDescription){
        this.courseDescription = courseDescription;
    }
    
    /**
     * toString returns a more visually pleasing string for courses with only
     * the courseCode and courseName
     * @return 
     */
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(courseCode)).append(" - ").append(this.courseName);
        return sb.toString();
    }
    
    
    
}
