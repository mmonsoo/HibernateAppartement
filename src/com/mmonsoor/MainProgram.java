package com.mmonsoor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.mmonsoor.entity.Appartement;
import com.mmonsoor.entity.Canape;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration();
		SessionFactory sessionFactory = config.configure().buildSessionFactory();
		//Ouverture session
		Session session = sessionFactory.openSession() ;
		Appartement a1=new Appartement(4, 200, "Jaune", "Parquet Bois");
		Appartement a2=new Appartement(4, 4, "Vert", "Marbré");
		System.out.println(a1.descriptionAppartement());
		System.out.println(a2.descriptionAppartement());
		Canape c1=new Canape(8, "Militaire", "Rose BonBON");
		Canape c2=new Canape(2, "Ecossais", "Rouge Vin");
		//System.out.println(c1.descriptionCanape());
		//a1.setCanapeSalon(c1);
		a2.setCanapeSalon(c2);
		//addAppartement(session,a1);
		addAppartement(session,a2);
	}
	
	public static void addAppartement(Session session,Appartement a) {
		//Fermeture session
		session.beginTransaction();
		session.save(a);
		session.getTransaction().commit();
		session.close();		
	}

}
