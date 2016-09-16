/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © Copyright IBM Corporation 2014, 2015. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.rpe.web.service.resources.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReportMapping
{
	@JsonProperty("reportid")
	private String reportId;

	@JsonProperty("connections")
	private Map<String, Connection> datasourceConnections;

	@JsonProperty("variables")
	private Map<String, String> variables;

	@JsonProperty("createdby")
	private String createdBy;

	public String getReportId()
	{
		return reportId;
	}

	public void setReportId(String reportId)
	{
		this.reportId = reportId;
	}

	public void addDatasourceConnection(String datasourceId, Connection connection)
	{
		if (datasourceConnections == null)
		{
			datasourceConnections = new HashMap<String, Connection>();
		}
		datasourceConnections.put(datasourceId, connection);
	}

	public Connection getDatasourceConnection(String datasourceId)
	{
		if (datasourceConnections != null)
		{
			return datasourceConnections.get(datasourceId);
		}
		return null;
	}

	public Map<String, Connection> getDatasourceConnections()
	{
		return datasourceConnections;
	}

	public void setdDtasourceConnections(Map<String, Connection> datasourceConnections)
	{
		this.datasourceConnections = datasourceConnections;
	}

	public String getCreatedBy()
	{
		return createdBy;
	}

	public void setCreatedBy(String createdBy)
	{
		this.createdBy = createdBy;
	}

	public Map<String, String> getVariables()
	{
		return variables;
	}

	public void setVariables(Map<String, String> variables)
	{
		this.variables = variables;
	}

	public void addVariable(String reportId, String value)
	{
		if (variables == null)
		{
			variables = new HashMap<String, String>();
		}
		variables.put(reportId, value);
	}
}
