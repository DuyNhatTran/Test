/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Java_project_SGU.DAL;

import Java_project_SGU.BUS.Room;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public interface ReadRoomSqlInterface {
    String SERVER = "LAPTOP-UGUU7LBC\\SQLEXPRESS";
    String SA = "sa";
    String PASSWORD = "Asdfgh1052003.";
    String DB_NAME = "quanlirapchieuphim";
    int PORT = 1433;
    
    SQLServerDataSource configDataSource();
    public ArrayList<Room> getRoomsFromSql();
}
