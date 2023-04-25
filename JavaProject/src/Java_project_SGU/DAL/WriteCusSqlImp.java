/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Java_project_SGU.DAL;

import Java_project_SGU.BUS.Customer;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class WriteCusSqlImp implements WriteCusSqlInterface{
    public int insertData(Customer customer) {
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "INSERT INTO dbo.Customer(ID_Customer, Name, Password,"
                    + " PhoneNumber, Email, DayOfBirth, Sex, isSavepw, ID_Person,"
                    + " Address, Account, StartDate, isDelete) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            var prepareStm = conn.prepareStatement(sql);
            prepareStm.setString(1, customer.getId_customer());
            prepareStm.setString(2, customer.getFullName());
            prepareStm.setString(3, customer.getPassword());
            prepareStm.setString(4, customer.getPhoneNumber());
            prepareStm.setString(5, customer.getEmail());
            SimpleDateFormat fomartDateSql = new SimpleDateFormat("yyyy-MM-dd");
            prepareStm.setString(6, fomartDateSql.format(customer.getBirthDay()));
            if (customer.getSex()) {
                prepareStm.setString(7, "True");
            } else {
                prepareStm.setString(7, "False");
            }
            if (customer.getIsSavePW()) {
                prepareStm.setString(8, "True");
            } else {
                prepareStm.setString(8, "False");
            }
            prepareStm.setString(9, customer.getId_person());
            prepareStm.setString(10, customer.getAddress());
            prepareStm.setString(11, customer.getAccount());
            SimpleDateFormat fomartSartDateSql = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            prepareStm.setString(12, fomartSartDateSql.format(customer.getStartDate()));
            prepareStm.setString(13, "False");
            return prepareStm.executeUpdate();
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
            return -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return -1;
        }
    }
    
    public SQLServerDataSource configDataSource() {
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setEncrypt(false); // (1)
        dataSource.setIntegratedSecurity(false); // (2)
        dataSource.setTrustServerCertificate(false);
        dataSource.setUser(WriteCusSqlInterface.USER);
        dataSource.setPassword(WriteCusSqlInterface.PASSWORD);
        dataSource.setDatabaseName(WriteCusSqlInterface.DB_NAME);
        dataSource.setServerName(WriteCusSqlInterface.SERVER);
        dataSource.setPortNumber(WriteCusSqlInterface.PORT);
        return dataSource;
    }

    public int deleteCus(String id_cusDelete) {
        SQLServerDataSource ds = configDataSource();
        try (Connection connect = ds.getConnection()){
            String deleteCusQuery = "UPDATE dbo.Customer SET isDelete = 1 WHERE ID_Customer = ?";
            var prepareStm = connect.prepareStatement(deleteCusQuery);
            prepareStm.setString(1, id_cusDelete);
            return prepareStm.executeUpdate();
        } catch (SQLServerException ex) {
            ex.printStackTrace();
            return -1;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return -1;
        }
    }

    public int upDateCustomer(Customer customer) {
        SQLServerDataSource ds = configDataSource();
        try (Connection connect = ds.getConnection()) {
            String updateCusQuery = "UPDATE dbo.Customer SET Name = ?,"
                    + " PhoneNumber = ?, Email = ?, DayOfBirth = ?, Sex = ?, ID_Person = ?,"
                    + " Address = ? WHERE ID_Customer = ?";
            var prepareStm = connect.prepareStatement(updateCusQuery);
            prepareStm.setString(1, customer.getFullName());
            prepareStm.setString(2, customer.getPhoneNumber());
            prepareStm.setString(3, customer.getEmail());
            SimpleDateFormat fomartDateSql = new SimpleDateFormat("yyyy-MM-dd");
            prepareStm.setString(4, fomartDateSql.format(customer.getBirthDay()));
            if (customer.getSex()) {
                prepareStm.setString(5, "True");
            } else {
                prepareStm.setString(5, "False");
            }
            prepareStm.setString(6, customer.getId_person());
            prepareStm.setString(7, customer.getAddress());
            prepareStm.setString(8, customer.getId_customer());
            System.out.println(customer.getId_customer());
            return prepareStm.executeUpdate();
        } catch (SQLServerException ex) {
            ex.printStackTrace();            
            return -1;
        } catch (SQLException ex) {
            ex.printStackTrace();            
            return -1;
        }
    }

    public int activeSavePWSQL(int isTrue, Customer customer) {
        SQLServerDataSource ds = configDataSource();
        try (var connect = ds.getConnection()) {
            String activePWSQL = "UPDATE dbo.Customer SET isSavepw = ? WHERE ID_Customer = ?";
            var prepareStm = connect.prepareStatement(activePWSQL);
            prepareStm.setString(1, isTrue + "");
            prepareStm.setString(2, customer.getId_customer());
            return prepareStm.executeUpdate();
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
   
}




