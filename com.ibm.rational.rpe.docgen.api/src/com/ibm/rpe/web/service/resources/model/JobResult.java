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
public class JobResult
{
	public enum ResultType
	{
		DOCUMENT_WORD, DOCUMENT_PDF, DOCUMENT_HTML, DOCUMENT_XSLFO, LOG, DOCUMENTS_ALL, RESULT_URL
	};

	@JsonProperty("id")
	private String id;

	@JsonProperty("resulturl")
	private String resulturl;

	@JsonProperty("modifiedon")
	private Date modifiedOn;

	@JsonProperty("type")
	private String type;

	@JsonProperty("jobid")
	private String jobid;

	@JsonProperty("filename")
	private String filename;

	@JsonProperty("filesize")
	private long fileSize;

	public String getJobid()
	{
		return jobid;
	}

	public void setJobid(String jobid)
	{
		this.jobid = jobid;
	}

	public String getResulturl()
	{
		return resulturl;
	}

	public void setResulturl(String resulturl)
	{
		this.resulturl = resulturl;
	}

	public Date getModifiedOn()
	{
		return RPEDateUtils.copyDate(modifiedOn);
	}

	public void setModifiedOn(Date modifiedOn)
	{
		this.modifiedOn = RPEDateUtils.copyDate(modifiedOn);
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getFilename()
	{
		return filename;
	}

	public void setFilename(String filename)
	{
		this.filename = filename;
	}

	public long getFileSize()
	{
		return fileSize;
	}

	public void setFileSize(long fileSize)
	{
		this.fileSize = fileSize;
	}
	
	public static String resultTypeName( JobResult.ResultType type) 
	{
		if (type == JobResult.ResultType.DOCUMENT_PDF)
		{
			return "PDF"; //$NON-NLS-1$
		}
		else if (type == JobResult.ResultType.DOCUMENT_WORD)
		{
			return "Word"; //$NON-NLS-1$
		}
		else if (type == JobResult.ResultType.DOCUMENT_HTML)
		{
			return "HTML"; //$NON-NLS-1$
		}
		else if (type == JobResult.ResultType.DOCUMENT_XSLFO)
		{
			return "Xsl-Fo"; //$NON-NLS-1$
		}
		else if (type == JobResult.ResultType.LOG)
		{
			return "Log"; //$NON-NLS-1$
		}
		
		return ""; //$NON-NLS-1$
	}
}
