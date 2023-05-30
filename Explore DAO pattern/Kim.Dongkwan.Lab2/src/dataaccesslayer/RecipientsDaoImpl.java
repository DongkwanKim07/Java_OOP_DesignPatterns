/**
 * Provided for lab02 by professor.
 * Student name : Dongkwan Kim
 * Student number : 040993905
 * Course & Section # : 22S_CST8288_010_013
 * Professor: George Kriger and Siju Philip
 * Description: Demonstration of DAO Design Pattern, MVC Design Pattern
 * Declaration : This is my own original work and is free from plagiarism.
 */


package dataaccesslayer;


import java.util.List;
import transferobjects.RecipientDTO;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;

/**
 * This class will Implements all the methods from recipientsDao class
 * All methods to access database will define in this class
 * @author Dongkwan Kim
 */
public class RecipientsDaoImpl implements RecipientsDao {
    
    /**
     * Override, this will get all recipients using sql ("SELECT, FROM, ORDER BY")
     * @return return to list from database
     */
	@Override
	public List<RecipientDTO> getAllRecipients() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<RecipientDTO> recipients = null;
		try{
			DataSource ds = new DataSource();
			con = ds.createConnection();
			pstmt = con.prepareStatement(
					"SELECT AwardID, Name, Year, City, Category FROM Recipients ORDER BY AwardID");
			rs = pstmt.executeQuery();
			recipients = new ArrayList<RecipientDTO>();
                        
                                 ResultSetMetaData rsmd= rs.getMetaData();
                                int count = rsmd.getColumnCount();
                                         System.out.println("This is metaData");
                                    for(int i = 1; i <= count; i++){
                                       
                                       System.out.printf("%-8s", rsmd.getColumnName(i));
                                       System.out.printf("%-8s", rsmd.getColumnType(i));
                                       System.out.printf("%-8s", rsmd.getColumnClassName(i));
                                       System.out.println();                                 
                                    }
                                
                        
			while(rs.next()){
				RecipientDTO recipient = new RecipientDTO();
				recipient.setAwardID(rs.getInt("AwardID"));
				recipient.setName(rs.getString("Name"));
				recipient.setYear(rs.getInt("Year"));
                                recipient.setCity(rs.getString("City"));
                                recipient.setCategory(rs.getString("Category"));
				recipients.add(recipient);
                                
                       
			}
                          System.out.println();
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
		return recipients;
	}

        /**
         * This method gets one row from database by Award ID
         * Also include sql 
         * @param AwardID This is a primary key in recipients table
         * @return one row from database by ID
         */
	@Override
	public RecipientDTO getRecipientByAwardID(Integer AwardID) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		RecipientDTO recipient = null;
		try{
			DataSource ds = new DataSource();
			con = ds.createConnection();
			pstmt = con.prepareStatement(
					"SELECT AwardID, Name, Year, City,Category FROM Recipients WHERE AwardID = ?");
			pstmt.setInt(1, AwardID.intValue());
			rs = pstmt.executeQuery();
			while(rs.next()){
				recipient = new RecipientDTO();
				recipient.setAwardID(rs.getInt("AwardID"));
				recipient.setName(rs.getString("Name"));
				recipient.setYear(rs.getInt("Year"));
                                recipient.setCity(rs.getString("City"));
                                recipient.setCategory(rs.getString("Category"));       
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
		return recipient;
	}

        /**
         * This is add method to database using INSERT INTO sql
         * @param recipient recipient who will add to database
         */
	@Override
	public void addRecipient(RecipientDTO recipient) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try{
			DataSource ds = new DataSource();
			con = ds.createConnection();
			// do not insert AwardID, it is generated by Database
			pstmt = con.prepareStatement(
					"INSERT INTO Recipients (Name, Year, City, Category) " +
			        "VALUES(?, ?, ?, ?)");
			pstmt.setString(1, recipient.getName());
			pstmt.setInt(2, recipient.getYear());
                        pstmt.setString(3, recipient.getCity());
                        pstmt.setString(4, recipient.getCategory());
			pstmt.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{ if(pstmt != null){ pstmt.close(); }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
			try{ if(con != null){ con.close(); }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
		}
	}

        /**
         * This is update method to database using UPDATE sql
         * @param recipient recipient who need to updat information
         */
	@Override
	public void updateRecipient(RecipientDTO recipient) {
			Connection con = null;
			PreparedStatement pstmt = null;
			try{
				DataSource ds = new DataSource();
				con = ds.createConnection();
				pstmt = con.prepareStatement(
                                        "UPDATE Recipients SET Name = ?, Year = ?, City = ?, Category = ? " + 
				        "WHERE AwardID = ?");
					//	"UPDATE Recipients SET Name = ?"+"Year = ?" + "City = ?" + "Category = ?" + "WHERE AwardID = ?");
				pstmt.setString(1, recipient.getName());
				pstmt.setInt(2, recipient.getYear());	
				pstmt.setString(3, recipient.getCity());
                                pstmt.setString(4, recipient.getCategory());
                                pstmt.setInt(5, recipient.getAwardID());
				pstmt.executeUpdate();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			finally{
				try{ if(pstmt != null){ pstmt.close(); }}
				catch(SQLException ex){System.out.println(ex.getMessage());}
				try{ if(con != null){ con.close(); }}
				catch(SQLException ex){System.out.println(ex.getMessage());}
			}
	}

        /**
         * This is delete method to database using DELETE sql
         * @param recipient recipient who will delete from database
         */
	@Override
	public void deleteRecipient(RecipientDTO recipient) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try{
			DataSource ds = new DataSource();
			con = ds.createConnection();
			pstmt = con.prepareStatement(
					"DELETE FROM Recipients WHERE AwardID = ?");
                        pstmt.setInt(1, recipient.getAwardID());
		//	pstmt.setInt(1, recipient.getRecipientID().intValue());
			pstmt.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{ if(pstmt != null){ pstmt.close(); }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
			try{ if(con != null){ con.close(); }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
		}
	}


}
