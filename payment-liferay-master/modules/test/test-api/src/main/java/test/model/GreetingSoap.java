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

package test.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link test.service.http.GreetingServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class GreetingSoap implements Serializable {

	public static GreetingSoap toSoapModel(Greeting model) {
		GreetingSoap soapModel = new GreetingSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setGreetingId(model.getGreetingId());
		soapModel.setGreeting(model.getGreeting());
		soapModel.setWelcome(model.getWelcome());

		return soapModel;
	}

	public static GreetingSoap[] toSoapModels(Greeting[] models) {
		GreetingSoap[] soapModels = new GreetingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static GreetingSoap[][] toSoapModels(Greeting[][] models) {
		GreetingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new GreetingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new GreetingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static GreetingSoap[] toSoapModels(List<Greeting> models) {
		List<GreetingSoap> soapModels = new ArrayList<GreetingSoap>(
			models.size());

		for (Greeting model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new GreetingSoap[soapModels.size()]);
	}

	public GreetingSoap() {
	}

	public long getPrimaryKey() {
		return _greetingId;
	}

	public void setPrimaryKey(long pk) {
		setGreetingId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getGreetingId() {
		return _greetingId;
	}

	public void setGreetingId(long greetingId) {
		_greetingId = greetingId;
	}

	public String getGreeting() {
		return _greeting;
	}

	public void setGreeting(String greeting) {
		_greeting = greeting;
	}

	public String getWelcome() {
		return _welcome;
	}

	public void setWelcome(String welcome) {
		_welcome = welcome;
	}

	private String _uuid;
	private long _greetingId;
	private String _greeting;
	private String _welcome;

}