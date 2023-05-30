/** 
 * Assignment 01 concentrates on bringing home the established design patterns learned in the course. Student and Tutor
 * Serve as Strategy for our User context applied through our UserStrat Interface. Builder design pattern is applied on
 * CourseBuilder for fast Course building, and AvailableCourses applies our Singleton design pattern serving as a
 * static board for all users to get information.
 * Course: CST 8288
 * Last updated on: June 24th
 * @author Daniel Barboza and Dongkwon Kim
 */
package tutoring.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *  StudentDTOTest tests all of our public variable get/set methods on our StudentDTO objects.
 *  @author Daniel Barboza and Dongkwon Kim
 */
public class StudentDTOTest {
    
    public StudentDTOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getStudentID method, of class StudentDTO.
     */
    @Test
    public void testGetStudentID() {
        System.out.println("getStudentID");
        StudentDTO instance = new StudentDTO();
        Integer expResult = null;
        Integer result = instance.getStudentID();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of setStudentID method, of class StudentDTO.
     */
    @Test
    public void testSetStudentID() {
        System.out.println("setStudentID");
        Integer studentID = null;
        StudentDTO instance = new StudentDTO();
        instance.setStudentID(studentID);
   
    }

    /**
     * Test of getLastName method, of class StudentDTO.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        StudentDTO instance = new StudentDTO();
        String expResult = "get last name";
        instance.setLastName(expResult);
        String result = instance.getLastName();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setLastName method, of class StudentDTO.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        StudentDTO instance = new StudentDTO();
        instance.setLastName(lastName);
   
    }

    /**
     * Test of getFirstName method, of class StudentDTO.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        StudentDTO instance = new StudentDTO();
        String expResult = "get first name";
        instance.setFirstName(expResult);
        String result = instance.getFirstName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setFirstName method, of class StudentDTO.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        StudentDTO instance = new StudentDTO();
        instance.setFirstName(firstName);

    }

    /**
     * Test of getEmail method, of class StudentDTO.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        StudentDTO instance = new StudentDTO();
        String expResult = "get email";
        instance.setEmail(expResult);
        String result = instance.getEmail();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of setEmail method, of class StudentDTO.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        StudentDTO instance = new StudentDTO();
        instance.setEmail(email);
    
    }

    /**
     * Test of getPhoneNumber method, of class StudentDTO.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        StudentDTO instance = new StudentDTO();
        String expResult = "get phone number";
        instance.setPhoneNumber(expResult);
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of setPhoneNumber method, of class StudentDTO.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "";
        StudentDTO instance = new StudentDTO();
        instance.setPhoneNumber(phoneNumber);
      
    }
    
}
