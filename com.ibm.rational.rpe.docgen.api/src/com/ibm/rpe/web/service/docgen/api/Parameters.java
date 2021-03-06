/*******************************************************************************
 * Licensed Materials - Property of IBM
 * � � Copyright IBM Corporation 2014, 2016. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.rpe.web.service.docgen.api;

@SuppressWarnings("nls")
public abstract class Parameters
{
	public interface Form
	{
		public static final String REPORT = "report";
		public static final String TYPE = "type";
		public static final String PREVIEW_LIMIT = "previewLimit";
		public static final String JOBID = "jobid";
		public static final String TEMPLATE_DATA = "templateData";
		public static final String NEW_OUTPUT = "newOutput";
		
		public static final String JOB_SERVICE = "jobService";
		public static final String JOB_SERVICE_TYPE = "jobServiceType";
		public static final String JOB_SERVICE_USER = "jobServiceUser";
		public static final String JOB_SERVICE_PASSWORD = "jobServicePassword";
		
		public static final String FILE_SERVICE = "fileService";
		public static final String FILE_SERVICE_TYPE = "fileServiceType";
		public static final String FILE_SERVICE_USER = "fileServiceUser";
		public static final String FILE_SERVICE_PASSWORD = "fileServicePassword";
		
		public static final String DOCPACK = "docpack";
		
		public static final String J_USERNAME = "j_username";
		public static final String J_PASSWORD = "j_password";
		
		// template service
		public static final String TEMPLATE = "template";
		public static final String COMMAND_JSON = "commandJson";
		public static final String SCHEMA = "schema";
		public static final String TEMPLATE_URL = "templateurl";
		
		// Utility
		public static final String FILE = "file";
	}
	
	public interface Header
	{
		public static final String SECRET = "secret";
		public static final String AUTH_TYPE = "auth-type";
		public static final String AUTH_COOKIES = "auth-cookies";
		public static final String COOKIE = "Cookie";
	}
	
	public interface QueryParam
	{
		public static final String URL = "url";
		public static final String FILENAME = "filename";
	}
	
	public interface BluemixHeader
	{
		public static final String INSTANCEID = "instanceid";
		public static final String REGION = "region";
	}
	
	public interface Path
	{
		public static final String SEGMENT_REPORT = "report";
		public static final String SEGMENT_CHANGE = "change";
		public static final String SEGMENT_TEMPLATE = "template";
		public static final String SEGMENT_DOCGEN = "docgen";
		public static final String SEGMENT_REFERENCE = "reference";
	}
	
	public interface Constants
	{
		public static final String STORAGE_TYPE_COUCHDB = "couchdb"; 
		public static final String STORAGE_TYPE_GIT = "git";
		public static final String STORAGE_TYPE_INTERNAL = "internal";
		public static final String J_SECURITY_CHECK = "j_security_check";
		public static final String MEDIA_TYPE_FORM_URL_ENCODED = "application/x-www-form-urlencoded";
		public static final String JSESSIONID = "JSESSIONID"; //$NON-NLS-1$
	}
}
