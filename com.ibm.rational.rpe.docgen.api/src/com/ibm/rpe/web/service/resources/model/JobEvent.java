/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © Copyright IBM Corporation 2014, 2015. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.rpe.web.service.resources.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.rpe.web.service.resources.utils.RPEDateUtils;

@JsonInclude(Include.NON_EMPTY)
public class JobEvent
{
	@JsonProperty("eventid")
	private String eventid;

	@JsonProperty("jobid")
	private String jobid;

	@JsonProperty("details")
	private String details;

	@JsonProperty("modifiedon")
	private Date modifiedOn;

	public JobEvent()
	{
	}

	public JobEvent(String eventid, String details, Date modifiedOn, String jobid)
	{
		super();
		this.eventid = eventid;
		this.details = details;
		this.modifiedOn = new Date(modifiedOn.getTime());
		this.jobid = jobid;
	}

	public String getEventid()
	{
		return eventid;
	}

	public void setEventid(String eventid)
	{
		this.eventid = eventid;
	}

	public String getDetails()
	{
		return details;
	}

	public void setDetails(String details)
	{
		this.details = details;
	}

	public Date getModifiedOn()
	{
		return RPEDateUtils.copyDate(modifiedOn);
	}

	public void setModifiedOn(Date modifiedOn)
	{
		this.modifiedOn = RPEDateUtils.copyDate(modifiedOn);
	}

	public String getJobid()
	{
		return jobid;
	}

	public void setJobid(String jobid)
	{
		this.jobid = jobid;
	}

}
