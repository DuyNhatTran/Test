/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_project_SGU.DAL;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class ConnectSql {

    public static void main(String[] args) {
        String server = "LAPTOP-UGUU7LBC\\SQLEXPRESS";
        String user = "sa";
        String password = "Asdfgh1052003.";
        String db = "QLDA";
        int port = 1433;

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setServerName(server);
        ds.setPortNumber(port);
        ds.setEncrypt(false); // (1)
        ds.setIntegratedSecurity(false); // (2)
        ds.setTrustServerCertificate(false);
        try (Connection conn = ds.getConnection()) {
            System.out.println("Kết nối thành công!");
            System.out.println("DB: " + conn.getCatalog());
        } catch (SQLServerException ex) {
            Logger.getLogger(ConnectSql.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectSql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
