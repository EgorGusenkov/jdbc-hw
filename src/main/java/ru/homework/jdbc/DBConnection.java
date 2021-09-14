
package ru.homework.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class DBConnection {

    private static final Logger log = LoggerFactory.getLogger(DBConnection.class);
    private Connection conn = null;
    private final String URL = "jdbc:hsqldb:mem:sampleDB";
    private final String USER = "SA";
    private final String PASSWORD = "";

    public void close() {
        //TODO
        throw new NotImplementedException();
    }

    public Connection getConnection() throws SQLException {
        //TODO
        throw new NotImplementedException();
    }
}
