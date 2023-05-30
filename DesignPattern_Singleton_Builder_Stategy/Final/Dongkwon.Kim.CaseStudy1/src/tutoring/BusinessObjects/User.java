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
 * User class models a generalist user. It uses the strategy design pattern
 * to implement specific user behaviors, namely Student and Tutor user behaviors.
 * Each student has a userID, first name, last name, phone, email, an ArrayList of
 * courses that this user has, status ( Studying / Tutoring ), experienceID ( Student = 0,
 * Tutor = 1 ) and the actual strategy. The default behavior for User is to be a Student.
 * Behavior specific methods use UserStrat objects to call the right behavior.
 * 
 * @author danielbarboza and dongkwankim
 */
public class User {

    private int userID;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private ArrayList<String> courses = new ArrayList<>();
    private String status;
    private int experienceID;
    private UserStrat strategy;
    
    
    /**
     * changeStrategyTo() changes the strategy that is being implemented in the user class.
     * these strategies can be UserStrat objects, namely Student and Tutor
     * @param strategy the UserStrat that will be used
     */
    public void changeStratTo ( UserStrat strategy ) {
        this.strategy = strategy;
    }

    /**
     * Default constructor for User class
     * Determines the default behavior of our user strategy.
     */
    public User() {
        this.strategy = new Student();
    }

    /**
     * Gets userID
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * Gets user first name
     * @return firsName of the user
     */
  public String getFirstName() {
      return firstName;
  }
  
  /**
   * Gets user's last name
   * @return lastName of user
   */
  public String getLastName() {
      return lastName;
  }
  
  /**
   * gets user phone
   * @return phone of user
   */
  public String getPhone() {
      return phone;
  }

  /**
   * get user courses
   * @return courses of user
   */
  public ArrayList<String> getCourses() {
        return courses;
  }
  
  /**
   * get user email
   * @return email of user
   */
  public String getEmail() {
      return email;
  }
  
  /**
   * Gets the user strategy status
   * @return status of user strategy
   */
  public String getStatus() {
      return this.strategy.getStatus();
  }
  
  /**
   * getExperienceID gets the user strategy's experienceID. 
   * @return user experienceID
   */
  public int getExperienceID() {
      return this.strategy.getExperienceID();
  }

  /**
   * getAvailableCourses returns the available courses at our tutoring app
   * via our singleton AvailableCourses
   * @return the available courses
   */
  public String getAvailableCourses() {

        AvailableCourses courses = AvailableCourses.INSTANCE;
        return courses.getCourses();
  }

  /**
   * getUserStrat gets the strategy that is being used
   * @return strategy the strategy that is being user
   */
  public UserStrat getUserStrat() {
      return strategy;
  }

  /**
   * sets userID
   * @param userID the user ID 
   */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * Sets user first name
     * @param firstName the user's first name
     */
    public void setFirstName(String firstName) {
      this.firstName = firstName;
  }
  
   /**
    * sets user last name
    * @param lastName the users last name
    */ 
    public void setLastName(String lastName) {
      this.lastName = lastName;
  }
  
  /**
   * sets user's phone
   * @param phone the user's phone
   */  
    public void setPhone(String phone) {
      this.phone = phone;
  }
  
  /**
   * sets user email
   * @param email the user email
   */  
  public void setEmail(String email) {
      this.email = email;
  }
  
  /**
   * adds course to the users course list
   * @param theCourse that will be added to the list
   */
   public void setCourse(String theCourse) {
      courses.add(theCourse);
  }
  
   /**
    * sets the status for this user
    * @param status the status
    */
  public void setStatus(String status) {
      this.status = status;
  }
  
  /**
   * sets user experienceID
   * @param experience the user experienceID
   */
  public void setExperience(int experience) {
      this.experienceID = experience;
  }


  
    /**
     * toString method returns the name, student ID, phone, email, courses, status
     * esperienceID and strategy of the user
     */
  @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append("Name: ")
                .append(String.format("%s %s%n", firstName, lastName))
                .append("StudentID: ")
                .append(String.format("%d%n", userID))
                .append("Phone: ")
                .append(String.format("%s%n", phone))
                .append("Email: ")
                .append(String.format("%s%n", email))
                .append("Courses: ")
                .append(String.format("%s ", courses))
                .append("\nStatus: ")
                .append(String.format("%s%n", getStatus()))
                .append("ExperienceID: ")
                .append(String.format("%d%n", getExperienceID()))
                .append("Unit behaviour type: ")
                .append(strategy.thisUserStrategy() + "\n");
        return builder.toString();
    }
    
    /**
     * bookSession creates a new session for users. if the strategy is a student, it inputs important
     * student data and creates a session. For tutors it confirms the session and further inputs data
     * concerning the tutor. Accepts userID, the session, date, time and course for the tutoring session
     * 
     * @param user the userID
     * @param session the session that is to be created or confirmed
     * @param date the date of session
     * @param time the time of session
     * @param course the course name of session
     * @return Session the session that was created/confirmed
     */
    public Session bookSession(User user, Session session, Date date, Date time, String course) {

        return strategy.bookSession(user, session, date, time, course );
    }
    
     /**
     * thisUserStrategy() returns which strategy is being applied to the instance
     * @return the strategy that is being utilized
     */
     public String thisUserStrategy() {
        return strategy.thisUserStrategy();
    } 
}
