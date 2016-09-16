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
public class Resource
{
	public enum ResourceType
	{
		template, report, stylesheet, script, snippet, docspec
	}

	public enum RESOURCE_STATUS
	{
		ACTIVE, DELETED, DRAFT
	}
	
	@JsonIgnore
	public static final String ASSET_CLASSIFICATION_OOTB = "ootb"; //$NON-NLS-1$

	@JsonProperty("id")
	protected String id;

	@JsonProperty("createdby")
	protected String createdBy;

	@JsonProperty("modifiedby")
	protected String modifiedBy;

	@JsonProperty("createdon")
	protected Date createdOn;

	@JsonProperty("modifiedon")
	protected Date modifiedOn;

	@JsonProperty("description")
	protected String description;

	@JsonProperty("title")
	protected String title;

	@JsonProperty("categories")
	protected List<String> categories;

	protected ResourceType type;

	@JsonProperty("assetclassification")
	protected String assetClassification;

	@JsonProperty("tags")
	@JsonInclude(Include.ALWAYS)
	protected List<String> tags;

	@JsonProperty("dependencies")
	@JsonInclude(Include.ALWAYS)
	protected List<String> dependencies;

	@JsonProperty("url")
	protected String url;

	@JsonInclude(Include.ALWAYS)
	@JsonProperty("filename")
	protected String fileName;

	@JsonProperty("value")
	protected Object value;

	@JsonProperty("status")
	protected String status = RESOURCE_STATUS.ACTIVE.toString();

	public Object getValue()
	{
		return value;
	}

	public void setValue(Object value)
	{
		this.value = value;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
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

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public List<String> getCategories()
	{
		return categories;
	}

	public void setCategories(List<String> categories)
	{
		this.categories = categories;
	}

	public ResourceType getType()
	{
		return type;
	}

	public void setType(ResourceType type)
	{
		this.type = type;
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

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getFileName()
	{
		return fileName;
	}

	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}

	public void addCategory(String category)
	{
		if (this.categories == null)
		{
			this.categories = new ArrayList<String>();
		}

		this.categories.add(category);
	}

	public void addTag(String tag)
	{
		if (this.tags == null)
		{
			this.tags = new ArrayList<String>();
		}

		this.tags.add(tag);
	}

	public List<String> getDependencies()
	{
		return dependencies;
	}

	public void setDependencies(List<String> dependencies)
	{
		this.dependencies = dependencies;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getAssetClassification()
	{
		return assetClassification;
	}

	public void setAssetClassification(String assetClassification)
	{
		this.assetClassification = assetClassification;
	}
}
