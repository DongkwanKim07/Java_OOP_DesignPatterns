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
 * CourseBuilder models a builder strategy for building Courses.
 * @author Daniel Barboza and Dongkwon Kim
 */
public class CourseBuilder {
    
    
    private int courseCode;
    private String courseName;
    private String courseDescription;
    
    /**
     * Private default constructor
     */
    private CourseBuilder () { 
    }
    
    /**
     * create creates a new course builder
     * @return the new course builder to build upon
     */
    public static CourseBuilder create() {
        return new CourseBuilder();
    }
    
    /**
     * Gets course code
     * @return the course code
     */
    public int getCourseCode(){
        return courseCode;
    }
    
    /**
     * courseCode returns a CourseBuilder with the course code added information
     * @param courseCode the corse code to add
     * @return the modified Course builder
     */
    public CourseBuilder courseCode(int courseCode){
        this.courseCode = courseCode;
        return this;
    }
    
    /**
     * gets course name
     * @return the course name
     */
    public String getCourseName(){
        return courseName;
    }
    
    /**
     * courseName returns CourseBuilder with the added course name information.
     * @param courseName the course name to add
     * @return the modified CourseBuilder
     */
    public CourseBuilder courseName(String courseName){
        this.courseName = courseName;
        return this;
    }
    
    /**
     * gets course description
     * @return the course description
     */
    public String getCourseDescription(){
        return courseDescription;
    }
    
    /**
     * courseDescription returns CourseBuilder with added course description information.
     * @param courseDescription the course description to add
     * @return the modified CourseBuilder
     */
    public CourseBuilder courseDescription(String courseDescription){
        this.courseDescription = courseDescription;
        return this;
    }
    
    /**
     * build returns a Course object with all the attributes that were added
     * through CourseBuilder methods.
     * @return the new built course
     */
    public Course build() {
        return new Course(this);
    }
    
    
    
}
