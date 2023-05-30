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

/**
 * This is interface to define all the methods using by DAO design pattern
 * @author Dongkwan Kim
 */
public interface RecipientsDao {
	List<RecipientDTO> getAllRecipients();
	//List<Recipients> getNamesByName(String Name);
	RecipientDTO getRecipientByAwardID(Integer AwardID);
	void addRecipient(RecipientDTO AwardID);
	void updateRecipient(RecipientDTO AwardID);
	void deleteRecipient(RecipientDTO AwardID);

}
