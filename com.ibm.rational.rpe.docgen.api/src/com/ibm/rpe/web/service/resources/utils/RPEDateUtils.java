/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © Copyright IBM Corporation 2014, 2016. All Rights Reserved.
 *
 * Note to U.S. Government Users Restricted Rights:  
 * Use, duplication or disclosure restricted by GSA ADP Schedule 
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.rpe.web.service.resources.utils;

import java.util.Date;

public class RPEDateUtils
{
	public static Date getCurrentDateTime()
	{
		return new Date();
	}
	
	public static Date copyDate(Date date)
	{
		if (date != null)
		{
			return new Date(date.getTime());
		}
		
		return date;
	}
}
