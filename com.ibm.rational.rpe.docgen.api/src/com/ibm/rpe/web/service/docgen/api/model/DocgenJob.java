/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © Copyright IBM Corporation 2014, 2015. All Rights Reserved.
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

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DocgenJob extends ReportEntity
{
	public static final String LAST_UPDATE = "last-update"; //$NON-NLS-1$

	public static final String STATUS_QUEUED = "queued"; //$NON-NLS-1$
	public static final String STATUS_RUNNING = "running"; //$NON-NLS-1$
	public static final String STATUS_FINISHED = "finished"; //$NON-NLS-1$
	
	private String href = null;
	
	private String status = null;
	
	private String instanceid = null;
	private String region = null;
	
	private final List<String> events = new ArrayList<String>( 100);
	private final List<ReportResult> results = new ArrayList<ReportResult>( 5);
	
	public static class ReportResult
	{
		private String type = ""; //$NON-NLS-1$
		private String name = ""; //$NON-NLS-1$
		private String uri = ""; //$NON-NLS-1$
		private String href = ""; //$NON-NLS-1$
		
		public ReportResult()
		{
			// needed by JAXB
		}
		
		public ReportResult( String type, String name, String uri)
		{
			this.setType(type);
			this.setURI(uri);
			this.setName(name);
		}

		@XmlElement( name="type")
		public String getType()
		{
			return type;
		}

		public void setType(String type)
		{
			this.type = type;
		}

		@XmlElement( name="uri")
		public String getURI()
		{
			return uri;
		}

		public void setURI(String uri)
		{
			this.uri = uri;
		}

		@XmlElement( name="name")
		public String getName()
		{
			return name;
		}

		public void setName(String name)
		{
			this.name = name;
		}

		public String getHref()
		{
			return href;
		}

		public void setHref(String href)
		{
			this.href = href;
		}
	}

	public synchronized void addEvent(String event)
	{
		events.add( event);
	}
	
	@XmlElement(name="events")
	public List<String> getEvents()
	{
		return this.events;
	}
	
	public synchronized void addResult( String type, String name, String resultURI)
	{
		results.add( new ReportResult(type, name, resultURI));
	}
	
	@XmlElement(name="results")
	public List<ReportResult> getResults()
	{
		return this.results;
	}
	
	@SuppressWarnings("nls")
	@Override
	public void prettyPrint( Writer out) throws IOException
	{
		super.prettyPrint( out);
	
		out.write("Events\n");
		for ( String event: events)
		{
			out.write( event);
			out.write( "\n");
		}
	}

	public String getStatus()
	{
		return this.status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public synchronized void clearEvents()
	{
		this.events.clear();
	}

	public String getHref()
	{
		return href;
	}

	public void setHref(String href)
	{
		this.href = href;
	}

	public String getInstanceid()
	{
		return instanceid;
	}

	public void setInstanceid(String instanceid)
	{
		this.instanceid = instanceid;
	}

	public String getRegion()
	{
		return region;
	}

	public void setRegion(String region)
	{
		this.region = region;
	}
}
