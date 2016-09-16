/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © Copyright IBM Corporation 2014, 2016. All Rights Reserved.
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

@JsonInclude(Include.NON_EMPTY)
public class Job
{
	@JsonProperty("jobid")
	private String jobId;

	@JsonProperty("createdby")
	private String createdBy;

	@JsonProperty("modifiedby")
	private String modifiedBy;

	@JsonProperty("createdon")
	private Date createdOn;

	@JsonProperty("modifiedon")
	private Date modifiedOn;

	@JsonProperty("status")
	private Status status;

	@JsonProperty("reporturl")
	private String reportUrl;

	@JsonProperty("scheduleid")
	private String scheduleId;

	@JsonProperty("reportid")
	private String reportId;

	@JsonProperty("title")
	private String reportName;

	@JsonProperty("description")
	private String description;

	@JsonProperty("shared")
	private boolean shared;

	@JsonProperty("promoted")
	private boolean promoted;

	@JsonProperty("owned")
	private boolean owned;

	@JsonIgnore
	private String resultUrl;

	@JsonProperty("tags")
	@JsonInclude(Include.ALWAYS)
	protected List<String> tags;

	@JsonProperty("jobresult")
	protected List<JobResult> jobResults;

	public enum Status
	{
		NEW, QUEUED, RUNNING, FINISHED, FAILED, CANCELLED, PAUSED, REQUEST_RESUME, REQUEST_PAUSE, REQUEST_CANCEL
	}

	public String getJobId()
	{
		return jobId;
	}

	public String getScheduleId()
	{
		return scheduleId;
	}

	public void setScheduleId(String scheduleId)
	{
		this.scheduleId = scheduleId;
	}

	public void setJobId(String jobId)
	{
		this.jobId = jobId;
	}

	public String getReportUrl()
	{
		return reportUrl;
	}

	public void setReportUrl(String reportUrl)
	{
		this.reportUrl = reportUrl;
	}

	public Status getStatus()
	{
		return status;
	}

	public void setStatus(Status status)
	{
		this.status = status;
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

	public String getResultUrl()
	{
		return resultUrl;
	}

	public void setResultUrl(String resultUrl)
	{
		this.resultUrl = resultUrl;
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

	public List<JobResult> getJobResults()
	{
		return jobResults;
	}

	public void setJobResults(List<JobResult> jobResults)
	{
		this.jobResults = jobResults;
	}

	public void addJobResult(JobResult jobResult)
	{
		if (jobResults == null)
		{
			jobResults = new ArrayList<JobResult>();
		}
		jobResults.add(jobResult);
	}

	public String getReportName()
	{
		return reportName;
	}

	public void setReportName(String reportName)
	{
		this.reportName = reportName;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getReportId()
	{
		return reportId;
	}

	public void setReportId(String reportId)
	{
		this.reportId = reportId;
	}

	public boolean isShared()
	{
		return shared;
	}

	public void setShared(boolean shared)
	{
		this.shared = shared;
	}

	public boolean isOwned()
	{
		return owned;
	}

	public void setOwned(boolean owned)
	{
		this.owned = owned;
	}

	public boolean isPromoted()
	{
		return promoted;
	}

	public void setPromoted(boolean promoted)
	{
		this.promoted = promoted;
	}

	public class MCStatus
	{
		// define JOB status
		public static final String REQUEST_CANCEL = "http://www.ibm.com/rational/rpe/mc:request_cancel";//$NON-NLS-1$
		public static final String CANCELLED = "http://www.ibm.com/rational/rpe/mc:cancelled";//$NON-NLS-1$
		public static final String RUNNING = "http://www.ibm.com/rational/rpe/mc:running";//$NON-NLS-1$
		public static final String FINISHED = "http://www.ibm.com/rational/rpe/mc:finished";//$NON-NLS-1$
		public static final String LIVE = "http://www.ibm.com/rational/rpe/mc:live";//$NON-NLS-1$;
		public static final String FAILED = "http://www.ibm.com/rational/rpe/mc:failed";//$NON-NLS-1$
		public static final String QUEUED = "http://www.ibm.com/rational/rpe/mc:queued";//$NON-NLS-1$

		public static final String REQUEST_PAUSE = "http://www.ibm.com/rational/rpe/mc:request_pause";//$NON-NLS-1$;
		public static final String REQUEST_RESUME = "http://www.ibm.com/rational/rpe/mc:request_resume";//$NON-NLS-1$;
		public static final String PAUSED = "http://www.ibm.com/rational/rpe/mc:paused";//$NON-NLS-1$;
	}
}
