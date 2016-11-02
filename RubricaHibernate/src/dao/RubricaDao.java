package dao;

import hibernateUtil.HibernateUtil;
import model.Rubrica;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class RubricaDao {

	/// AGGIUNGI 
	public Rubrica aggiungiRubrica(String nome){
		Session session =HibernateUtil.openSession();
		Transaction tx=null;
		
		Rubrica r = null;

		try{
		tx=session.getTransaction();
		tx.begin();
		
		r = new Rubrica();
		r.setNome(nome);
		
		session.persist(r);
		 tx.commit();
		}catch(Exception ex){
			tx.rollback();
		}finally{
			session.close();
		}
		return r;
	}
	
	
	
	/// LEGGI DA NOME E COGNOME
	
	
	
	
	/// LEGGI DA TELEFONO
	
	
	
	/// MODIFICA
	
	
	
	/// ELIMINA
	
	
}
