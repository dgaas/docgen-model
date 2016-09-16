/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © Copyright IBM Corporation 2014, 2015. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.rpe.web.service.resources.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.rpe.web.common.utils.FileUtils;
import com.ibm.rpe.web.service.resources.utils.RPEDateUtils;

@JsonInclude(Include.NON_EMPTY)
public class Result
{
	@JsonProperty("id")
	private String id;

	@JsonProperty("modifiedon")
	private Date lastModifiedOn;

	@JsonIgnore
	private byte[] file = null;

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public Date getLastModifiedOn()
	{
		return RPEDateUtils.copyDate(lastModifiedOn);
	}

	public void setLastModifiedOn(Date lastModifiedOn)
	{
		this.lastModifiedOn = RPEDateUtils.copyDate(lastModifiedOn);
	}

	public InputStream toStream()
	{
		return FileUtils.getInputStreamFromByteArray(this.file);
	}

	public void fromStream(InputStream is) throws IOException
	{
		this.file = FileUtils.getByteArrayFromStream(is);
	}

	public byte[] getFile()
	{
		return file.clone();
	}

	public void setFile(byte[] file)
	{
		this.file = file.clone();
	}
}
