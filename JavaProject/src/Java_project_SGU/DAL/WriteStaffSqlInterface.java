
package Java_project_SGU.DAL;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import Java_project_SGU.BUS.Staff;

public interface WriteStaffSqlInterface {
    String SERVER = "LAPTOP-UGUU7LBC\\SQLEXPRESS";
    String USER = "sa";
    String PASSWORD = "Asdfgh1052003.";
    String DB_NAME = "quanlirapchieuphim";
    int PORT = 1433;
    
    int insertData(Staff staff);
    SQLServerDataSource configDataSource();
    public int deleteStaff(String ID_Staff);
    public int upDateStaff(Staff staff);
}
