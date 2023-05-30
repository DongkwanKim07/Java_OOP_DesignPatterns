/* Assignment 2 demonstrates DAO design patterns with servlet implementation
 * Course: CST 8288
 * Section: 010
 * Author: Daniel Barboza and Dongkwan Kim based on Algonquin Collge staff code
 * Date: Aug 2022
 */
package businesslayer;

import java.util.List;
import dataaccesslayer.StudentDao;
import dataaccesslayer.StudentDaoImpl;
import transferobjects.StudentDTO;
import transferobjects.CredentialsDTO;



/**
 * StudentBusinessLogic models the business logic for student data access objects.
 * @author danielbarboza and dongkwankim
 */
public class StudentBusinessLogic {
	
        
	private StudentDao studentDao = null;
	private CredentialsDTO creds;
        
        
        /**
         * Constructor calls a StudentDaoImpl object, the implementation of
         * student data access object, with credential parameters.
         * @param creds the credentials for database access.
         */
	public StudentBusinessLogic(CredentialsDTO creds){
		studentDao = new StudentDaoImpl(creds);
	}
	
       /**
         * getAllStudents method returns a list of students in our db.
         * @return All students from our database
         */
	public List<StudentDTO> getAllStudents(){
		return studentDao.getAllStudents();
	}
      
}
