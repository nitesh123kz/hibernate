package com.paypal;
import org.hibernate.SessionFactory;

public class CampaignMetricServerDAO 
{
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	public SessionFactory getSessionFactory()
	{
		 return sessionFactory;
	}
}
