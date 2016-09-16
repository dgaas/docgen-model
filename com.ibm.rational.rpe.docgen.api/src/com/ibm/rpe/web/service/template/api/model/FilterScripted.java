/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © Copyright IBM Corporation 2015. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.rpe.web.service.template.api.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_EMPTY)
public class FilterScripted
{
	@JsonProperty("name")
	private String code;

	@JsonProperty("inXHTML")
	private boolean inXHTML;

	@JsonProperty("outXHTML")
	private boolean outXHTML;

	@JsonProperty("expressions")
	private List<FilterScriptedExpression> expressions = null;

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public boolean isInXHTML()
	{
		return inXHTML;
	}

	public void setInXHTML(boolean inXHTML)
	{
		this.inXHTML = inXHTML;
	}

	public boolean isOutXHTML()
	{
		return outXHTML;
	}

	public void setOutXHTML(boolean outXHTML)
	{
		this.outXHTML = outXHTML;
	}

	public List<FilterScriptedExpression> getExpressions()
	{
		return expressions;
	}

	public void setExpressions(List<FilterScriptedExpression> expressions)
	{
		this.expressions = expressions;
	}

	public void addExpression(FilterScriptedExpression expression)
	{
		if (this.expressions == null)
		{
			expressions = new ArrayList<FilterScriptedExpression>();
		}

		expressions.add(expression);
	}

}
