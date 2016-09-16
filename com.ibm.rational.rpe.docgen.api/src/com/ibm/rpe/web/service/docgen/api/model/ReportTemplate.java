/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © Copyright IBM Corporation 2014, 2016. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © Copyright IBM Corporation 2014. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.rpe.web.service.docgen.api.model;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "template")
public class ReportTemplate extends ReportEntity
{
	@XmlRootElement(name = "datasource")
	public static class ReportDataSource extends ReportEntity
	{
		public ReportDataSource()
		{
			setID(UUID.randomUUID().toString());
		}

		@SuppressWarnings("nls")
		@Override
		public void prettyPrint(Writer out) throws IOException
		{
			out.write("Data Source\n");

			super.prettyPrint(out);
		}
	}

	@XmlRootElement(name = "variable")
	public static class ReportVariable extends ReportEntity
	{
		private String defaultValue;

		public ReportVariable()
		{
			setID(UUID.randomUUID().toString());
		}

		@SuppressWarnings("nls")
		@Override
		public void prettyPrint(Writer out) throws IOException
		{
			out.write("Variable\n");

			super.prettyPrint(out);
		}

		public String getDefaultValue()
		{
			return defaultValue;
		}

		public void setDefaultValue(String defaultValue)
		{
			this.defaultValue = defaultValue;
		}
	}

	private List<ReportDataSource> dataSources = new ArrayList<ReportDataSource>();
	private List<ReportVariable> variables = new ArrayList<ReportVariable>();

	private String uri = null;

	public ReportTemplate()
	{
		setID(UUID.randomUUID().toString());
	}

	@XmlElementWrapper(name = "datasources")
	@XmlElementRef
	public List<ReportDataSource> getDataSources()
	{
		return dataSources;
	}

	public void setDataSources(List<ReportDataSource> dataSources)
	{
		this.dataSources = dataSources;
	}

	public void addDataSource(ReportDataSource ds)
	{
		this.dataSources.add(ds);
	}

	public void removeDataSource(ReportDataSource ds)
	{
		this.dataSources.remove(ds);
	}

	@XmlElementWrapper(name = "variables")
	@XmlElementRef
	public List<ReportVariable> getVariables()
	{
		return this.variables;
	}

	public void setVariables(List<ReportVariable> variables)
	{
		this.variables = variables;
	}

	public void addVariable(ReportVariable variable)
	{
		this.variables.add(variable);
	}

	public void removeVariable(ReportVariable variable)
	{
		this.variables.remove(variable);
	}

	@SuppressWarnings("nls")
	@Override
	public void prettyPrint(Writer out) throws IOException
	{
		out.write("Template\n");

		super.prettyPrint(out);

		out.write("URI: " + getUri() + "\n");

		for (ReportDataSource reportDS : dataSources)
		{
			reportDS.prettyPrint(out);
		}

		for (ReportVariable variable : variables)
		{
			variable.prettyPrint(out);
		}
	}

	@XmlElement(name = "uri")
	public String getUri()
	{
		return uri;
	}

	public void setUri(String uri)
	{
		this.uri = uri;
	}
}
