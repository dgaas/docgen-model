/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © Copyright IBM Corporation 2016. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.rpe.web.service.resources.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "samples")
@XmlAccessorType(XmlAccessType.FIELD)
public class Samples
{
	// XmlElement sets the name of the entities
	@XmlElement(name = "sample-report")
	private List<SampleReport> samples;

	public List<SampleReport> getSamples()
	{
		return samples;
	}

	public void setSamples(List<SampleReport> samples)
	{
		this.samples = samples;
	}

	public static class SampleArtifact
	{
		protected String title;
		protected String description;
		protected String tags;
		protected String location;
		protected String filename;

		public String getFilename()
		{
			return filename;
		}

		public void setFilename(String filename)
		{
			this.filename = filename;
		}

		public String getTitle()
		{
			return title;
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

		public String getLocation()
		{
			return location;
		}

		public void setLocation(String location)
		{
			this.location = location;
		}

		public String getTags()
		{
			return tags;
		}

		public void setTags(String tags)
		{
			this.tags = tags;
		}
	}

	@XmlRootElement(name = "sample-template")
	@XmlAccessorType(XmlAccessType.FIELD)
	public static class SampleTemplate extends SampleArtifact
	{
		public SampleTemplate(String title, String description, String filename)
		{
			this.title = title;
			this.description = description;
			this.filename = filename;
		}

		public SampleTemplate()
		{

		}

		Resource.ResourceType type = Resource.ResourceType.template;

		@XmlElement(name = "sample-connection")
		private List<SampleConnection> sampleConnList;

		public List<SampleConnection> getSampleConnList()
		{
			return sampleConnList;
		}

		public void setSampleConnList(List<SampleConnection> sampleConnList)
		{
			this.sampleConnList = sampleConnList;
		}
	}

	@XmlRootElement(name = "sample-connection")
	@XmlAccessorType(XmlAccessType.FIELD)
	public static class SampleConnection extends SampleArtifact
	{
		public SampleConnection(String title, String description, String filename)
		{
			this.title = title;
			this.description = description;
			this.filename = filename;
		}

		public SampleConnection()
		{
		}

		private String url;
		private String authType;
		private String dsmapping;

		public String getUrl()
		{
			return url;
		}

		public void setUrl(String url)
		{
			this.url = url;
		}

		public String getAuthType()
		{
			return authType;
		}

		public void setAuthType(String authType)
		{
			this.authType = authType;
		}

		public String getDsmapping()
		{
			return dsmapping;
		}

		public void setDsmapping(String dsmapping)
		{
			this.dsmapping = dsmapping;
		}

	}

	@XmlRootElement(name = "sample-report")
	@XmlAccessorType(XmlAccessType.FIELD)
	public static class SampleReport extends SampleArtifact
	{
		public SampleReport(String title, String description, String filename)
		{
			this.title = title;
			this.description = description;
			this.filename = filename;
		}

		public SampleReport()
		{
		}

		Resource.ResourceType type = Resource.ResourceType.report;

		@XmlElement(name = "sample-template")
		private List<SampleTemplate> sampleTemplates;

		@XmlElement(name = "sample-stylesheet")
		private List<SampleStylesheet> sampleStylesheets;

		public List<SampleTemplate> getSampleTemplates()
		{
			return sampleTemplates;
		}

		public void setSampleTemplates(List<SampleTemplate> sampleTemplates)
		{
			this.sampleTemplates = sampleTemplates;
		}

		public List<SampleStylesheet> getSampleStylesheets()
		{
			if (sampleStylesheets == null)
			{
				sampleStylesheets = new ArrayList<SampleStylesheet>(0);
			}

			return sampleStylesheets;
		}

		public void setSampleStylesheets(List<SampleStylesheet> sampleStylesheets)
		{
			this.sampleStylesheets = sampleStylesheets;
		}
	}

	@XmlRootElement(name = "sample-stylesheet")
	@XmlAccessorType(XmlAccessType.FIELD)
	public static class SampleStylesheet extends SampleArtifact
	{
		public SampleStylesheet(String title, String description, String filename)
		{
			this.title = title;
			this.description = description;
			this.filename = filename;
		}

		public SampleStylesheet()
		{
		}

		Resource.ResourceType type = Resource.ResourceType.stylesheet;
	}

	@XmlRootElement(name = "sample-script")
	@XmlAccessorType(XmlAccessType.FIELD)
	public static class SampleJavaScript extends SampleArtifact
	{
		public SampleJavaScript(String title, String description, String filename)
		{
			this.title = title;
			this.description = description;
			this.filename = filename;
		}

		public SampleJavaScript()
		{
		}

		Resource.ResourceType type = Resource.ResourceType.script;
	}
}
