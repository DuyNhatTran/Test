/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_project_SGU.DAL;

import Java_project_SGU.Exception.InvalidAccountCusException;
import Java_project_SGU.Exception.InvalidBirthdayException;
import Java_project_SGU.Exception.InvalidEmailException;
import Java_project_SGU.Exception.InvalidIdPersonException;
import Java_project_SGU.Exception.InvalidNameException;
import Java_project_SGU.Exception.InvalidPasswordCusException;
import Java_project_SGU.Exception.InvalidPhoneException;
import Java_project_SGU.BUS.Customer;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author ADMIN
 */
public class ReadCusSqlImp implements ReadCusSqlInterface{

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
    
    

    @Override
    public List<Customer> readCustomersFromDataSource() {
        List<Customer> customers = new ArrayList<>();
        SQLServerDataSource dataSource = configDataSource();
        try(var conn = dataSource.getConnection()) {
            String SqlQuery = "SELECT * FROM dbo.Customer WHERE isDelete = ?";
            var prepareStatement = conn.prepareStatement(SqlQuery);           
            prepareStatement.setString(1, "False");
            ResultSet resultSet =  prepareStatement.executeQuery();
            while (resultSet.next()) {
                String idCustomer = resultSet.getString(1);
                String fullName = resultSet.getString(2);
                String passWord = resultSet.getString(3);
                String phoneNumber = resultSet.getString(4);
                String email = resultSet.getString(5);
                String birthDate = "";
                try {
                    birthDate = changeDate(resultSet.getString(6));
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
                boolean sex = false;
                if (resultSet.getString(7).equals("1")) {
                    sex = true;
                } else { sex = false; }
                boolean isSavePw = false;
                if (resultSet.getString(8).equals("1")) {
                    isSavePw = true;
                } else { isSavePw = false; }
                String idPerson = resultSet.getString(9);
                String address = resultSet.getString(10);
                String account = resultSet.getString(11);
                SimpleDateFormat startDateFormart = new SimpleDateFormat("yyyy-MM-dd hh:ss:mm");
                String startDate = "";
                try {
                    startDate = changeDate_2(resultSet.getString(12));
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
                Customer customer = new Customer(idCustomer, account, 
                        passWord, isSavePw, fullName, email, phoneNumber,
                        address, birthDate, sex, idPerson);
                customer.setStartDate(startDate);
                customers.add(customer);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (InvalidNameException ex) {
            ex.printStackTrace();
        } catch (InvalidEmailException ex) {
            ex.printStackTrace();
        } catch (InvalidPhoneException ex) {
            ex.printStackTrace();
        } catch (InvalidBirthdayException ex) {
            ex.printStackTrace();
        } catch (InvalidIdPersonException ex) {
            ex.printStackTrace();
        } catch (InvalidAccountCusException ex) {
            ex.printStackTrace();
        } catch (InvalidPasswordCusException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return customers;
    }   
    
    private static String changeDate (String date) throws ParseException {
        SimpleDateFormat fomartDateCustomer = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat fomartDateSql = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date dateSql = fomartDateSql.parse(date);
        String dateCustomer = fomartDateCustomer.format(dateSql);
        return dateCustomer;
    }

    private String changeDate_2(String date) throws ParseException {
        SimpleDateFormat fomartDateCustomer = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        SimpleDateFormat fomartDateSql = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        java.util.Date dateSql = fomartDateSql.parse(date);
        String dateCustomer = fomartDateCustomer.format(dateSql);
        return dateCustomer;
    }
}