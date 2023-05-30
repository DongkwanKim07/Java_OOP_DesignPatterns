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

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tutoring.tests.SessionDTO;

/**
 *  SessionDTOTest tests all of our public variable get/set methods on our SessionDTO objects.
 *  @author Daniel Barboza and Dongkwon Kim
 */
public class SessionDTOTest {
    
    public SessionDTOTest() {
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
     * Test of getDateKey method, of class SessionDTO.
     */
    @Test
    public void testGetDateKey() {
        System.out.println("getDateKey");
        SessionDTO instance = new SessionDTO();
        Date expResult = null;
        Date result = instance.getDateKey();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setDatekey method, of class SessionDTO.
     */
    @Test
    public void testSetDatekey() {
        System.out.println("setDatekey");
        Date dateKey = null;
        SessionDTO instance = new SessionDTO();
        instance.setDatekey(dateKey);
     
    }

    /**
     * Test of getTimeKey method, of class SessionDTO.
     */
    @Test
    public void testGetTimeKey() {
        System.out.println("getTimeKey");
        SessionDTO instance = new SessionDTO();
        Date expResult = null;
        Date result = instance.getTimeKey();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setTimeKey method, of class SessionDTO.
     */
    @Test
    public void testSetTimeKey() {
        System.out.println("setTimeKey");
        Date timeKey = null;
        SessionDTO instance = new SessionDTO();
        instance.setTimeKey(timeKey);
      
    }

    /**
     * Test of getStudentLastName method, of class SessionDTO.
     */
    @Test
    public void testGetStudentLastName() {
        System.out.println("getStudentLastName");
        SessionDTO instance = new SessionDTO();
        String expResult = "get student last name";
        instance.setStudentLastName(expResult);
        String result = instance.getStudentLastName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setStudentLastName method, of class SessionDTO.
     */
    @Test
    public void testSetStudentLastName() {
        System.out.println("setStudentLastName");
        String studentLastName = "";
        SessionDTO instance = new SessionDTO();
        instance.setStudentLastName(studentLastName);
  
    }

    /**
     * Test of getSessionStatus method, of class SessionDTO.
     */
    @Test
    public void testGetSessionStatus() {
        System.out.println("getSessionStatus");
        SessionDTO instance = new SessionDTO();
        int expResult = 0;
        int result = instance.getSessionStatus();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setSessionStatus method, of class SessionDTO.
     */
    @Test
    public void testSetSessionStatus() {
        System.out.println("setSessionStatus");
        int sessionStatus = 0;
        SessionDTO instance = new SessionDTO();
        instance.setSessionStatus(sessionStatus);
       
    }

    /**
     * Test of getTutorID method, of class SessionDTO.
     */
    @Test
    public void testGetTutorID() {
        System.out.println("getTutorID");
        SessionDTO instance = new SessionDTO();
        Integer expResult = null;
        Integer result = instance.getTutorID();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setTutorID method, of class SessionDTO.
     */
    @Test
    public void testSetTutorID() {
        System.out.println("setTutorID");
        Integer tutorID = null;
        SessionDTO instance = new SessionDTO();
        instance.setTutorID(tutorID);
  
    }

    /**
     * Test of getCourseCode method, of class SessionDTO.
     */
    @Test
    public void testGetCourseCode() {
        System.out.println("getCourseCode");
        SessionDTO instance = new SessionDTO();
        String expResult = "get course code";
        instance.setCourseCode(expResult);
        String result = instance.getCourseCode();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setCourseCode method, of class SessionDTO.
     */
    @Test
    public void testSetCourseCode() {
        System.out.println("setCourseCode");
        String courseCode = "";
        SessionDTO instance = new SessionDTO();
        instance.setCourseCode(courseCode);
 
    }

    /**
     * Test of getTopic method, of class SessionDTO.
     */
    @Test
    public void testGetTopic() {
        System.out.println("getTopic");
        SessionDTO instance = new SessionDTO();
        String expResult = "get topic";
        instance.setTopic(expResult);
        String result = instance.getTopic();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setTopic method, of class SessionDTO.
     */
    @Test
    public void testSetTopic() {
        System.out.println("setTopic");
        String topic = "";
        SessionDTO instance = new SessionDTO();
        instance.setTopic(topic);
  
    }

    /**
     * Test of getStudentID method, of class SessionDTO.
     */
    @Test
    public void testGetStudentID() {
        System.out.println("getStudentID");
        SessionDTO instance = new SessionDTO();
        Integer expResult = null;
        Integer result = instance.getStudentID();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setStudentID method, of class SessionDTO.
     */
    @Test
    public void testSetStudentID() {
        System.out.println("setStudentID");
        Integer studentID = null;
        SessionDTO instance = new SessionDTO();
        instance.setStudentID(studentID);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    
}
