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
 *  CourseDTOTest tests all of our public variable get/set methods on our CourseDTO objects.
 *  @author Daniel Barboza and Dongkwon Kim
 */
public class CourseDTOTest {
    
    public CourseDTOTest() {
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
     * Test of getCourseCode method, of class CourseDTO.
     */
    @Test
    public void testGetCourseCode() {
        System.out.println("getCourseCode");
        CourseDTO instance = new CourseDTO();
        int expResult = 0;
        int result = instance.getCourseCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setCourseCode method, of class CourseDTO.
     */
    @Test
    public void testSetCourseCode() {
        System.out.println("setCourseCode");
        int courseCode = 0;
        CourseDTO instance = new CourseDTO();
        instance.setCourseCode(courseCode);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getCourseName method, of class CourseDTO.
     */
    @Test
    public void testGetCourseName() {
        System.out.println("getCourseName");
        CourseDTO instance = new CourseDTO();
        String expResult = "get name";
        instance.setCourseName("get name");
        String result = instance.getCourseName();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of setCourseName method, of class CourseDTO.
     */
    @Test
    public void testSetCourseName() {
        System.out.println("setCourseName");
        String courseName = "";
        CourseDTO instance = new CourseDTO();
        instance.setCourseName(courseName);
    }

    /**
     * Test of getCourseDescription method, of class CourseDTO.
     */
    @Test
    public void testGetCourseDescription() {
        System.out.println("getCourseDescription");
        CourseDTO instance = new CourseDTO();
        String expResult = "get desc";
        instance.setCourseDescription("get desc");
        String result = instance.getCourseDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseDescription method, of class CourseDTO.
     */
    @Test
    public void testSetCourseDescription() {
        System.out.println("setCourseDescription");
        String courseDescription = "";
        CourseDTO instance = new CourseDTO();
        instance.setCourseDescription(courseDescription);
        
    }
    
}
