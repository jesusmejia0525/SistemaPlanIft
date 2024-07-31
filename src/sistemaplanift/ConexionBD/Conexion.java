/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaplanift.ConexionBD;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author VIQG01X
 */
public class Conexion {
    Connection con;
    public Connection getConexionBD(){
        try {
             Class.forName("com.ibm.db2.jcc.DB2Driver");
        } catch (ClassNotFoundException e) {
            //System.out.println("Please include Classpath  Where your DB2 Driver is located");
            e.printStackTrace();
        }
        System.out.println("DB2 driver is loaded successfully");
        
        try {
            con = DriverManager.getConnection("jdbc:db2://192.9.198.9:50815/DB2PROD", "VIQ2DAF", "Prodjn1");
        } catch (SQLException e) {
            System.out.println("DB2 Database connection Failed");
            e.printStackTrace();
    
        }
        return con;
    }
    public void getClosed(){
        try {
            con.close();
        } catch (Exception e) {
        }
    }
           
    
}
