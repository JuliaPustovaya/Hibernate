import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory =
			buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		SessionFactory sessionFactory = null;
		try {
			return new AnnotationConfiguration().configure()
					.buildSessionFactory();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return sessionFactory;
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
