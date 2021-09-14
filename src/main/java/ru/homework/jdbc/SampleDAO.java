
package ru.homework.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class SampleDAO {

    private static final Logger log = LoggerFactory.getLogger(SampleDAO.class);

    private Connection conn;

    /**
     * Assign the connection to use for this DAO
     *
     * @param conn
     */
    public void setConn(Connection conn) {
        this.conn = conn;
    }

    /**
     * Create a table in the database
     */
    public boolean createTable() {
        boolean success = false;
        if (conn != null) {
            Statement stmt = null;

            try {
                stmt = conn.createStatement();
                stmt.execute("CREATE TABLE sample_table (id INT IDENTITY, first_name VARCHAR(30), last_name VARCHAR(30), age INT)");
                log.info("Creating sample_table");
                success = true;
            } catch (SQLException e) {
                log.error("Unable to create the database table", e);
            } finally {
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException e) {
                    }
                }
            }
        }
        return success;
    }

    /**
     * Remove our sample table
     *
     * @return
     */
    public boolean dropTable() {
        boolean success = false;
        if (conn != null) {
            Statement stmt = null;

            try {
                stmt = conn.createStatement();
                stmt.execute("DROP TABLE sample_table");
                log.info("Deleting sample_table");
                success = true;
            } catch (SQLException e) {
                log.error("Unable to create the database table", e);
            } finally {
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException e) {
                    }
                }
            }
        }
        return success;
    }

    /**
     * Insert a person into the database
     *
     * @param firstName
     * @param lastName
     * @return
     */
    public boolean insertPerson(SamplePerson person) {
        //TODO
        throw new NotImplementedException();
    }

    /**
     * Get all the people stored in the database
     *
     * @return
     */
    public List<SamplePerson> getAllPeople() {
        //TODO
        throw new NotImplementedException();
    }

    /**
     * Get a person by their unique ID
     *
     * @param id
     * @return
     */
    public SamplePerson getPersonById(int id) {
        //TODO
        throw new NotImplementedException();
    }
}
