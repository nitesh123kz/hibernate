package com.paypal;
import com.google.gson.Gson;
import java.util.LinkedList;
import java.util.List; 

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;

@Path("info")
public class ManageCampaignMetricEventCounts 
{ 
	   public static void main(String[] args) {
	     
	   }
	 
	    @GET 
		@Path("/id/{i}") 
		@Produces("application/json")
	   public String listDetails(@PathParam("i")int i)
	   {	
	       
		   int id=i;
		   Gson gson = new Gson();
		   SessionFactory factory;
		   List<CampaignMetricEventCounts> list1 = new LinkedList<CampaignMetricEventCounts>();
		   try
		   {
		         factory = new Configuration().configure().buildSessionFactory();
		   }
		   catch (Throwable ex) 
		   { 
		         System.err.println("Failed to create sessionFactory object." + ex);
		         throw new ExceptionInInitializerError(ex); 
		   }
		   
		   Session session = factory.openSession();
		   Transaction tx = null;
		   tx = session.beginTransaction();
		   
		   try
		   {
			   Query query=session.getNamedQuery("findEventCount").setInteger(0,id);
			   @SuppressWarnings("unchecked")
			   List<CampaignMetricEventCounts> list= (List<CampaignMetricEventCounts>)query.list();
			   for(CampaignMetricEventCounts event : list)
			   {
				   System.out.println("CampaignID: "+event.getCampaignID()+" cl_count: "+event.getCL_COUNT());
			   }

			   list1=list;
			   tx.commit();
		   }
		   catch(HibernateException e)
		   {
			   if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		   }
		   finally
		   {
			   session.close();
		   }
		  return gson.toJson(list1);
	   }
	   
}
