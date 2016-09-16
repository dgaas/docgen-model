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
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.rpe.web.service.resources.api.RPEVocabulary;

@JsonInclude(Include.NON_EMPTY)
public class GroupArray
{

	@JsonProperty(RPEVocabulary.RPE_RS_GROUP_LIST)
	private List<GroupedData> groupList = new ArrayList<GroupedData>();

	public GroupArray()
	{
	}

	public GroupArray(List<GroupedData> groupList)
	{
		this.groupList = groupList;
	}

	public List<?> getGrouplist()
	{
		return groupList;
	}

	public void setGrouplist(List<GroupedData> groupList)
	{
		this.groupList = groupList;
	}
	
	public void addGroupdata(GroupedData groupdata)
	{
		groupList.add(groupdata);
	}


	
}
