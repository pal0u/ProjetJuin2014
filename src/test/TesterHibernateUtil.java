package test;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class TesterHibernateUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = null;
		session = HibernateUtil.instance().openSession();
		
		Transaction tx = null;
		try{
			tx = session.beginTransaction(); //commencer la transaction
			// les op�rations avec Hibernate
			
			
			tx.commit();
			System.out.println("pas de probl�me de mapping");
		}
		catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}
		finally {
			session.close(); 
		}
		
	}

}
