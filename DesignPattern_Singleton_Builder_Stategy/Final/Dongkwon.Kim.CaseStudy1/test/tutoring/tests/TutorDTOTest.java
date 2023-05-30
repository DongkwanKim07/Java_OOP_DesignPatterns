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
 *  TutorDTOTest tests all of our public variable get/set methods on our TutorDTO objects.
 *  @author Daniel Barboza and Dongkwon Kim
 */
public class TutorDTOTest {
    
    public TutorDTOTest() {
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
     * Test of getTutorID method, of class TutorDTO.
     */
    @Test
    public void testGetTutorID() {
        System.out.println("getTutorID");
        TutorDTO instance = new TutorDTO();
        Integer expResult = null;
        Integer result = instance.getTutorID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTutorID method, of class TutorDTO.
     */
    @Test
    public void testSetTutorID() {
        System.out.println("setTutorID");
        Integer tutorID = null;
        TutorDTO instance = new TutorDTO();
        instance.setTutorID(tutorID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class TutorDTO.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        TutorDTO instance = new TutorDTO();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class TutorDTO.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        TutorDTO instance = new TutorDTO();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class TutorDTO.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        TutorDTO instance = new TutorDTO();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class TutorDTO.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        TutorDTO instance = new TutorDTO();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class TutorDTO.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        TutorDTO instance = new TutorDTO();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class TutorDTO.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        TutorDTO instance = new TutorDTO();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNumber method, of class TutorDTO.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        TutorDTO instance = new TutorDTO();
        String expResult = "";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneNumber method, of class TutorDTO.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "";
        TutorDTO instance = new TutorDTO();
        instance.setPhoneNumber(phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class TutorDTO.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        TutorDTO instance = new TutorDTO();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class TutorDTO.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        TutorDTO instance = new TutorDTO();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExperienceID method, of class TutorDTO.
     */
    @Test
    public void testGetExperienceID() {
        System.out.println("getExperienceID");
        TutorDTO instance = new TutorDTO();
        Integer expResult = null;
        Integer result = instance.getExperienceID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExperienceID method, of class TutorDTO.
     */
    @Test
    public void testSetExperienceID() {
        System.out.println("setExperienceID");
        Integer experienceID = null;
        TutorDTO instance = new TutorDTO();
        instance.setExperienceID(experienceID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
