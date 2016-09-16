/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © Copyright IBM Corporation 2014, 2015. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.rpe.web.service.resources.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Kumaraswamy Gowda
 * 
 *         - Class for pagination properties
 * 
 */
@JsonInclude(Include.NON_EMPTY)
public class Pagination
{
	@JsonProperty("firstpage")
	private String firstPage = null;

	@JsonProperty("prevpage")
	private String prevPage = null;

	@JsonProperty("nextpage")
	private String nextPage = null;

	@JsonProperty("lastpage")
	private String lastPage = null;

	@JsonProperty("total")
	private String totalCount = null;

	@JsonProperty("offset")
	private String offset = null;

	@JsonProperty("limit")
	private String limit = null;

	public String getTotalCount()
	{
		return totalCount;
	}

	public void setTotalCount(String totalCount)
	{
		this.totalCount = totalCount;
	}

	public String getNextPage()
	{
		return nextPage;
	}

	public void setNextPage(String nextPage)
	{
		this.nextPage = nextPage;
	}

	public String getPrevPage()
	{
		return prevPage;
	}

	public void setPrevPage(String prevPage)
	{
		this.prevPage = prevPage;
	}

	public String getOffset()
	{
		return offset;
	}

	public void setOffset(String offset)
	{
		this.offset = offset;
	}

	public String getLimit()
	{
		return limit;
	}

	public void setLimit(String limit)
	{
		this.limit = limit;
	}

	public String getFirstPage()
	{
		return firstPage;
	}

	public void setFirstPage(String firstPage)
	{
		this.firstPage = firstPage;
	}

	public String getLastPage()
	{
		return lastPage;
	}

	public void setLastPage(String lastPage)
	{
		this.lastPage = lastPage;
	}

}
