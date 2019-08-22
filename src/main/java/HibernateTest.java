import org.hibernate.Session;

import data.Department;
import data.Employee;

public class HibernateTest {
	public static void main(String args[]) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Employee e = new Employee();
		e.setName("Vadya");

		Department d = new Department();
		d.setDep_name("ISD");
		d.setEmployee(e);

		session.save(d);
		session.getTransaction().commit();
		session.close();
	}
}

