/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_project_SGU.DAL;

import Java_project_SGU.BUS.Room;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ReadRoomSqlImp implements ReadRoomSqlInterface{

    @Override
    public ArrayList<Room> getRoomsFromSql() {
        ArrayList<Room> rooms = new ArrayList<>();
        SQLServerDataSource ds = configDataSource();
        try(var connect = ds.getConnection()) {
            String getRoomQuery = "SELECT * FROM Room";
            var prepareStm = connect.prepareStatement(getRoomQuery);
            ResultSet resultSet =  prepareStm.executeQuery();
            while (resultSet.next()) {
                String idRooom = resultSet.getString(1);
                int numRow = resultSet.getInt(2);
                int numCol = resultSet.getInt(3);
                Room room = new Room(idRooom, numRow, numCol);
                rooms.add(room);
            }
            return rooms;
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rooms;
    }
    
    @Override
    public SQLServerDataSource configDataSource() {
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setEncrypt(false); // (1)
        dataSource.setIntegratedSecurity(false); // (2)
        dataSource.setTrustServerCertificate(false);
        dataSource.setUser(ReadCusSqlInterface.USER);
        dataSource.setPassword(ReadCusSqlInterface.PASSWORD);
        dataSource.setDatabaseName(ReadCusSqlInterface.DB_NAME);
        dataSource.setServerName(ReadCusSqlInterface.SERVER);
        dataSource.setPortNumber(ReadCusSqlInterface.PORT);
        return dataSource;
    }
}
