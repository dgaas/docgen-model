/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © Copyright IBM Corporation 2015, 2016. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.rpe.web.service.resources.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.rpe.web.service.resources.utils.RPEDateUtils;

public class ResourceReport extends Resource
{
	@JsonProperty("lastRunOn")
	protected Date lastRunOn = null;

	@JsonProperty("averageRunTime")
	protected long averageRunTime = 0;

	@JsonProperty("scheduled")
	private boolean scheduled;

	public long getAverageRunTime()
	{
		return averageRunTime;
	}

	public void setAverageRunTime(long averageRunTime)
	{
		this.averageRunTime = averageRunTime;
	}

	public Date getLastRunOn()
	{
		return RPEDateUtils.copyDate(lastRunOn);
	}

	public void setLastRunOn(Date lastRunOn)
	{
		this.lastRunOn = RPEDateUtils.copyDate(lastRunOn);
	}

	public boolean isScheduled()
	{
		return scheduled;
	}

	public void setScheduled(boolean scheduled)
	{
		this.scheduled = scheduled;
	}
}
