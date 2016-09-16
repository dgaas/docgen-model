/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © Copyright IBM Corporation 2015. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.rpe.web.service.resources.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.rpe.web.service.resources.utils.RPEDateUtils;

@JsonInclude(Include.NON_NULL)
public class Schedule
{
	public enum SCHEDULE_STATUS
	{
		ACTIVE, INACTIVE, DELETED, EXPIRED
	}

	@JsonProperty("id")
	private String id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("description")
	private String description;

	@JsonProperty("status")
	private String status;

	@JsonProperty("reportname")
	private String reportName;

	@JsonProperty("reporturl")
	private String reportUrl;
	
	@JsonProperty("tags")
	@JsonInclude(Include.ALWAYS)
	protected List<String> tags;
	
	@JsonProperty("shared")
	private boolean shared;

	@JsonProperty("url")
	private String url;

	@JsonIgnore
	private String cronExpression;

	@JsonProperty("frequency")
	private String frequency;

	@JsonProperty("createdby")
	private String createdBy;

	@JsonProperty("createdon")
	private Date createdOn;

	@JsonProperty("modifiedon")
	private Date modifiedOn;

	@JsonProperty("modifiedby")
	private String modifiedBy;

	@JsonProperty("startdate")
	private Date startDate;

	@JsonProperty("requesturl")
	private String requestUrl;

	@JsonProperty("enddate")
	private Date endDate;

	@JsonProperty("nextrun")
	private Date nextRun;

	@JsonProperty("lastrun")
	private Date lastRun;

	@JsonProperty("scheduleddate")
	private Date scheduledDate;

	@JsonProperty("daysofweek")
	private String daysOfWeek;

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getReportUrl()
	{
		return reportUrl;
	}

	public void setReportUrl(String reportUrl)
	{
		this.reportUrl = reportUrl;
	}

	public String getCronExpression()
	{
		return cronExpression;
	}

	public void setCronExpression(String cronExpression)
	{
		this.cronExpression = cronExpression;
	}

	public String getFrequency()
	{
		return frequency;
	}

	public void setFrequency(String frequency)
	{
		this.frequency = frequency;
	}

	public String getCreatedBy()
	{
		return createdBy;
	}

	public void setCreatedBy(String createdBy)
	{
		this.createdBy = createdBy;
	}

	public String getModifiedBy()
	{
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy)
	{
		this.modifiedBy = modifiedBy;
	}

	public Date getEndDate()
	{
		return RPEDateUtils.copyDate(endDate);
	}

	public void setEndDate(Date endDate)
	{
		this.endDate = RPEDateUtils.copyDate(endDate);
	}

	public Date getStartDate()
	{
		return RPEDateUtils.copyDate(startDate);
	}

	public void setStartDate(Date startDate)
	{
		this.startDate = RPEDateUtils.copyDate(startDate);
	}

	public Date getNextRun()
	{
		return RPEDateUtils.copyDate(nextRun);
	}

	public void setNextRun(Date nextRun)
	{
		this.nextRun = RPEDateUtils.copyDate(nextRun);
	}

	public Date getLastRun()
	{
		return RPEDateUtils.copyDate(lastRun);
	}

	public void setLastRun(Date lastRun)
	{
		this.lastRun = RPEDateUtils.copyDate(lastRun);
	}

	public Date getCreatedOn()
	{
		return RPEDateUtils.copyDate(createdOn);
	}

	public void setCreatedOn(Date createdOn)
	{
		this.createdOn = RPEDateUtils.copyDate(createdOn);
	}

	public Date getModifiedOn()
	{
		return RPEDateUtils.copyDate(modifiedOn);
	}

	public void setModifiedOn(Date modifiedOn)
	{
		this.modifiedOn = RPEDateUtils.copyDate(modifiedOn);
	}

	public Date getScheduledDate()
	{
		return RPEDateUtils.copyDate(scheduledDate);
	}

	public void setScheduledDate(Date scheduledDate)
	{
		this.scheduledDate = RPEDateUtils.copyDate(scheduledDate);
	}

	public String getDaysOfWeek()
	{
		return daysOfWeek;
	}

	public void setDaysOfWeek(String daysOfWeek)
	{
		this.daysOfWeek = daysOfWeek;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getRequestUrl()
	{
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl)
	{
		this.requestUrl = requestUrl;
	}

	public String getReportName()
	{
		return reportName;
	}

	public void setReportName(String reportName)
	{
		this.reportName = reportName;
	}
	
	public boolean isShared()
	{
		return shared;
	}

	public void setShared(boolean shared)
	{
		this.shared = shared;
	}
	
	public List<String> getTags()
	{
		return tags;
	}

	public void setTags(List<String> tags)
	{
		if (this.tags == null)
		{
			this.tags = new ArrayList<String>(tags.size());
		}
		else
		{
			this.tags.clear();
		}

		this.tags.addAll(tags);

		Collections.sort(this.tags);
	}
}