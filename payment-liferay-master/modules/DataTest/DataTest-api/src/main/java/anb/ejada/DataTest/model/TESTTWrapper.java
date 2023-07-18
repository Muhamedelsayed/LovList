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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TESTT}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TESTT
 * @generated
 */
public class TESTTWrapper
	extends BaseModelWrapper<TESTT> implements ModelWrapper<TESTT>, TESTT {

	public TESTTWrapper(TESTT testt) {
		super(testt);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("TestId", getTestId());
		attributes.put("Data", getData());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long TestId = (Long)attributes.get("TestId");

		if (TestId != null) {
			setTestId(TestId);
		}

		String Data = (String)attributes.get("Data");

		if (Data != null) {
			setData(Data);
		}
	}

	/**
	 * Returns the data of this testt.
	 *
	 * @return the data of this testt
	 */
	@Override
	public String getData() {
		return model.getData();
	}

	/**
	 * Returns the primary key of this testt.
	 *
	 * @return the primary key of this testt
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the test ID of this testt.
	 *
	 * @return the test ID of this testt
	 */
	@Override
	public long getTestId() {
		return model.getTestId();
	}

	/**
	 * Returns the uuid of this testt.
	 *
	 * @return the uuid of this testt
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the data of this testt.
	 *
	 * @param Data the data of this testt
	 */
	@Override
	public void setData(String Data) {
		model.setData(Data);
	}

	/**
	 * Sets the primary key of this testt.
	 *
	 * @param primaryKey the primary key of this testt
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the test ID of this testt.
	 *
	 * @param TestId the test ID of this testt
	 */
	@Override
	public void setTestId(long TestId) {
		model.setTestId(TestId);
	}

	/**
	 * Sets the uuid of this testt.
	 *
	 * @param uuid the uuid of this testt
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected TESTTWrapper wrap(TESTT testt) {
		return new TESTTWrapper(testt);
	}

}