/*******************************************************************************
 * Licensed Materials - Property of IBM
 * (c) Copyright IBM Corporation 2014. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.rpe.web.service.resources.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.rpe.web.service.resources.api.RPEVocabulary;

@JsonInclude(Include.NON_EMPTY)
public class GroupedData
{
	@JsonProperty("groupname")
	private String groupName = null;

	@JsonProperty(RPEVocabulary.RPE_RS_DATA)
	private List<?> data = null;

	public GroupedData()
	{
	}

	public GroupedData(List<?> data)
	{
		this.data = data;
	}

	public GroupedData(List<?> data, String groupName)
	{
		this.data = data;
		this.groupName = groupName;
	}

	public List<?> getData()
	{
		return data;
	}

	public void setData(List<?> data)
	{
		this.data = data;
	}

	public String getGroupName()
	{
		return groupName;
	}

	public void setGroupName(String groupName)
	{
		this.groupName = groupName;
	}
}
