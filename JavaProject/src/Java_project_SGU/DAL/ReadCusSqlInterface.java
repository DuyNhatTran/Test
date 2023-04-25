/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Java_project_SGU.DAL;

import Java_project_SGU.BUS.Customer;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ReadCusSqlInterface {
    String SERVER = "LAPTOP-UGUU7LBC\\SQLEXPRESS";
    String USER = "sa";
    String PASSWORD = "Asdfgh1052003.";
    String DB_NAME = "quanlirapchieuphim";
    int PORT = 1433;
    
   
    
    SQLServerDataSource configDataSource();
    List<Customer> readCustomersFromDataSource();
}
