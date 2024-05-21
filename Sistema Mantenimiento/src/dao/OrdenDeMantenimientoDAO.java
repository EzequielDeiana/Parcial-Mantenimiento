package dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Ambiente;
import datos.OrdenDeMantenimiento;

public class OrdenDeMantenimientoDAO {
	private static Session session;
	private Transaction transaction;
	public static OrdenDeMantenimientoDAO instance;
	
	public static OrdenDeMantenimientoDAO getInstance() {
		if(instance == null) {
			instance = new OrdenDeMantenimientoDAO();
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
	
	public List<OrdenDeMantenimiento> traer(Ambiente ambiente){
		List<OrdenDeMantenimiento> lista = null;
		
		try {
			iniciaOperacion();
			lista = session.createQuery("From OrdenDeMantenimiento o where o.ambiente=:ambiente", OrdenDeMantenimiento.class)
					.setParameter("ambiente", ambiente)
					.list();
			for (OrdenDeMantenimiento ordenDeMantenimiento : lista) {
				Hibernate.initialize(ordenDeMantenimiento.getAmbiente());
			}
		} finally {
			session.close();
		}
		
		return lista;
	}
	
	public List<OrdenDeMantenimiento> traer(Ambiente ambiente, boolean terminada){
		List<OrdenDeMantenimiento> lista = null;
		
		try {
			iniciaOperacion();
			lista = session.createQuery("From OrdenDeMantenimiento o where o.ambiente=:ambiente and o.terminada=:terminada", OrdenDeMantenimiento.class)
					.setParameter("ambiente", ambiente)
					.setParameter("terminada", terminada)
					.list();
			for (OrdenDeMantenimiento ordenDeMantenimiento : lista) {
				Hibernate.initialize(ordenDeMantenimiento.getAmbiente());
			}
		} finally {
			session.close();
		}
		
		return lista;
	}
	
	public List<OrdenDeMantenimiento> traer(boolean pagada){
		List<OrdenDeMantenimiento> lista = null;
		
		try {
			iniciaOperacion();
			lista = session.createQuery("from OrdenDeMantenimiento o where o.pagada=:pagada", OrdenDeMantenimiento.class)
					.setParameter("pagada", pagada)
					.list();
			for (OrdenDeMantenimiento ordenDeMantenimiento : lista) {
				Hibernate.initialize(ordenDeMantenimiento.getAmbiente());
			}
		} finally {
			session.close();
		}
		
		return lista;
	}
	
}
