/* Assignment 2 demonstrates DAO design patterns with servlet implementation
 * Course: CST 8288
 * Section: 010
 * Author: Daniel Barboza and Dongkwan Kim based on Algonquin Collge staff code
 * Date: Aug 2022
 */
package dataaccesslayer;

import java.util.List;

import transferobjects.CourseDTO;

/**
 * CourseDao models a course data access abject. For now our methods will involve
 * reading and displaying our data with getAllCourses method.
 * @author danielbarboza and dongkwankim
 */
public interface CourseDao {
    
    /**
     * getAllCourses returns a list of courseDTOs with all the courses in our db.
     * @return list of all courses
     */
	List<CourseDTO> getAllCourses();
	
}
