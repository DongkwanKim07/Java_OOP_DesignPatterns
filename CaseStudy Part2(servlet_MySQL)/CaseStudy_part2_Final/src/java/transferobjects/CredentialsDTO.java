/* Assignment 2 demonstrates DAO design patterns with servlet implementation
 * Course: CST 8288
 * Section: 010
 * Author: Daniel Barboza and Dongkwan Kim based on Algonquin Collge staff code
 * Date: Aug 2022
 */
package transferobjects;

/**
 * a DTO used to store and transfer DBMS login credentials
 * between businesslayer and dataacesslayer
 * @author kriger
 */

public class CredentialsDTO {
    private String username;
    private String password;

    /**
     * simple getter for user name portion of the credentials
     * @return user name portion of the credentials
     */
    public String getUsername() {
        return username;
    }

    /**
     * simple setter for user name portion of the credentials
     * @param username user name portion of the credentials
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * simple getter for password portion of the credentials
     * @return password portion of the credentials
     */
    public String getPassword() {
        return password;
    }

    /**
     * simple setter for password portion of the credentials
     * @param password password portion of the credentials
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}//class
