package com.paypal;

import java.util.List; 

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;

public class ManageCampaignMetricEventCounts {
	private static SessionFactory factory; 
	   public static void main(String[] args) {
	      try{
	         factory = new Configuration().configure().buildSessionFactory();
	      }catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
	      ManageCampaignMetricEventCounts ME = new ManageCampaignMetricEventCounts();
	      ME.listDetails();
	   }
	   public void listDetails()
	   {
		   Session session = factory.openSession();
		   Transaction tx = null;
		   tx = session.beginTransaction();
		   try{
		   Query query=session.getNamedQuery("findEventCount").setInteger(0,1);
		   @SuppressWarnings("unchecked")
		   List<CampaignMetricEventCounts> list = (List<CampaignMetricEventCounts>)query.list();
		   for(CampaignMetricEventCounts event : list)
		   {
			   System.out.println("CampaignID: "+event.getCampaignID()+" cl_count: "+event.getCL_COUNT());
		   }
		   tx.commit();
		   }catch(HibernateException e)
		   {
			   if (tx!=null) tx.rollback();
		         e.printStackTrace();
			   
		   }finally
		   {
		   session.close();
		   }
	   }
	   
}
