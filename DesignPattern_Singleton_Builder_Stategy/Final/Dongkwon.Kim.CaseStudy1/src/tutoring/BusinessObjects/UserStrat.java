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
 * UserStrat Interface is our User context strategy. It serves as the 
 * main blueprint for our User class, with different behaviors for each child class,
 * namely Student and Tutor, which are our User Strategies. thisUserStrategy returns
 * which strategy is being applied to the instance, bookSession creates a new session
 * for students, while it confirms the session for tutors. getStatus returns distinct values
 * for each strategy, so does getExperienceID, which student has 0 and tutor > 0;
 * @author danielbarboza and dongkwankim
 */
public interface UserStrat {
    
    /**
     * thisUserStrategy() returns which strategy is being applied to the instance
     * @return the strategy that is being utilized
     */
    public String thisUserStrategy();
    
    /**
     * bookSession creates a new session for students, inputing important student data
     * for the creation of a session. For tutors it confirms the session and further inputs data
     * concerning the tutor. Accepts userID, the session, date, time and course for the tutoring session;
     * 
     * @param user the userID
     * @param session the session that is to be created or confirmed
     * @param date the date of session
     * @param time the time of session
     * @param course the course name of session
     * @return Session the session that was created of confirmed
     */
    public Session bookSession( User user, Session session, Date date, Date time, String course);
    
    /**
     * getStatus returns status of the strategy
     * @return status the status of the strategy
     */
    public String getStatus();
    
    /**
     * getExperienceID returns the experienceID for the strategy used. Students
     * have 0 as return value. Tutors 1;
     * @return ID the experienceID of the strategy
     */
    public int getExperienceID();

}
