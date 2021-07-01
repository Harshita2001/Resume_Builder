package com.project.helper;

import java.sql.*;

public class ConnectionProvider {

    private static Connection con;

    public static Connection getConnection() {
        try {

            if (con == null) {
                //driver class load
                Class.forName("org.apache.derby.jdbc.ClientDriver");

                //create a connection..
                con = DriverManager.
                        getConnection("jdbc:derby://localhost:1527/bvdata");

            }

        }catch(ClassNotFoundException | SQLException e){
          e.printStackTrace();
        }

        return con;
    }

}