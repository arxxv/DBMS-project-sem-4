/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgui;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ARSH KUMAR
 */
public class ConnectDatabase {

    public static Connection getConnection() {
        Connection conn = null;
        if (conn != null) {
            return conn;
        }
        String database = "project2";
        String Username = "root";
        String password = "xxarxxvxx0505";
        return getConnection(conn, database, Username, password);
    }

    private static Connection getConnection(Connection conn, String db, String Username, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + db + "?user=" + Username + "&password=" + password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
