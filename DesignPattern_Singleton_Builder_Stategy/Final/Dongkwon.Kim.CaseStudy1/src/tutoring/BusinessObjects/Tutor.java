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
 * Tutor models a tutor user strategy for use in a generic User context.
 * Tutor has at least 1 year of experience, giving him an experienceID of 1.
 * Tutor status is always Tutoring.
 * Tutor can confirm a tutoring Session with bookSession, changing it's status to 2
 * ( confirmed ) and adding the tutor's data into that session, finally handshaking
 * with the student a combined date, time and course for the tutoring Session.
 * @author Daniel Barboza and Dongkwon Kim
 */
public class Tutor implements UserStrat {

    private int userID;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private ArrayList<String> courses;
    private final String status = "Tutoring";
    private final int experienceID = 1;
    private UserStrat strategy;
    

  /**
   * Returns our current user status: Tutoring.
   * @return status of user strategy
   */
    public String getStatus() {
        return this.status;
    }

   /**
    * Returns our current experienceID: 1
    * The value represents >1year experience needed for tutoring
    * 
    * @return user experienceID
    */
    public int getExperienceID() {
        return experienceID;
    }
    
     /**
     * bookSession accepts the session that is received from Student and further inputs data
     * concerning the tutor. bookSession then changes the status to 2 ( Confirmed ).
     * Accepts userID, the session, date, time and course for the tutoring session;
     * 
     * @param user the userID
     * @param session the session that is to be confirmed
     * @param date the date of session
     * @param time the time of session
     * @param course the course name of session
     * @return Session the session that was created of confirmed
     */
    public Session bookSession(User user, Session session, Date date, Date time, String course) {

        session.setTutorID(user.getUserID());
        session.setSessionStatus(2);

        return session;
    }
    
    
     /**
     * thisUserStrategy() returns which strategy is being applied to the instance
     * @return the strategy that is being utilized
     */
    public String thisUserStrategy() {
        return "This is a Tutor";
    }


}
