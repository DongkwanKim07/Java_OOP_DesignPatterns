/**
 * Provided for lab02 by professor.
 * Student name : Dongkwan Kim
 * Student number : 040993905
 * Course & Section # : 22S_CST8288_010_013
 * Professor: George Kriger and Siju Philip
 * Description: Demonstration of DAO Design Pattern, MVC Design Pattern
 * Declaration : This is my own original work and is free from plagiarism.
 */

import businesslayer.RecipientsBusinessLogic;
import businesslayer.ValidationException;
import transferobjects.RecipientDTO;

import java.util.List;
/**
 * this class is simpleDemo class which is demonstrate design pattern
 * @author Dongkwan Kim
 */
public class SimpleDemo {
public void demo(){
		try{
			RecipientsBusinessLogic logic = new RecipientsBusinessLogic();
			List<RecipientDTO> list = null;
			RecipientDTO recipient = null;
			
			System.out.println("Printing Recipients");
			list = logic.getAllRecipients();
			printRecipients(list);
			
			System.out.println("Printing One Recipient");
			recipient = logic.getRecipient(2);
			printRecipient(recipient);
			System.out.println();
			
			System.out.println("Inserting One Recipient");
			recipient = new RecipientDTO();
			recipient.setName("DK");
                        recipient.setYear(2022);
                        recipient.setCity("OTTAWA");
                        recipient.setCategory("Student");    
		//	recipient.setLastName("LastTestAdd");
			logic.addRecipient(recipient);
			list = logic.getAllRecipients();
			printRecipients(list);
			
			System.out.println("Updating last recipient");
			Integer updatePrimaryKey = list.get(list.size() - 1).getAwardID();
			recipient = new RecipientDTO();
			recipient.setAwardID(updatePrimaryKey);
			recipient.setName("NameTestUpdate");
                        recipient.setYear(2022);
                        recipient.setCity("CityTestUpdate");
                        recipient.setCategory("CategoryTestUpdate");
                        logic.updateRecipient(recipient);
			list = logic.getAllRecipients();
			printRecipients(list);  
                        
		//	recipient.setLastName("LastTestUpdate");
			logic.updateRecipient(recipient);
			list = logic.getAllRecipients();
			printRecipients(list);
			
			System.out.println("Deleting last recipient");
			recipient = list.get(list.size() - 1);
			logic.deleteRecipient(recipient);
			list = logic.getAllRecipients();
			printRecipients(list);	
		}
		catch(ValidationException e){
			System.err.println(e.getMessage());
		}

	}

	private static void printRecipient(RecipientDTO recipient){
	    	String output = String.format("%s, %s, %s, %s,%s ",
                        	recipient.getAwardID(),
	    			recipient.getName(),
                                recipient.getYear(),
                                recipient.getCity(),
                                recipient.getCategory());
   
	    	System.out.println(output);
	}

	private static void printRecipients(List<RecipientDTO> recipients){
	    for(RecipientDTO recipient : recipients){
	    	printRecipient(recipient);
	    }
	    System.out.println();
	}
	

}
