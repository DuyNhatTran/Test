
package Java_project_SGU.DAL;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.util.List;
import Java_project_SGU.BUS.Staff;

public interface ReadStaffSqlIntterface {
    String SERVER = "LAPTOP-UGUU7LBC\\SQLEXPRESS";
    String USER = "sa";
    String PASSWORD = "Asdfgh1052003.";
    String DB_NAME = "quanlirapchieuphim";
    int PORT = 1433;
    
    SQLServerDataSource configDataSource();
    List<Staff> readStaffFromDataSource();
}
