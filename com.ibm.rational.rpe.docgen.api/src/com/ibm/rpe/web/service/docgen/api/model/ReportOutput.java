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
import java.util.UUID;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="output")
public class ReportOutput extends ReportEntity
{
	public static final String RESULT_TYPE_LOG = "log"; //$NON-NLS-1$
	
	public ReportOutput()
	{
		setID( UUID.randomUUID().toString());
	}
	
	@SuppressWarnings("nls")
	@Override
	public void prettyPrint(Writer out) throws IOException
	{
		out.write( "Output\n");
		super.prettyPrint( out);
	}
}
