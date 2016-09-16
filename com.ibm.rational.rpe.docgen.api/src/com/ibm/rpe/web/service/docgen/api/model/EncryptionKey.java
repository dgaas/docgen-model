/*******************************************************************************
 * Licensed Materials - Property of IBM
 * (c) Copyright IBM Corporation 2015. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.rpe.web.service.docgen.api.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public final class EncryptionKey
{
	private String key = null;

	public String getKey()
	{
		return key;
	}

	public void setKey(String key)
	{
		this.key = key;
	}

	public EncryptionKey()
	{
	}
	
	public EncryptionKey(String key)
	{
		this.key = key;
	}
}