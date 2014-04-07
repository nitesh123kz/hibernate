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
	    * URL: http://<ip_address>:8181/CampaignMetricServer/rest/info/CampaignID/{campaignID}
	    * ip_address: ip_ address of server on which tomcat_ is running.
	    */
	   
	   @GET
	   @Path("/CampaignID={campaignID}")
	   @Produces("application/json")
	   public String detailsByCampaignID(@PathParam("campaignID")String campaignID)
	   {
		    Gson gson = new Gson();
		    Query query = session.getNamedQuery("findDetailsByCampaignID").setString(0,campaignID);
		    @SuppressWarnings("unchecked")
		    List<CampaignMetricEventCounts> list=(List<CampaignMetricEventCounts>)query.list();
		    if(list.isEmpty())
		    {
		    	return "No resource available!";
		    }
		    return gson.toJson(list);
	   }
	   
	   /**
	    * URL: http://<ip_address>:8181/CampaignMetricServer/rest/info/id/{campaignID}/{offerID}/{offerVID}
	    * ip_address: ip_ address of server on which tomcat_ is running.
	    */
	   
	   @GET 
	   @Path("/CampaignID={campaignID}&OfferID={offerID}") 
	   @Produces("application/json")
	   public String detailsByOfferID(@PathParam("campaignID")String campaignID,@PathParam("offerID")String offerID)
	   {	
		    Gson gson = new Gson();
		    Query query = session.getNamedQuery("findDetailsByOfferID").setString(0,campaignID).setString(1,offerID);
		    @SuppressWarnings("unchecked")
		    List<CampaignMetricEventCounts> list=(List<CampaignMetricEventCounts>)query.list();
		    if(list.isEmpty())
		    {
		    	return "No resource available!";
		    }
		    return gson.toJson(list);
	   }
	   
	   /**
	    * URL: http://<ip_address>:8181/CampaignMetricServer/rest/info/id/{campaignID}/{offerID}/{offerVID}
	    * ip_address: ip_ address of server on which tomcat_ is running.
	    */
	   
	   @GET 
	   @Path("/CampaignID={campaignID}&OfferID={offerID}&OfferVID={offerVID}") 
	   @Produces("application/json")
	   public String detailsByOfferVID(@PathParam("campaignID")String campaignID,@PathParam("offerID")String offerID,@PathParam("offerVID")String offerVID)
	   {	
		    Gson gson = new Gson();
		    Query query = session.getNamedQuery("findDetailsByOfferVID").setString(0,campaignID).setString(1,offerID).setString(2,offerVID);
		    @SuppressWarnings("unchecked")
		    List<CampaignMetricEventCounts> list=(List<CampaignMetricEventCounts>)query.list();
		    if(list.isEmpty())
		    {
		    	return "No resource available!";
		    }
		    return gson.toJson(list);
	   }
	   
	   
	   /***************************************************************************/

	   /**
	    * URL: http://<ip_address>:8181/CampaignMetricServer/rest/info/CampaignID/{campaignID}
	    * ip_address: ip_ address of server on which tomcat_ is running.
	    */
	   
	   @GET
	   @Path("/generic/CampaignID={campaignID}")
	   @Produces("application/json")
	   public String genericDetailsByCampaignID(@PathParam("campaignID")String campaignID)
	   {
		    Gson gson = new Gson();
		    Query query = session.getNamedQuery("findGenericDetailsByCampaignID").setString(0,campaignID);
		    @SuppressWarnings("unchecked")
		    List<CampaignMetricGenericCounts> list=(List<CampaignMetricGenericCounts>)query.list();
		    if(list.isEmpty())
		    {
		    	return "No resource available!";
		    }
		    return gson.toJson(list);
	   }
	   
	   /**
	    * URL: http://<ip_address>:8181/CampaignMetricServer/rest/info/id/{campaignID}/{offerID}/{offerVID}
	    * ip_address: ip_ address of server on which tomcat_ is running.
	    */
	   
	   @GET 
	   @Path("/generic/CampaignID={campaignID}&OfferID={offerID}") 
	   @Produces("application/json")
	   public String genericDetailsByOfferID(@PathParam("campaignID")String campaignID,@PathParam("offerID")String offerID)
	   {	
		    Gson gson = new Gson();
		    Query query = session.getNamedQuery("findGenericDetailsByOfferID").setString(0,campaignID).setString(1,offerID);
		    @SuppressWarnings("unchecked")
		    List<CampaignMetricGenericCounts> list=(List<CampaignMetricGenericCounts>)query.list();
		    if(list.isEmpty())
		    {
		    	return "No resource available!";
		    }
		    return gson.toJson(list);
	   }
	   
	   /**
	    * URL: http://<ip_address>:8181/CampaignMetricServer/rest/info/id/{campaignID}/{offerID}/{offerVID}
	    * ip_address: ip_ address of server on which tomcat_ is running.
	    */
	   
	   @GET 
	   @Path("/generic/CampaignID={campaignID}&OfferID={offerID}&OfferVID={offerVID}") 
	   @Produces("application/json")
	   public String genericDetailsByOfferVID(@PathParam("campaignID")String campaignID,@PathParam("offerID")String offerID,@PathParam("offerVID")String offerVID)
	   {	
		    Gson gson = new Gson();
		    Query query = session.getNamedQuery("findGenericDetailsByOfferVID").setString(0,campaignID).setString(1,offerID).setString(2,offerVID);
		    @SuppressWarnings("unchecked")
		    List<CampaignMetricGenericCounts> list=(List<CampaignMetricGenericCounts>)query.list();
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
