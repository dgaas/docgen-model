/*******************************************************************************
 * Licensed Materials - Property of IBM
 * (c) Copyright IBM Corporation 2014, 2015. All Rights Reserved.
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
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Report extends ReportEntity
{
	private String createdOn = new Date().toString();

	@XmlElementWrapper
	@XmlElementRef
	private final List<ReportTemplate> templates = new ArrayList<ReportTemplate>();

	@XmlElementWrapper
	@XmlElementRef
	private final List<ReportOutput> outputs = new ArrayList<ReportOutput>();

	public Report()
	{
	}

	public List<ReportTemplate> getTemplates()
	{
		return templates;
	}

	public void addTemplate(ReportTemplate template)
	{
		this.templates.add(template);
	}

	public List<ReportOutput> getOutputs()
	{
		return outputs;
	}

	public void addOutput( ReportOutput output)
	{
		this.outputs.add(output);
	}

	@SuppressWarnings("nls")
	@Override
	public void prettyPrint( Writer out) throws IOException
	{
		super.prettyPrint( out);
		
		out.write("Created on: " + getCreatedOn() + "\n");
	
		out.write("Templates\n");
		for ( ReportTemplate template : templates)
		{
			template.prettyPrint( out);
		}
		
		out.write("Outputs\n");
		for ( ReportOutput output : outputs)
		{
			output.prettyPrint( out);
		}
	}

	@XmlElement( name="created-on")
	public String getCreatedOn()
	{
		return createdOn;
	}

	public void setCreatedOn(String createdOn)
	{
		this.createdOn = createdOn;
	}
}
