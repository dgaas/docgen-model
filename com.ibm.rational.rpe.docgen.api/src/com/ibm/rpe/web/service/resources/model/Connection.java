/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © Copyright IBM Corporation 2014, 2016. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.rpe.web.service.resources.model;

import java.beans.Transient;
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
public class Connection
{
	@JsonInclude(Include.ALWAYS)
	@JsonProperty("id")
	private String id;

	@JsonInclude(Include.ALWAYS)
	@JsonProperty("connectiondetailid")
	private String connectionDetailId;

	@JsonProperty("title")
	private String title;

	@JsonProperty("description")
	private String description;

	// One who created the connection (title, url, etc)
	@JsonProperty("createdby")
	private String createdBy;

	// Once who owns the connection credentials
	@JsonProperty("owner")
	private String owner;

	@JsonProperty("url")
	private String url;

	@JsonProperty("connectionurl")
	private String connectionUrl;

	/*
	 * The configuration format used is <label (URI)> Use the
	 * getConfigurationURI method to extract only the URI value
	 */
	@JsonProperty("configuration")
	private String configuration;

	@JsonProperty("username")
	private String username;

	@JsonProperty("password")
	private String password;

	@JsonProperty("authmethod")
	private String authMethod;

	@JsonProperty("cookies")
	private String cookies;

	@JsonProperty("modifiedon")
	private Date modifiedOn;

	@JsonProperty("tags")
	private List<String> tags;

	@JsonProperty("doorsview")
	private String doorsView;

	@JsonProperty("baseline")
	private String baseline;

	@JsonProperty("doorsdata")
	private String doorsData;

	@JsonProperty("accept_header")
	private String acceptHeader;

	@JsonProperty("extra_headers")
	private String extraHeaders;

	@JsonProperty("adhoc")
	private boolean adhoc = false;

	public boolean isAdhoc()
	{
		return adhoc;
	}

	public void setAdhoc(boolean adhoc)
	{
		this.adhoc = adhoc;
	}

	public String getAcceptHeader()
	{
		return acceptHeader;
	}

	public void setAcceptHeader(String acceptHeader)
	{
		this.acceptHeader = acceptHeader;
	}

	public String getExtraHeaders()
	{
		return extraHeaders;
	}

	public void setExtraHeaders(String extraHeaders)
	{
		this.extraHeaders = extraHeaders;
	}

	public void addTag(String tag)
	{
		if (tags == null)
		{
			tags = new ArrayList<String>();
		}

		tags.add(tag);
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

	public String getTitle()
	{
		return title;
	}

	public String getConfiguration()
	{
		return configuration;
	}

	public void setConfiguration(String configuration)
	{
		this.configuration = configuration;
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

	public String getCreatedBy()
	{
		return createdBy;
	}

	public void setCreatedBy(String createdBy)
	{
		this.createdBy = createdBy;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getAuthMethod()
	{
		return authMethod;
	}

	public void setAuthMethod(String authMethod)
	{
		this.authMethod = authMethod;
	}

	public String getCookies()
	{
		return cookies;
	}

	public void setCookies(String cookies)
	{
		this.cookies = cookies;
	}

	public Date getModifiedOn()
	{
		return RPEDateUtils.copyDate(modifiedOn);
	}

	public void setModifiedOn(Date modifiedOn)
	{
		this.modifiedOn = RPEDateUtils.copyDate(modifiedOn);
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getConnectionDetailId()
	{
		return connectionDetailId;
	}

	public void setConnectionDetailId(String connectionDetailId)
	{
		this.connectionDetailId = connectionDetailId;
	}

	public String getOwner()
	{
		return owner;
	}

	public void setOwner(String owner)
	{
		this.owner = owner;
	}

	@Transient
	@JsonIgnore
	public String getConfigurationURI()
	{
		if (configuration == null)
		{
			return ""; //$NON-NLS-1$
		}

		int pos = configuration.lastIndexOf(" ("); //$NON-NLS-1$
		if (pos >= 0)
		{
			return configuration.substring(pos + 2, configuration.length() - 1);
		}

		return configuration;
	}

	public String getDoorsView()
	{
		return doorsView;
	}

	public void setDoorsView(String doorsView)
	{
		this.doorsView = doorsView;
	}

	public String getBaseline()
	{
		return baseline;
	}

	public void setBaseline(String baseline)
	{
		this.baseline = baseline;
	}

	public String getDoorsData()
	{
		return doorsData;
	}

	public void setDoorsData(String doorsData)
	{
		this.doorsData = doorsData;
	}

	public String getConnectionUrl()
	{
		return connectionUrl;
	}

	public void setConnectionUrl(String connectionUrl)
	{
		this.connectionUrl = connectionUrl;
	}
}
