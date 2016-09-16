/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © Copyright IBM Corporation 2014, 2016. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.rpe.web.service.resources.api;

import java.util.Arrays;
import java.util.List;

/**
 * @author Kumaraswamy Gowda
 * 
 *         Vocabularies for RPE services
 * 
 */
public class RPEVocabulary
{

	public static final String RPE_RS_TITLE = "title"; //$NON-NLS-1$
	public static final String RPE_RS_TYPE = "type"; //$NON-NLS-1$
	public static final String RPE_RS_DESCRIPTION = "description"; //$NON-NLS-1$
	public static final String RPE_RS_CREATED_ON = "createdon"; //$NON-NLS-1$
	public static final String RPE_RS_CREATED_BY = "createdby"; //$NON-NLS-1$
	public static final String RPE_RS_FILENAME = "filename"; //$NON-NLS-1$
	public static final String RPE_RS_MODIFIED_BY = "modifiedby"; //$NON-NLS-1$
	public static final String RPE_RS_MODIFIED_ON = "modifiedon"; //$NON-NLS-1$
	public static final String RPE_RS_CREATED_AFTER = "createdafter"; //$NON-NLS-1$
	public static final String RPE_RS_CREATED_BEFORE = "createdbefore"; //$NON-NLS-1$
	public static final String RPE_RS_MODIFIED_AFTER = "modifiedafter"; //$NON-NLS-1$
	public static final String RPE_RS_MODIFIED_BEFORE = "modifiedbefore"; //$NON-NLS-1$
	public static final String RPE_RS_TAGS = "tags"; //$NON-NLS-1$
	public static final String RPE_RS_IS_PROMOTED = "ispromoted"; //$NON-NLS-1$
	public static final String RPE_RS_JOB_ID = "jobid"; //$NON-NLS-1$
	public static final String RPE_RS_SHARE = "share"; //$NON-NLS-1$
	public static final String RPE_RS_PROMOTE = "promote"; //$NON-NLS-1$
	public static final String RPE_RS_ORDER_BY = "orderby"; //$NON-NLS-1$
	public static final String RPE_RS_GROUP_BY = "groupby"; //$NON-NLS-1$
	public static final String RPE_RS_LIMIT = "limit"; //$NON-NLS-1$
	public static final String RPE_RS_OFFSET = "offset"; //$NON-NLS-1$
	public static final String RPE_RS_FIELDS = "fields"; //$NON-NLS-1$
	public static final String RPE_RS_INCLUDE_DRAFT = "includeDraft"; //$NON-NLS-1$
	public static final String RPE_RS_MARK_COMPLETE = "markcomplete"; //$NON-NLS-1$
	public static final String RPE_RS_STATUS = "status"; //$NON-NLS-1$
	public static final String RPE_RS_MESSAGE = "message"; //$NON-NLS-1$
	public static final String RPE_RS_FREQUENCY = "frequency"; //$NON-NLS-1$
	public static final String RPE_RS_SCHEDULED_DATE = "scheduledDate"; //$NON-NLS-1$
	public static final String RPE_RS_START_DATE = "startdate"; //$NON-NLS-1$
	public static final String RPE_RS_END_DATE = "enddate"; //$NON-NLS-1$
	public static final String RPE_RS_DAYS_OF_WEEK = "daysofweek"; //$NON-NLS-1$
	public static final String RPE_RS_EVENT_ID = "eventid"; //$NON-NLS-1$
	public static final String RPE_RS_REPORT_URL = "reporturl"; //$NON-NLS-1$
	public static final String RPE_RS_RESULT_URL = "resulturl"; //$NON-NLS-1$
	public static final String RPE_RS_ACTION = "action";//$NON-NLS-1$
	public static final String RPE_RS_DOWNLOAD = "download";//$NON-NLS-1$
	public static final String RPE_RS_CATEGORY = "category";//$NON-NLS-1$
	public static final String RPE_RS_ASSETID = "assetid";//$NON-NLS-1$
	public static final String RPE_RS_REFERENCEID = "referenceid";//$NON-NLS-1$
	public static final String RPE_RS_SCHEDULE_ID = "scheduleid";//$NON-NLS-1$
	public static final String RPE_RS_REPORTID = "reportid";//$NON-NLS-1$
	public static final String RPE_RS_FILE = "file";//$NON-NLS-1$
	public static final String RPE_RS_CONNECTION_ID = "connectionid"; //$NON-NLS-1$
	public static final String RPE_RS_RESULT_TYPE = "resulttype"; //$NON-NLS-1$
	public static final String RPE_RS_URL = "url"; //$NON-NLS-1$
	public static final String RPE_RS_DATA = "data"; //$NON-NLS-1$
	public static final String RPE_RS_JOB_RESULT = "jobresult"; //$NON-NLS-1$
	public static final String RPE_RS_REPORT = "report"; //$NON-NLS-1$
	public static final String RPE_RS_PIPE = "|"; //$NON-NLS-1$
	public static final String RPE_RS_AUTH_METHOD = "authmethod"; //$NON-NLS-1$
	public static final String RPE_RS_LONG_RUNNING = "longrunningThreshold"; //$NON-NLS-1$
	public static final String FILE_SERVICE_URL = "FILE_SERVICE_URL"; //$NON-NLS-1$
	public static final String JOB_SERVICE_URL = "JOB_SERVICE_URL"; //$NON-NLS-1$
	public static final String SCHEDULING_THREAD_INTERVAL = "SCHEDULING_THREAD_INTERVAL"; //$NON-NLS-1$
	public static final String GROUP_BY_TAGS = "tags"; //$NON-NLS-1$
	public static final String GROUP_BY_NAME = "name"; //$NON-NLS-1$
	public static final String RPE_RS_GROUP_LIST = "grouplist"; //$NON-NLS-1$
	public static final String TAGS_EXACT_MATCH = "TAGS_EXACT_MATCH"; //$NON-NLS-1$
	public static final String TITLE_EXACT_MATCH = "TITLE_EXACT_MATCH"; //$NON-NLS-1$
	public static final String PREVIOUS_FILE_NAME = "previousFileName"; //$NON-NLS-1$

