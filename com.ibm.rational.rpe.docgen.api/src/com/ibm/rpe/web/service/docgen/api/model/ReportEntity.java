/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © (c) Copyright IBM Corporation 2014, 2015. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.rpe.web.service.docgen.api.model;

import java.io.IOException;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class ReportEntity
{
	private String id = null;

	private String name = null;
	private String type = null;
	private String description = null;

	@XmlElementWrapper(name = "properties")
	protected Map<String, String> properties = new LinkedHashMap<String, String>();

	public ReportEntity()
	{
	}

	public void removeProperty(String id)
	{
		properties.remove(id);
	}

	public void setProperty(String id, String value)
	{
		properties.put(id, value);
	}

	public String getProperty(String id)
	{
		return properties.get(id);
	}

	@XmlTransient
	public Map<String, String> getProperties()
	{
		return this.properties;
	}

	@XmlElement(name = "id")
	public String getID()
	{
		return this.id;
	}

	public void setID(String value)
	{
		this.id = value;
	}

	@SuppressWarnings("nls")
	public void prettyPrint(Writer out) throws IOException
	{
		out.write("Name - " + getName() + "\n");
		out.write("Type - " + getType() + "\n");
		out.write("Description - " + getDescription() + "\n");
		out.write("ID - " + getID() + "\n");

		out.write("Properties\n");
		for (Entry<String, String> entry : properties.entrySet())
		{
			out.write("\t" + entry.getKey() + " - " + entry.getValue() + "\n");
		}
	}

	@XmlElement(name = "name")
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@XmlElement(name = "type")
	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	@XmlElement(name = "description")
	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

}
