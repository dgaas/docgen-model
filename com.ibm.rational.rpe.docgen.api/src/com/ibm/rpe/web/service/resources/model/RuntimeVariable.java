/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © Copyright IBM Corporation 2015. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.rpe.web.service.resources.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RuntimeVariable implements Comparable<RuntimeVariable>
{
	public enum TYPE
	{
		TEXT, PASSWORD, SELECT, CHECKBOX
	}

	public RuntimeVariable(String parameter, String value)
	{
		super();
		this.parameter = parameter;
		this.value = value;
	}

	public RuntimeVariable()
	{
	}

	@JsonProperty("parameter")
	private String parameter;

	@JsonProperty("value")
	private String value;

	@JsonProperty("type")
	private TYPE type;

	@JsonProperty("unit")
	private String unit;

	@JsonProperty("options")
	private List<String> options;
	
	@JsonProperty("description")
	private String description;

	public String getParameter()
	{
		return parameter;
	}

	public void setParameter(String parameter)
	{
		this.parameter = parameter;
	}

	public String getValue()
	{
		return value;
	}

	public void setValue(String value)
	{
		this.value = value;
	}

	@Override
	public int compareTo(RuntimeVariable o)
	{
		return this.parameter.compareTo(o.parameter);
	}

	public TYPE getType()
	{
		return type;
	}

	public void setType(TYPE type)
	{
		this.type = type;
	}

	public String getUnit()
	{
		return unit;
	}

	public void setUnit(String unit)
	{
		this.unit = unit;
	}

	public List<String> getOptions()
	{
		return options;
	}

	public void setOptions(List<String> options)
	{
		this.options = options;
	}
	
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description=description;
	}
}
