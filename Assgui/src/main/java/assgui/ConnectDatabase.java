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
    static Connection conn = null;
    public static Connection getConnection(){
        if(conn!=null) return conn;
        String database = "project2";
        String Username = "root";
        String password ="xxarxxvxx0505";
        return getConnection(database,Username,password);
    }
    private static Connection getConnection(String db, String Username, String password){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + db + "?user=" + Username + "&password=" + password);
        } catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}
