
import org.hibernate.Session;


public class HibernateTest {
    public static void main(String args[]) {

        // builds a session factory from the service registry

        // obtains the session
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
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
        session.getTransaction().commit();
        System.out.println("Great! Student was saved");
        session.close();

    }
}
