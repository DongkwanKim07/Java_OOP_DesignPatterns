/** 
 * Assignment 01 concentrates on bringing home the established design patterns learned in the course. Student and Tutor
 * Serve as Strategy for our User context applied through our UserStrat Interface. Builder design pattern is applied on
 * CourseBuilder for fast Course building, and AvailableCourses applies our Singleton design pattern serving as a
 * static board for all users to get information.
 * Course: CST 8288
 * Last updated on: June 24th
 * @author Daniel Barboza and Dongkwon Kim
 */
package tutoring.BusinessObjects;

import java.util.Date;

/**
 * Control Class tests our 'book a session' feature in our main function. We create two users: dk and dan. dk user has the default student strategy and can create a new session with his.
 * and 'dan', who has a tutor strategy and will confirm the session, further inputing data into our Session object. Having different strategies affects
 * the behaviour of said users, which is shown in this output. First the available 
 * @author danielbarboza and dongkwankim
 */
public class Control {
    
    public static void main(String[] args) {

        //Creating users
        User dk = new User();
        User dan = new User();
        
        //displaying available courses
        System.out.println(dk.getAvailableCourses());

        
        dk.setUserID(1234567);
        dk.setFirstName("Dongkwan");
        dk.setCourse("8109 - Network Programming");
        dk.setLastName("Kim");
        dk.setEmail("dk@algonquinlive.com");
        dk.setPhone("123-456-789");

        dan.setUserID(99977);
        dan.setFirstName("Daniel");
        dan.setCourse("OOP Design Patterns");
        dan.setCourse("Systems Analysis");
        dan.setLastName("Barboza");
        dan.setEmail("dan@algonquinlive.com");
        dan.setPhone("123-456-789");


      
        //changing user strategies
        System.out.println();
        dk.changeStratTo(new Student());
        dan.changeStratTo(new Tutor());

      
        //creating dummy dates
        Date date = new Date();
        Date time = new Date();
        
        //creating dummy course
        String course = "CST 2234 - Systems Analysis";

        //printing user dk
        System.out.println(dk);
        
        
        // Creating a Session
        Session newSession = new Session();
        newSession = dk.bookSession(dk, newSession, date, time, course );

        System.out.println("Creating Session ///");
        System.out.println(String.format("Your Session:\nStudent ID: %d%nStudent Last Name: %s%nDate: %s%nTime: %s%nCourse: %s%nStatus: %s Pending%n",
                newSession.getStudentID(), newSession.getStudentLastName(), newSession.getDateKey().toString(),
                newSession.getTimeKey().toString(), newSession.getCourseCode(), newSession.getSessionStatus() ));


        //Printing user dan
        System.out.println(dan);
        
        //Confirming a session
        newSession = dan.bookSession(dan, newSession, date, time, course );
        

        System.out.println("Confirming Session ///");
        System.out.println(String.format("Your Session:\nTutor ID: %d%nStudent ID: %d%nStudent Last Name: %s%nDate: %s%nTime: %s%nCourse: %s%nStatus: %s Confirmed%n",
                newSession.getTutorID(), newSession.getStudentID(), newSession.getStudentLastName(), newSession.getDateKey().toString(),
                newSession.getTimeKey().toString(), newSession.getCourseCode(), newSession.getSessionStatus()));

    }
    
}
