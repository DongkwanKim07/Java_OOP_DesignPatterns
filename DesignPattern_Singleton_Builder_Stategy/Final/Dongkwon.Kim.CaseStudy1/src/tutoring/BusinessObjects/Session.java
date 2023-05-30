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
 * Session models a Session entity data transfer object.
 * All get and set methods are available for all attributes.
 * @author Daniel Barboza and Dongkwon Kim
 */
public class Session {

    private Date dateKey;
    private Date timeKey;
    private String studentLastName;
    private int sessionStatus;
    private String topic;
    private Integer tutorID;
    private String courseCode;
    private Integer studentID;

    public int getSessionStatus(){
        return sessionStatus;
    }
    public void setSessionStatus(int sessionStatus){
        this.sessionStatus = sessionStatus;
    }

    public Date getDateKey(){
        return dateKey;
    }
    public void setDatekey(Date dateKey){
        this.dateKey = dateKey;
    }

    public Date getTimeKey(){
        return timeKey;
    }
    public void setTimeKey(Date timeKey){
        this.timeKey = timeKey;
    }

    public String getStudentLastName(){
        return studentLastName;
    }
    public void setStudentLastName(String studentLastName){
        this.studentLastName = studentLastName;
    }

    public Integer getTutorID(){
        return tutorID;
    }
    public void setTutorID(Integer tutorID){
        this.tutorID = tutorID;
    }

    public String getCourseCode(){
        return courseCode;
    }
    public void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }

    public Integer getStudentID(){
        return studentID;
    }
    public void setStudentID(Integer studentID){
        this.studentID = studentID;
    }



}
