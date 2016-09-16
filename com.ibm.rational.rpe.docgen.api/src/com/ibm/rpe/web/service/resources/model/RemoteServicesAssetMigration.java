/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © Copyright IBM Corporation 2016. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.rpe.web.service.resources.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class RemoteServicesAssetMigration
{
	private String id;

	private String migrationId;

	private Date migrationDate;

	private String remoteServicesAssetUrl;

	private String assetOwner;

	private String type;

	private String title;

	private String status;

	private String migratedBy;

	public String getMigrationId()
	{
		return migrationId;
	}

	public void setMigrationId(String migrationId)
	{
		this.migrationId = migrationId;
	}

	public Date getMigrationDate()
	{
		return migrationDate;
	}

	public void setMigrationDate(Date migrationDate)
	{
		this.migrationDate = migrationDate;
	}

	public String getRemoteServicesAssetUrl()
	{
		return remoteServicesAssetUrl;
	}

	public void setRemoteServicesAssetUrl(String remoteServicesAssetUrl)
	{
		this.remoteServicesAssetUrl = remoteServicesAssetUrl;
	}

	public String getAssetOwner()
	{
		return assetOwner;
	}

	public void setAssetOwner(String assetOwner)
	{
		this.assetOwner = assetOwner;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getMigratedBy()
	{
		return migratedBy;
	}

	public void setMigratedBy(String migratedBy)
	{
		this.migratedBy = migratedBy;
	}

	public String getId()
	{
		return this.id;
	}

	public void setId(String id)
	{
		this.id = id;
	}
}
