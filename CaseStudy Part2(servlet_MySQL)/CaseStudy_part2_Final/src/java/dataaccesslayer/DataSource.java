/* Assignment 2 demonstrates DAO design patterns with servlet implementation
 * Course: CST 8288
 * Section: 010
 * Author: Daniel Barboza and Dongkwan Kim based on Algonquin Collge staff code
 * Date: Aug 2022
 */
package dataaccesslayer;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import transferobjects.CredentialsDTO;


/**
 * DataSource models a data source object for servlet jdbc database connection.
 * @author danielbarboza and dongkwan kim
 */
public class DataSource {

    private Connection connection = null;
    private String url = "jdbc:mysql://localhost:3306/tutoring?useSSL=false&allowPublicKeyRetrieval=true";
    private String username;
    private String password;

    /**
     * DataSource constructor with credential parameter
     * @param creds the credentials
     */
    public DataSource(CredentialsDTO creds) {
        username=creds.getUsername();
        password=creds.getPassword();
    }

/**
 * createConnection makes sure there is no connection already running, and only
 * then creates a new connection to our database using DriverManager.getConnection
 * @return the connection to the database
 */
    public Connection createConnection() {
        try {
            if (connection != null) {
                System.out.println("Cannot create new connection, one exists already");
            } else {
                connection = DriverManager.getConnection(url, username, password);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return connection;
    }
}
