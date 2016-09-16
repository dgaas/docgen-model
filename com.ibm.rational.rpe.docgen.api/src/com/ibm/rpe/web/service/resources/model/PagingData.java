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

/**
 * @author Kumaraswamy Gowda
 * 
 *         - This would be a generic pagination support
 * 
 */
@JsonInclude(Include.NON_EMPTY)
public class PagingData
{
	@JsonProperty("paging")
	private Pagination pagination = null;

	@JsonProperty(RPEVocabulary.RPE_RS_DATA)
	private List<?> data = null;

	public PagingData()
	{
	}

	public PagingData(List<?> data)
	{
		this.data = data;
	}

	public PagingData(List<?> data, Pagination pagination)
	{
		this.data = data;
		this.pagination = pagination;
	}

	public Pagination getPagination()
	{
		return pagination;
	}

	public void setPagination(Pagination pagination)
	{
		this.pagination = pagination;
	}

	public List<?> getData()
	{
		return data;
	}

	public void setData(List<?> data)
	{
		this.data = data;
	}
}
