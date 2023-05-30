/* Assignment 2 demonstrates DAO design patterns with servlet implementation
 * Course: CST 8288
 * Section: 010
 * Author: Daniel Barboza and Dongkwan Kim based on Algonquin Collge staff code
 * Date: Aug 2022
 */
package dataaccesslayer;

import java.util.List;

import transferobjects.CourseDTO;

import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import transferobjects.CredentialsDTO;



/**
 * CourseDaoImpl is the implementation of our CourseDao data access object. Our sole
 * method to implement is the reading method getAllCourses, which returns all the
 * courses in our database.
 * @author danielbarboza and dongkwankim
 */
public class CourseDaoImpl implements CourseDao{
    private CredentialsDTO creds;

    /**
     * Constructor with credential parameter.
     * @param creds the credentials
     */
    public CourseDaoImpl(CredentialsDTO creds) {
        this.creds = creds;
    }
    
    
    /**
     * getAllCourses implements the data access object read method getAllCourses.
     * @return the list of courses in our database.
     */
	@Override
	public List<CourseDTO> getAllCourses() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<CourseDTO> courses = null;
		try{
			DataSource ds = new DataSource(creds);
			con = ds.createConnection();
			pstmt = con.prepareStatement(
					"SELECT courseCode, courseName, courseDescription FROM course ORDER BY courseCode");
			rs = pstmt.executeQuery();
			courses = new ArrayList<CourseDTO>();
			while(rs.next()){
				CourseDTO course = new CourseDTO();
				course.setCourseCode(rs.getString("courseCode"));
                                course.setCourseName(rs.getString("courseName"));
                                course.setCourseDescription(rs.getString("courseDescription"));
				courses.add(course);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{ if(rs != null){ rs.close(); } }
			catch(SQLException ex){System.out.println(ex.getMessage());}
			try{ if(pstmt != null){ pstmt.close(); }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
			try{ if(con != null){ con.close(); }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
		}
		return courses;
	}

	
}
