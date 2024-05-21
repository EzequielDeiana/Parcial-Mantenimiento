package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Ambiente;

public class AmbienteDAO {
	private static Session session;
	private Transaction transaction;
	public static AmbienteDAO instance;
	
	public AmbienteDAO() {}
	
	public static AmbienteDAO getInstance() {
		if(instance == null) {
			instance = new AmbienteDAO();
		}
		return instance;
	}
	
	protected void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
	}

	protected void manejaExcepcion(HibernateException he) throws HibernateException {
		transaction.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}
	
	public Ambiente traer(int idAmbiente) {
		Ambiente objeto = null;
		
		try {
			iniciaOperacion();
			objeto = (Ambiente) session.get(Ambiente.class, idAmbiente);
		} finally {
			session.close();
		}
		
		return objeto;
	}
	
}
