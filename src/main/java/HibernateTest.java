import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateTest {
	public static void main(String args[]) {
		Student student = new Student();
		student.setFirstName("Polina");
		student.setLastName("Solenki");
		student.setClassName("MCA final");
		student.setRollNo("MCA/07/70");
		student.setAge(37);
		Transaction tx = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			tx = session.beginTransaction();
			session.save(student);
			tx.commit();
		}
		catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}
}
