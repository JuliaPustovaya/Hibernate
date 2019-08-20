import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateTest {
    public static void main(String args[]) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Employee employee = new Employee();

        //Set value to Employee class properties
        employee.setAge(102);
        employee.setName("JIP");

        //Create Department object
        Department  department = new Department();

        department.setDep_name("Manufacturing");
        department.setDesignation("Manufacturing Engineer");
        department.setEmployee(employee);

        //Persist the department object
        session.save(department);
        tx.commit();
        System.out.println("Great! Student was saved");
        session.close();

    }
}
