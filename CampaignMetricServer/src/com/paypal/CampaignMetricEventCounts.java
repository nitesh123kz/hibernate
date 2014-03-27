package com.paypal;
import java.util.Date;
import java.lang.String;



public class CampaignMetricEventCounts 
{
	private int id;
	private String CampaignID;
	private String OfferID;
	private String OfferVID;
	private Date timestamp;
	private int IM_COUNT;
	private int CL_COUNT;
	private int CV_COUNT;
	
	public CampaignMetricEventCounts(){}
	
	public CampaignMetricEventCounts(String CampaignID, String OfferID, String OfferVID, Date timestamp, int IM_COUNT, int CL_COUNT, int CV_COUNT )
	{
		this.CampaignID=CampaignID;
		this.OfferID=OfferID;
		this.OfferVID=OfferVID;
		this.timestamp=timestamp;
		this.IM_COUNT=IM_COUNT;
		this.CL_COUNT=CL_COUNT;
		this.CV_COUNT=CV_COUNT;
		
	}
	/**
	 * getter and setter methods
	 */
	public int getId() 
	{
	    return id;
	}
	public void setId( int id ) 
	{
	      this.id = id;
	}
	public String getCampaignID()
	{
		return CampaignID;
	}
	public void setCampaignID(String CampaignID)
	{
		this.CampaignID=CampaignID;
	}
	public String getOfferID()
	{
		return OfferID;
	}
	public void setOfferID(String OfferID)
	{
		this.OfferID=OfferID;
	}
	public String getOfferVID()
	{
		return OfferVID;
	}
	public void setOfferVID(String OfferVID)
	{
		this.OfferVID=OfferVID;
	}
	public Date gettimestamp()
	{
		return timestamp;
	}
	public void settimestamp(Date timestamp)
	{
		this.timestamp=timestamp;
	}
	public int getIM_COUNT()
	{
		return IM_COUNT;
	}
	public void setIM_COUNT(int IM_COUNT)
	{
		this.IM_COUNT=IM_COUNT;
	}
	public int getCL_COUNT()
	{
		return CL_COUNT;
	}
	public void setCL_COUNT(int CL_COUNT)
	{
		this.CL_COUNT=CL_COUNT;
	}
	public int getCV_COUNT()
	{
		return CV_COUNT;
	}
	public void setCV_COUNT(int CV_COUNT)
	{
		this.CV_COUNT=CV_COUNT;
	}
}
