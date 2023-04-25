
package Java_project_SGU.BUS;

import Java_project_SGU.Exception.*;
import java.sql.Date;
import java.text.ParseException;

public class CleaningStaff extends Staff{
    
    // constructor
    public CleaningStaff() {
        super();
        this.updateIdStaff();   
    }
    
    public CleaningStaff(String ID_Staff, String fullName, String password, String ID_Person, String phoneNumber,
            String email, String address, String startDate, boolean sex, boolean isWorking, String nameTask,
            boolean isDelete, String birthDate, int numOfDateWorked, int salaryDay, String account) throws InvalidNameException, InvalidEmailException, InvalidPhoneException, InvalidBirthdayException, ParseException, InvalidIdPersonException, InvalidPasswordCusException, InvalidMoneyException, InvalidAccountCusException {
        super(fullName, password, ID_Person, phoneNumber, email, address, startDate, sex, isWorking, nameTask, 
                isDelete, birthDate, numOfDateWorked, salaryDay, account);
        this.setID_Staff(ID_Staff);
    }
    
    @Override
    public void setID_Staff(String iD_Staff) {
        if (iD_Staff == null){
            super.setID_Staff(iD_Staff);
            updateIdStaff();
        } else {
            super.setID_Staff(iD_Staff);
        }
    }
    
    @Override
    public void calSalary() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // hàm xử lý sự kiện
    private void updateIdStaff() {
        String idCleaningStaff = "STC" + this.getID_Staff();
        this.setID_Staff(idCleaningStaff);
    }
}