	public static final String RPE_RS_CRON_EXPRESSION = "cronexpression"; //$NON-NLS-1$
	public static final String RPE_RS_TEMPLATES = "templates";//$NON-NLS-1$
	public static final String RPE_RS_TEMPLATE = "template";//$NON-NLS-1$
	public static final String RPE_RS_TEMPLATE_URLS = "templateurls";//$NON-NLS-1$
	public static final String RPE_RS_OUTPUTS = "outputs";//$NON-NLS-1$
	public static final String RPE_RS_STYLESHEETS = "stylesheets";//$NON-NLS-1$
	public static final String RPE_RS_STYLESHEET = "stylesheet";//$NON-NLS-1$
	public static final String RPE_RS_SNIPPETS = "snippets";//$NON-NLS-1$
	public static final String RPE_RS_SNIPPET = "snippet";//$NON-NLS-1$
	public static final String RPE_RS_FILES = "files";//$NON-NLS-1$
	public static final String RPE_RS_SCRIPTS = "scripts";//$NON-NLS-1$
	public static final String RPE_RS_SCRIPT = "script";//$NON-NLS-1$
	public static final String RPE_RS_REQUEST_URL = "requesturl"; //$NON-NLS-1$
	public static final String RPE_RS_CONNECTION_DATA = "connectiondata"; //$NON-NLS-1$
	public static final String RPE_RS_VARIABLE_DATA = "variabledata"; //$NON-NLS-1$
	public static final String RPE_RS_PREVIEW_LIMIT = "previewlimit"; //$NON-NLS-1$
	public static final String RPE_RS_REMOTE_USER = "remoteuser"; //$NON-NLS-1$
	public static final String RPE_RS_DEFAULT_MAPPING = "defaultMapping"; //$NON-NLS-1$
	public static final String RPE_RS_SHARED = "shared"; //$NON-NLS-1$
	public static final String RPE_RS_PROMOTED = "promoted"; //$NON-NLS-1$
	
