package com.map;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Question Q1 = new Question();
		Q1.setQues("what is SQL?");
		Question Q2 = new Question();
		Q2.setQues("what is hibernate?");
		
		Answer ans = new Answer();
		ans.setAnswer("sql is DB");
	    Answer ans1 = new Answer();
		ans1.setAnswer("hibernate is orm");
		Q1.setAns(ans);
		Q2.setAns(ans1);
		
		Session session = factory.openSession();
		Transaction tx =  (Transaction) session.beginTransaction();
		
		session.save(ans);
		session.save(Q1);
		session.save(ans1);
		session.save(Q2);
		
		
		try {
			tx.commit();
		
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicMixedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicRollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Question ques = (Question) session.load(Question.class, 1);
		System.out.println(ques.getQues());
		System.out.println(getAnswer());
		
		session.close();
		factory.close();
		
		
		
		
	}

	private static char[] getAnswer() {
		// TODO Auto-generated method stub
		return null;
	}

}
