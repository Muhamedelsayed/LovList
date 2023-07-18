/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.ejada.LOVList.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.ejada.LOVList.service.http.LOVLISTServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class LOVLISTSoap implements Serializable {

	public static LOVLISTSoap toSoapModel(LOVLIST model) {
		LOVLISTSoap soapModel = new LOVLISTSoap();

		soapModel.setId(model.getId());
		soapModel.setEnName(model.getEnName());
		soapModel.setArName(model.getArName());

		return soapModel;
	}

	public static LOVLISTSoap[] toSoapModels(LOVLIST[] models) {
		LOVLISTSoap[] soapModels = new LOVLISTSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LOVLISTSoap[][] toSoapModels(LOVLIST[][] models) {
		LOVLISTSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LOVLISTSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LOVLISTSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LOVLISTSoap[] toSoapModels(List<LOVLIST> models) {
		List<LOVLISTSoap> soapModels = new ArrayList<LOVLISTSoap>(
			models.size());

		for (LOVLIST model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LOVLISTSoap[soapModels.size()]);
	}

	public LOVLISTSoap() {
	}

	public long getPrimaryKey() {
		return _Id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _Id;
	}

	public void setId(long Id) {
		_Id = Id;
	}

	public String getEnName() {
		return _EnName;
	}

	public void setEnName(String EnName) {
		_EnName = EnName;
	}

	public String getArName() {
		return _ArName;
	}

	public void setArName(String ArName) {
		_ArName = ArName;
	}

	private long _Id;
	private String _EnName;
	private String _ArName;

}