/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_project_SGU.DAL;

import Java_project_SGU.BUS.Customer;
import Java_project_SGU.BUS.ShowTime;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public interface WriteCusSqlInterface {
    String SERVER = "LAPTOP-UGUU7LBC\\SQLEXPRESS";
    String USER = "sa";
    String PASSWORD = "Asdfgh1052003.";
    String DB_NAME = "quanlirapchieuphim";
    int PORT = 1433;
    
    int insertData(Customer customer);
    SQLServerDataSource configDataSource();
    public int deleteCus(String id_cusDelete);
    public int upDateCustomer(Customer customer);
}
