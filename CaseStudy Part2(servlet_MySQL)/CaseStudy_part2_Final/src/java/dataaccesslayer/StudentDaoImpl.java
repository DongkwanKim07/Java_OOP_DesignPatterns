/* Assignment 2 demonstrates DAO design patterns with servlet implementation
 * Course: CST 8288
 * Section: 010
 * Author: Daniel Barboza and Dongkwan Kim based on Algonquin Collge staff code
 * Date: Aug 2022
 */
package dataaccesslayer;

import java.util.List;

import transferobjects.StudentDTO;

import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import transferobjects.CredentialsDTO;


/**
 * StudentDaoImpl is the implementation of our StudentDao data access object. Our sole
 * method to implement is the reading method getAllStudents, which returns all the
 * Students in our database.
 * @author danielbarboza and dongkwankim
 */
public class StudentDaoImpl implements StudentDao{
    private CredentialsDTO creds;

    /**
     * Constructor with credential parameter.
     * @param creds the credentials
     */
    public StudentDaoImpl(CredentialsDTO creds) {
        this.creds = creds;
    }
    
    
     /**
     * getAllStudents implements the data access object read method getAllStudents.
     * @return the list of Students in our database.
     */
    @Override
	public List<StudentDTO> getAllStudents() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<StudentDTO> students = null;
		try{
			DataSource ds = new DataSource(creds);
			con = ds.createConnection();
			pstmt = con.prepareStatement(
					"SELECT studentID, firstName, lastName FROM student ORDER BY studentID");
			rs = pstmt.executeQuery();
			students = new ArrayList<StudentDTO>();
			while(rs.next()){
				StudentDTO student = new StudentDTO();
				student.setStudentID(new Integer(rs.getInt("studentID")));
				student.setFirstName(rs.getString("firstName"));
				student.setLastName(rs.getString("lastName"));
				students.add(student);
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
		return students;
	}
    
	
	
}
