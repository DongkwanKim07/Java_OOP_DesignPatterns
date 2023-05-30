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

import java.util.ArrayList;
import java.util.Date;

/**
 * Student models a student user strategy for use in a generic User context.
 * Student has no experience in tutoring, giving him an experienceID = 0.
 * Student status is always Studying.
 * Student can create a tutoring Session with bookSession, changing it's status to 1
 * ( pending ) and adding the student's data into this session with the desired date,
 * time and course for that tutoring Session.
 * @author Daniel Barboza and Dongkwon Kim
 */
public class Student implements UserStrat {

    private int userID;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private ArrayList<String> courses;
    private final String status = "Studying";
    private int experienceID = 0;
    private UserStrat strategy;
    
    
   /**
   * Returns our current user status: Studying.
   * @return status of user strategy
   */
     public String getStatus() {
        return this.status;
    }

    /**
    * Returns our current experienceID: 0
    * The value represents no experience needed for tutoring
    * 
    * @return user experienceID
    */
    public int getExperienceID() {
        return this.experienceID;
    }


     /**
     * thisUserStrategy() returns which strategy is being applied to the instance
     * @return the strategy that is being utilized
     */
    public String thisUserStrategy() {
        return "This is a Student";
    }



    /**
     *     
     * bookSession creates the Session that that will be forwarded for further confirmation
     * from a tutor. bookSession will input Student data, date and time of the Session, and
     * also the related course code. bookSession changes the status of the Session to 1 ( Pending ).
     * Accepts userID, the session, date, time and course for the tutoring session;
     * 
     * @param user the userID
     * @param session the session that is to be confirmed
     * @param date the date of session
     * @param time the time of session
     * @param courseCode the course name of session
     * @return Session the session that was created of confirmed
     */
    public Session bookSession(User user, Session session, Date date, Date time, String courseCode) {

        session = new Session();
        session.setDatekey(date);
        session.setTimeKey(time);
        session.setStudentID(user.getUserID());
        session.setCourseCode(courseCode);
        session.setSessionStatus(1);
        session.setStudentLastName(user.getLastName());

        return session;
    }

}
