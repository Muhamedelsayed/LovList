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

package anb.ejada.DataTest.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link anb.ejada.DataTest.service.http.TESTTServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class TESTTSoap implements Serializable {

	public static TESTTSoap toSoapModel(TESTT model) {
		TESTTSoap soapModel = new TESTTSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setTestId(model.getTestId());
		soapModel.setData(model.getData());

		return soapModel;
	}

	public static TESTTSoap[] toSoapModels(TESTT[] models) {
		TESTTSoap[] soapModels = new TESTTSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TESTTSoap[][] toSoapModels(TESTT[][] models) {
		TESTTSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TESTTSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TESTTSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TESTTSoap[] toSoapModels(List<TESTT> models) {
		List<TESTTSoap> soapModels = new ArrayList<TESTTSoap>(models.size());

		for (TESTT model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TESTTSoap[soapModels.size()]);
	}

	public TESTTSoap() {
	}

	public long getPrimaryKey() {
		return _TestId;
	}

	public void setPrimaryKey(long pk) {
		setTestId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getTestId() {
		return _TestId;
	}

	public void setTestId(long TestId) {
		_TestId = TestId;
	}

	public String getData() {
		return _Data;
	}

	public void setData(String Data) {
		_Data = Data;
	}

	private String _uuid;
	private long _TestId;
	private String _Data;

}