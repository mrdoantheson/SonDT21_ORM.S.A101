package training.hibernate.dao.ImpL;

import org.hibernate.Session;
import training.hibernate.dao.EmployeeDao;
import training.hibernate.model.Employee;
import training.hibernate.util.XmlConnectionConfig;

import java.util.List;

public class EmployeeDaoImpL implements EmployeeDao {
    @Override
    public void save(Employee employee) {
        try (Session session = XmlConnectionConfig.getSession()) {
            session.beginTransaction();
            session.persist(employee);
            session.getTransaction().commit();
        }
    }
}
