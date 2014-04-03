package com.paypal;
import java.util.Date;
import java.lang.String;

public class CampaignMetricGenericCounts 
{
	private int id;
	private String CampaignID;
	private String OfferID;
	private String OfferVID;
	private Date timestamp;
	private String Browser;
	private String Device;
	private String OS;
	private String Location;
	private int Count;
	
	public CampaignMetricGenericCounts(){}
	
	public CampaignMetricGenericCounts(String CampaignID, String OfferID, String OfferVID, Date timestamp, String Browser, String Device, String OS, String Location, int Count)
	{
		this.CampaignID=CampaignID;
		this.OfferID=OfferID;
		this.OfferVID=OfferVID;
		this.timestamp=timestamp;
		this.Browser=Browser;
		this.Device=Device;
		this.OS=OS;
		this.Location=Location;
		this.Count=Count;
		
	}
	/**
	 * getter and setter methods of CampaignMetricGenericCounts
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
	public String getBrowser()
	{
		return Browser;
	}
	public void setBrowser(String Browser)
	{
		this.Browser=Browser;
	}
	public String getDevice()
	{
		return Device;
	}
	public void setDevice(String Device)
	{
		this.Device=Device;
	}
	public String getOS()
	{
		return OS;
	}
	public void setOS(String OS)
	{
		this.OS=OS;
	}
	public String getLocation()
	{
		return Location;
	}
	public void setLocation(String Location)
	{
		this.Location=Location;
	}
	public int getCount()
	{
		return Count;
	}
	public void setCount(int Count)
	{
		this.Count=Count;
	}
}

