/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © Copyright IBM Corporation 2014, 2016. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.rpe.web.service.resources.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.rpe.web.service.resources.utils.RPEDateUtils;


public class JobNotification
{
	public static final String NOTIFICATION_STATUS_NEW = "NEW"; //$NON-NLS-1$
	
	@JsonProperty("notificationid")
	private String notificationid;

	@JsonProperty("jobid")
	private String jobid;

	@JsonProperty("isnewold")
	private String isNewOld;

	@JsonProperty("modifiedon")
	private Date modifiedOn;
	
	@JsonProperty("status")
	private String status;
	
	@JsonProperty("reportname")
	private String reportName;
	
	
	public enum NotificationStatus
	{
		NEW, OLD
	}

	public JobNotification()
	{
	}

	public JobNotification(String notiifcationid, String isNewOld, Date modifiedOn, String jobid)
	{
		super();
		this.notificationid = notiifcationid;
		this.isNewOld = isNewOld;
		this.modifiedOn = new Date(modifiedOn.getTime());
		this.jobid = jobid;
	}

	public String getNotificationid()
	{
		return notificationid;
	}

	public void setNotificationid(String notificationid)
	{
		this.notificationid = notificationid;
	}

	public String getJobid()
	{
		return jobid;
	}

	public void setJobid(String jobid)
	{
		this.jobid = jobid;
	}

	public String getIsNewOld()
	{
		return isNewOld;
	}

	public void setIsNewOld(String isNewOld)
	{
		this.isNewOld = isNewOld;
	}

	public Date getModifiedOn()
	{
		return RPEDateUtils.copyDate(modifiedOn);
	}

	public void setModifiedOn(Date modifiedOn)
	{
		this.modifiedOn = RPEDateUtils.copyDate(modifiedOn);
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getReportName()
	{
		return reportName;
	}

	public void setReportName(String reportName)
	{
		this.reportName = reportName;
	}


}
