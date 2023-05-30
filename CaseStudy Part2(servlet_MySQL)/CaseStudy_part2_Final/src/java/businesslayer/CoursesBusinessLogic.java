/* Assignment 2 demonstrates DAO design patterns with servlet implementation
 * Course: CST 8288
 * Section: 010
 * Author: Daniel Barboza and Dongkwan Kim based on Algonquin Collge staff code
 * Date: Aug 2022
 */
package businesslayer;

import java.util.List;
import dataaccesslayer.CourseDao;
import dataaccesslayer.CourseDaoImpl;
import transferobjects.CourseDTO;
import transferobjects.CredentialsDTO;


/**
 * CourseBusinessLogic models the business logic for course data access objects.
 * @author danielbarboza and dongkwankim
 */
public class CoursesBusinessLogic {
	
        
	private CourseDao courseDao = null;
	private CredentialsDTO creds;
        
        /**
         * Constructor calls a CourseDaoImpl object, the implementation of
         * course data access object, with credential parameters.
         * @param creds the credentials for database access.
         */
	public CoursesBusinessLogic(CredentialsDTO creds){
		courseDao = new CourseDaoImpl(creds);
	}
	
        /**
         * getAllCourses method returns a list of courses in our db.
         * @return All courses from our database
         */
	public List<CourseDTO> getAllCourses(){
		return courseDao.getAllCourses();
	}
        

}
