package training.hibernate;

import training.hibernate.dao.EmployeeDao;
import training.hibernate.dao.ImpL.EmployeeDaoImpL;
import training.hibernate.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee johnDone = new Employee();
        johnDone.setFirstName("John");
        johnDone.setLastName("Doe");

        EmployeeDao employeeDao = new EmployeeDaoImpL();
        employeeDao.save(johnDone);
    }
}
