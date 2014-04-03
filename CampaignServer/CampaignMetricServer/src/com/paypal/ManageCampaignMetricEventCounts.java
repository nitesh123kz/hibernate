package com.paypal;

import java.util.List; 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.hibernate.Query;
import com.google.gson.Gson;
import javax.ws.rs.Produces;
import org.hibernate.Session;
import javax.ws.rs.PathParam;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Path("info")
public class ManageCampaignMetricEventCounts 
{ 
	   private static ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
       private static CampaignMetricServerDAO campaignMetricServerDAO=(CampaignMetricServerDAO)applicationContext.getBean("mysession");
       private static Session session = campaignMetricServerDAO.getSessionFactory().openSession();
	   public static void main(String[] args) {
		    
	   }
	   
	   /**
	    * URL: http://<ip_address>:8181/CampaignMetricServer/rest/info/id/{campaignID}/{offerID}/{offerVID}
	    * ip_address: ip_ address of server on which tomcat_ is running.
	    */
	   
	   @GET 
	   @Path("/id/{campID}/{offID}/{offVID}") 
	   @Produces("application/json")
	   public String eventListDetails(@PathParam("campID")String campaignID,@PathParam("offID")String offerID,@PathParam("offVID")String offerVID)
	   {	
		    Gson gson = new Gson();
		    Query query = session.getNamedQuery("findEventCount").setString(0,campaignID).setString(1,offerID).setString(2,offerVID);
		    @SuppressWarnings("unchecked")
		    List<CampaignMetricEventCounts> list=(List<CampaignMetricEventCounts>)query.list();
		    if(list.isEmpty())
		    {
		    	return "No resource available!";
		    }
		    return gson.toJson(list);
	   }
	   
	   /**
	    * URL: http://<ip_address>:8181/CampaignMetricServer/rest/info/gid/{campaignID}/{offerID}/{offerVID}
	    * ip_address: ip_ address of server on which tomcat_ is running.
	    */
	   
	   @GET 
	   @Path("/gid/{campID}/{offID}/{offVID}") 
	   @Produces("application/json")
	   public String genericListDetails(@PathParam("campID")String campaignID,@PathParam("offID")String offerID,@PathParam("offVID")String offerVID)
	   {	
		    Gson gson = new Gson();
		    Query query = session.getNamedQuery("findGenericCount").setString(0,campaignID).setString(1,offerID).setString(2,offerVID);
		    @SuppressWarnings("unchecked")
		    List<CampaignMetricEventCounts> list=(List<CampaignMetricEventCounts>)query.list();
		    if(list.isEmpty())
		    {
		    	return "No resource available!";
		    }
		    return gson.toJson(list);
	   }
	   
	   /**
	    * URL: http://<ip_address>:8181/CampaignMetricServer/rest/info/ceid/{campaignID}
	    * ip_address: ip_ address of server on which tomcat_ is running.
	    */
	   
	   @GET
	   @Path("/ceid/{campaignID}")
	   @Produces("application/json")
	   public String campaignListDetails(@PathParam("campaignID")String campaignID)
	   {
		    Gson gson = new Gson();
		    Query query = session.getNamedQuery("findCampaign").setString(0,campaignID);
		    @SuppressWarnings("unchecked")
		    List<CampaignMetricEventCounts> list=(List<CampaignMetricEventCounts>)query.list();
		    if(list.isEmpty())
		    {
		    	return "No resource available!";
		    }
		    return gson.toJson(list);
	   }

	   /**
	    * URL: http://<ip_address>:8181/CampaignMetricServer/rest/info/cgid/{campaignID}
	    * ip_address: ip_ address of server on which tomcat_ is running.
	    */
	   
	   @GET
	   @Path("/cgid/{campaignID}")
	   @Produces("application/json")
	   public String campaignGenericListDetails(@PathParam("campaignID")String campaignID)
	   {
		    Gson gson = new Gson();
		    Query query = session.getNamedQuery("genericDetails").setString(0,campaignID);
		    @SuppressWarnings("unchecked")
		    List<CampaignMetricEventCounts> list=(List<CampaignMetricEventCounts>)query.list();
		    if(list.isEmpty())
		    {
		    	return "No resource available!";
		    }
		    return gson.toJson(list);
	   }
	   
	   /**
	    * URL: http://<ip_address>:8181/CampaignMetricServer/rest/info/campaign
	    * ip_address: ip_ address of server on which tomcat_ is running.
	    */
	   
	   @GET
	   @Path("/campaign")
	   @Produces("application/json")
	   public String campaignList()
	   {
		    Gson gson = new Gson();
		    Query query = session.getNamedQuery("findAll");
		    @SuppressWarnings("unchecked")
		    List<CampaignMetricEventCounts> list=(List<CampaignMetricEventCounts>)query.list();
		    if(list.isEmpty())
		    {
		    	return "No resource available!";
		    }
		    return gson.toJson(list);
	   }
	   
}

