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

import java.util.HashSet;
import java.util.Set;

/**
 * AvailableCourses applies our singleton design pattern to instantiate a single instance
 * of AvailableCourses of which we can access across the program to print said courses.
 * AvailableCourses is and enum with INSTANCE instance. This instance instantiates a
 * HashSet on to which our available courses are loaded in the constructor.
 * @author Daniel Barboza and Dongkwon Kim
 */
public enum AvailableCourses {
    
    INSTANCE;
    
    private Set<Course> courses;
    
    /**
     * Default constructor for AvailableCourses INSTANCE adds our available courses
     * from this unique instance.
     * to our private set of courses.
     */
    AvailableCourses() {
        courses = new HashSet<>();
        
        Course cst8109 = CourseBuilder.create().courseCode(8109).courseName("Network Programming").courseDescription("Advanced Networking").build();
        Course cst8909 = CourseBuilder.create().courseCode(8909).courseName("Advanced OOP").courseDescription("Advanced OOP").build();
        Course cst9999 = CourseBuilder.create().courseCode(9999).courseName("Systems Analysis and Design").courseDescription("Project Management 101").build();
        
        courses.add(cst8109);
        courses.add(cst8909);
        courses.add(cst9999);
       
    }
    
    /**
     * Returns the available courses from our private set of courses from this
     * unique instance.
     * @return the courses that are available in our tutoring app
     */
    public String getCourses() {
       
        String theCourses = "";
        
        System.out.println("Available Courses:");
        
        for (Course course : courses ) {
            theCourses = theCourses + course.toString() + "\n";
        }

        return theCourses;
    }
    
  
}
