/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Java_project_SGU.DAL;

import Java_project_SGU.BUS.Customer;
import Java_project_SGU.BUS.Seat;
import Java_project_SGU.BUS.ShowTime;
import Java_project_SGU.BUS.TicketSale;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public interface WriteReadShowTimeSQLInterface {    
    String SERVER = "LAPTOP-UGUU7LBC\\SQLEXPRESS";
    String USER = "sa";
    String PASSWORD = "Asdfgh1052003.";
    String DB_NAME = "quanlirapchieuphim";
    int PORT = 1433;
    
    SQLServerDataSource configDataSource();
    // đẩy dữ liệu
    boolean insertShowTimeToSQL(ShowTime showTime);
    // lấy araylist showtime
    ArrayList<ShowTime> readShowTimesFromSQL();
    // lấy danh sách ghế từ một showtime bỏ vào room
    public ShowTime readBookedShowTimesFromSQL(ShowTime showTime);
    public ArrayList<Seat> readSeatCorresSTFromSQL(ShowTime showTime);
    public TicketSale getBookkingTicketSale(ShowTime showTime, Customer customer);
}