	public static final String RPE_RS_DOORS_DATA = "doorsdata"; //$NON-NLS-1$
	public static final String RPE_RS_BASELINE = "baseline"; //$NON-NLS-1$
	public static final String RPE_RS_DOORS_VIEW = "doorsview"; //$NON-NLS-1$
	public static final String RPE_RS_CONFIGURATION = "configuration"; //$NON-NLS-1$
	public static final String RPE_RS_USERNAME = "username"; //$NON-NLS-1$
	public static final String RPE_RS_PASSWORD = "password"; //$NON-NLS-1$
	public static final String RPE_RS_COOKIES = "cookies"; //$NON-NLS-1$
	public static final String RPE_RS_ACCEPT_HEADER = "accept_header"; //$NON-NLS-1$
	public static final String RPE_RS_EXTRA_HEADERS = "extra_headers"; //$NON-NLS-1$
	public static final String RPE_RS_ADHOC = "adhoc"; //$NON-NLS-1$

	public static final String DGAAS_NEW_TEMPLATE = "newTemplate"; //$NON-NLS-1$
	public static final String DGAAS_NEW_OUTPUT = "newOutput"; //$NON-NLS-1$
	public static final String DGAAS_REPORT = "report"; //$NON-NLS-1$
	public static final String DGAAS_TYPE = "type"; //$NON-NLS-1$s
	public static final String DGAAS_JOBID = "jobid"; //$NON-NLS-1$
	public static final String DGAAS_JOB_SERVICE = "jobService"; //$NON-NLS-1$
	public static final String DGAAS_FILE_SERVICE = "fileService"; //$NON-NLS-1$
	public static final String DGAAS_DATA = "data"; //$NON-NLS-1$
	public static final String DGAAS_STATUS = "status"; //$NON-NLS-1$
	public static final String DGAAS_LAST_MODIFIED = "last-modified"; //$NON-NLS-1$
	public static final String DGAAS_PREVIEW_LIMIT = "previewLimit"; //$NON-NLS-1$
	public static final String PROPERTY_URI = "URI"; //$NON-NLS-1$
	public static final String PROPERTY_TYPE = "type"; //$NON-NLS-1$
	public static final String FREQUENCY_ONE_TIME = "One Time"; //$NON-NLS-1$
	public static final String FREQUENCY_DAILY = "Daily"; //$NON-NLS-1$
	public static final String FREQUENCY_WEEKLY = "Weekly"; //$NON-NLS-1$
	public static final String FREQUENCY_MONTHLY = "Monthly"; //$NON-NLS-1$
	public static final String FREQUENCY_YEARLY = "Yearly"; //$NON-NLS-1$
	private static final List<String> DAYSOFWEEK_LIST = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$

	private static final List<String> FREQUENCIES_LIT = Arrays.asList(FREQUENCY_ONE_TIME, FREQUENCY_DAILY, FREQUENCY_WEEKLY, FREQUENCY_MONTHLY, FREQUENCY_YEARLY);

	public static boolean isAllowedDayOfWeek(String dayOfWeek)
	{
		return DAYSOFWEEK_LIST.contains(dayOfWeek);
	}

	public static boolean isAllowedFrequency(String frequency)
	{
		return FREQUENCIES_LIT.contains(frequency);
	}

	public static final String RPE_RS_ID = "id"; //$NON-NLS-1$
	public static final String RPE_RS_NEXT_RUN = "nextrun"; //$NON-NLS-1$
	public static final String RPE_RS_REPORT_NAME = "reportname"; //$NON-NLS-1$
	public static final String RPE_RS_REPORT_ID = "reportid"; //$NON-NLS-1$

	public static final String RPE_RS_NOTI_ID = "notificationid"; //$NON-NLS-1$

	// For runtime variables
	public static final String RPE_RS_PARAMETER = "parameter"; //$NON-NLS-1$
	public static final String RPE_RS_VALUE = "value"; //$NON-NLS-1$

}
