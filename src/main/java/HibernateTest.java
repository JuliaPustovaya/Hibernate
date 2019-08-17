import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateTest {
    public static void main(String args[]) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Student student = new Student("Yana", "45");
        StudentInformation studentInformation = new StudentInformation();
        studentInformation.setAddress("1st Street");
        studentInformation.setPhoneNumber("982349823");
        studentInformation.setRegistryNumber("ax203");
        studentInformation.setStudent(student);
        student.setStudentInfo(studentInformation);
        session.save(student);
        tx.commit();
        System.out.println("Great! Student was saved");
        session.close();

    }
}
