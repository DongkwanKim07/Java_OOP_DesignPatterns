/* Assignment 2 demonstrates DAO design patterns with servlet implementation
 * Course: CST 8288
 * Section: 010
 * Author: Daniel Barboza and Dongkwan Kim based on Algonquin Collge staff code
 * Date: Aug 2022
 */
package transferobjects;

/**
 * CourseDTO models a Course object for data transfer. Course Data Transfer Object
 * has all get and set methods for all attributes of the Course entity.
 * @author Daniel Barboza and Dongkwon Kim
 */
public class CourseDTO {
    private String courseCode;
    private String courseName;
    private String courseDescription;
    
    public String getCourseCode(){
        return courseCode;
    }
    public void setCourseCode(String courseCode){
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
