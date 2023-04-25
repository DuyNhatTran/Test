package Java_project_SGU.DAL;

import Java_project_SGU.Exception.InvalidAccountCusException;
import Java_project_SGU.Exception.InvalidBirthdayException;
import Java_project_SGU.Exception.InvalidEmailException;
import Java_project_SGU.Exception.InvalidIdPersonException;
import Java_project_SGU.Exception.InvalidMoneyException;
import Java_project_SGU.Exception.InvalidNameException;
import Java_project_SGU.Exception.InvalidPasswordCusException;
import Java_project_SGU.Exception.InvalidPhoneException;
import Java_project_SGU.BUS.CleaningStaff;
import Java_project_SGU.BUS.CusSupStaff;
import Java_project_SGU.BUS.FoodDrinkSaler;
import Java_project_SGU.BUS.ManagerRoom;
import Java_project_SGU.BUS.ManagerShowTimeMovie;
import Java_project_SGU.BUS.ManagerStaffClient;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Java_project_SGU.BUS.Staff;
import Java_project_SGU.BUS.TicketClerk;
import Java_project_SGU.BUS.TicketInspector;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ReadStaffSqlImp implements ReadStaffSqlIntterface {

    @Override
    public SQLServerDataSource configDataSource() {
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setEncrypt(false); 
        dataSource.setIntegratedSecurity(false); 
        dataSource.setTrustServerCertificate(false);
        dataSource.setUser(ReadStaffSqlIntterface.USER);
        dataSource.setPassword(ReadStaffSqlIntterface.PASSWORD);
        dataSource.setDatabaseName(ReadStaffSqlIntterface.DB_NAME);
        dataSource.setServerName(ReadStaffSqlIntterface.SERVER);
        dataSource.setPortNumber(ReadStaffSqlIntterface.PORT);
        return dataSource;
    }

    @Override
    public List<Staff> readStaffFromDataSource() {
        List<Staff> staffs = new ArrayList<>();
        SQLServerDataSource dataSource = configDataSource();
        try (var conn = dataSource.getConnection()) {
            String SqlQuery = "select * from dbo.Staff where isDelete = ?";
            var prepareStatement = conn.prepareStatement(SqlQuery);
            prepareStatement.setString(1, "0");
            ResultSet resultSet = prepareStatement.executeQuery();
            while (resultSet.next()) {
                String ID_Staff = resultSet.getString(1);
                String fullName = resultSet.getString(2);
                String password = resultSet.getString(3);
                String ID_Person = resultSet.getString(4);
                String phoneNumber = resultSet.getString(5);
                String email = resultSet.getString(6);
                String address = resultSet.getString(7);
                String startDate = changeDate(resultSet.getString(8));
                boolean sex = false;
                if (resultSet.getString(9).equals("1")){
                    sex = true;
                } else {
                    sex = false;
                }
                boolean isWorking = false;
                if (resultSet.getString(10).equals("1")){
                    isWorking = true;
                } else {
                    isWorking = false;
                }
                String nameTask = resultSet.getString(11);
                boolean isDelete = false;
                if (resultSet.getString(12).equals("1")){
                    isDelete = true;
                } else {
                    isDelete = false;
                }
                String birtDate = changeDate(resultSet.getString(13));
                int numOfDayWorked = Integer.parseInt(resultSet.getString(14));
                int salaryDay = Integer.parseInt(resultSet.getString(15));
                String account = resultSet.getString(16);
                if (nameTask.equals("Nhân viên bán vé")){
                    Staff ticketClerk = new TicketClerk(ID_Staff, fullName, password, ID_Person, phoneNumber, email, 
                            address, startDate, sex, isWorking, nameTask, isDelete, birtDate, 
                            numOfDayWorked, salaryDay, account);
                    staffs.add(ticketClerk);
                } else if(nameTask.equals("Nhân viên bán thức ăn")) {
                    Staff foodDrinkSaller = new FoodDrinkSaler(ID_Staff, fullName, password, ID_Person, phoneNumber, 
                            email, address, startDate, sex, isWorking, nameTask, isDelete, birtDate, 
                            numOfDayWorked, salaryDay, account);
                    staffs.add(foodDrinkSaller);
                } else if(nameTask.equals("Nhân viên soát vé")) {
                    Staff ticketInspector = new TicketInspector(ID_Staff, fullName, password, ID_Person, phoneNumber, 
                            email, address, startDate, sex, isWorking, nameTask, isDelete, birtDate, 
                            numOfDayWorked, salaryDay, account);
                    staffs.add(ticketInspector);
                } else if(nameTask.equals("Nhân viên vệ sinh")) {
                    Staff cleaningStaff = new CleaningStaff(ID_Staff, fullName, password, ID_Person, phoneNumber, 
                            email, address, startDate, sex, isWorking, nameTask, isDelete, birtDate, 
                            numOfDayWorked, salaryDay, account);
                    staffs.add(cleaningStaff);
                } else if(nameTask.equals("Nhân viên hỗ trợ khách hàng")) {
                    Staff cusSupStaff = new CusSupStaff(ID_Staff, fullName, password, ID_Person, phoneNumber, 
                            email, address, startDate, sex, isWorking, nameTask, isDelete, birtDate, 
                            numOfDayWorked, salaryDay, account);
                    staffs.add(cusSupStaff);
                } else if(nameTask.equals("Quản lí phòng rạp")) {
                    Staff managerRoom = new ManagerRoom(ID_Staff, fullName, password, ID_Person, phoneNumber, 
                            email, address, startDate, sex, isWorking, nameTask, isDelete, birtDate, 
                            numOfDayWorked, salaryDay, account);
                    staffs.add(managerRoom);
                } else if(nameTask.equals("Quản lí suất chiếu và phim")) {
                    Staff managerShowTimeMovie = new ManagerShowTimeMovie(ID_Staff, fullName, password, ID_Person, 
                            phoneNumber, email, address, startDate, sex, isWorking, nameTask, isDelete, birtDate, 
                            numOfDayWorked, salaryDay, account);
                    staffs.add(managerShowTimeMovie);
                } else if(nameTask.equals("Quản lí nhân viên và khách hàng")) {
                    Staff managerStaffClient = new ManagerStaffClient(ID_Staff, fullName, password, ID_Person, 
                            phoneNumber, email, address, startDate, sex, isWorking, nameTask, isDelete, 
                            birtDate, numOfDayWorked, salaryDay, account);
                    staffs.add(managerStaffClient);
                }
            }
        } catch (SQLServerException ex) {
            Logger.getLogger(ReadStaffSqlImp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReadStaffSqlImp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidNameException ex) {
            Logger.getLogger(ReadStaffSqlImp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidEmailException ex) {
            Logger.getLogger(ReadStaffSqlImp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidPhoneException ex) {
            Logger.getLogger(ReadStaffSqlImp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidBirthdayException ex) {
            Logger.getLogger(ReadStaffSqlImp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ReadStaffSqlImp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidIdPersonException ex) {
            Logger.getLogger(ReadStaffSqlImp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidPasswordCusException ex) {
            Logger.getLogger(ReadStaffSqlImp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidMoneyException ex) {
            Logger.getLogger(ReadStaffSqlImp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidAccountCusException ex) {
            Logger.getLogger(ReadStaffSqlImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return staffs;
    }

    private String changeDate(String date) throws ParseException {
        SimpleDateFormat formatDateStaff = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatDateSql = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date dateSql = formatDateSql.parse(date);
        String dateStaff = formatDateStaff.format(dateSql);
        return dateStaff;
    }
}
