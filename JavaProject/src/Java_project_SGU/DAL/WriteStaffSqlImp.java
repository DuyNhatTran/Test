
package Java_project_SGU.DAL;

import Java_project_SGU.BUS.Staff;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteStaffSqlImp implements WriteStaffSqlInterface{

    @Override
    public int insertData(Staff staff) {
        SQLServerDataSource ds = configDataSource();
        try(var conn = ds.getConnection()) {
            var sql = "insert into dbo.Staff(ID_Staff, FullName, Password, ID_Person, PhoneNumber, Email, Address, StartDate, Sex, IsWorking, NameTask, IsDelete, BirthDate, NumOfDayWorked, SalaryDay, Account)" + 
                    " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            var prepareStm = conn.prepareStatement(sql);
            System.out.println(staff.getID_Staff());
            prepareStm.setString(1, staff.getID_Staff()); //
            prepareStm.setString(2, staff.getFullName()); //
            prepareStm.setString(3, staff.getPassword()); //
            prepareStm.setString(4, staff.getId_person()); //
            prepareStm.setString(5, staff.getPhoneNumber()); //
            prepareStm.setString(6, staff.getEmail()); //
            prepareStm.setString(7, staff.getAddress()); //
            SimpleDateFormat formatDateSql = new SimpleDateFormat("yyyy-MM-dd");
            prepareStm.setString(8, formatDateSql.format(staff.getStartDate())); //
            if (staff.getSex()){
                prepareStm.setString(9, "true");
            } else {
                prepareStm.setString(9, "false");
            } //
            if (staff.isIsWorking()){
                prepareStm.setString(10, "true");
            } else {
                prepareStm.setString(10, "false");
            } //
            prepareStm.setString(11, staff.getNameTask()); //
            if (staff.isIsDelete()){
                prepareStm.setString(12, "true");
            } else {
                prepareStm.setString(12, "false");
            } //
            prepareStm.setString(13, formatDateSql.format(staff.getBirthDay())); //
            prepareStm.setInt(14, staff.getNumOfDateWorked()); // 
            prepareStm.setInt(15, staff.getSalaryDate());
            prepareStm.setString(16, staff.getAccount());
            return prepareStm.executeUpdate();
        } catch (SQLServerException ex) {
            Logger.getLogger(WriteStaffSqlImp.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        } catch (SQLException ex) {
            Logger.getLogger(WriteStaffSqlImp.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }  
    }

    @Override
    public SQLServerDataSource configDataSource() {
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setEncrypt(false); // (1)
        dataSource.setIntegratedSecurity(false);
        dataSource.setTrustServerCertificate(false);
        dataSource.setUser(WriteStaffSqlInterface.USER);
        dataSource.setPassword(WriteStaffSqlInterface.PASSWORD);
        dataSource.setDatabaseName(WriteStaffSqlInterface.DB_NAME);
        dataSource.setServerName(WriteStaffSqlInterface.SERVER);
        dataSource.setPortNumber(WriteStaffSqlInterface.PORT);
        return dataSource;
    }

    @Override
    public int deleteStaff(String ID_StaffDelete) {
        SQLServerDataSource ds = configDataSource();
        try(var connect = ds.getConnection()) {
            String deleteStaffQuery = "update dbo.Staff set isDelete = 1 where ID_Staff = ?";
            var prepareStm = connect.prepareStatement(deleteStaffQuery);
            prepareStm.setString(1, ID_StaffDelete);
            return prepareStm.executeUpdate();
        } catch (SQLServerException ex) {
            Logger.getLogger(WriteStaffSqlImp.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        } catch (SQLException ex) {
            Logger.getLogger(WriteStaffSqlImp.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    @Override
    public int upDateStaff(Staff staff) {
        SQLServerDataSource ds = configDataSource();
        try(var connect = ds.getConnection()) {
            String updateStaffQuery = "update dbo.Staff set FullName = ?, PhoneNumber = ?, "
                    + "Email = ?, Address = ?, StartDate = ?, Sex = ?, NameTask = ?, BirthDate = ? where ID_Staff = ?";
            var prepareStm = connect.prepareStatement(updateStaffQuery);
            prepareStm.setString(1, staff.getFullName());
            prepareStm.setString(2, staff.getPhoneNumber());
            prepareStm.setString(3, staff.getEmail());
            prepareStm.setString(4, staff.getAddress());
            SimpleDateFormat formatDateSql = new SimpleDateFormat("yyyy-MM-dd");
            prepareStm.setString(5, formatDateSql.format(staff.getStartDate()));
            if (staff.getSex()){
                prepareStm.setString(6, "1");
            } else {
                prepareStm.setString(6, "0");
            }
            prepareStm.setString(7, staff.getNameTask());
            prepareStm.setString(8, formatDateSql.format(staff.getBirthDay()));
            prepareStm.setString(9, staff.getID_Staff());
            return prepareStm.executeUpdate();
        } catch (SQLServerException ex) {
            Logger.getLogger(WriteStaffSqlImp.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        } catch (SQLException ex) {
            Logger.getLogger(WriteStaffSqlImp.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
}
