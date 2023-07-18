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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LOVLIST}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LOVLIST
 * @generated
 */
public class LOVLISTWrapper
	extends BaseModelWrapper<LOVLIST>
	implements LOVLIST, ModelWrapper<LOVLIST> {

	public LOVLISTWrapper(LOVLIST lovlist) {
		super(lovlist);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("EnName", getEnName());
		attributes.put("ArName", getArName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String EnName = (String)attributes.get("EnName");

		if (EnName != null) {
			setEnName(EnName);
		}

		String ArName = (String)attributes.get("ArName");

		if (ArName != null) {
			setArName(ArName);
		}
	}

	/**
	 * Returns the ar name of this lovlist.
	 *
	 * @return the ar name of this lovlist
	 */
	@Override
	public String getArName() {
		return model.getArName();
	}

	/**
	 * Returns the en name of this lovlist.
	 *
	 * @return the en name of this lovlist
	 */
	@Override
	public String getEnName() {
		return model.getEnName();
	}

	/**
	 * Returns the ID of this lovlist.
	 *
	 * @return the ID of this lovlist
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the primary key of this lovlist.
	 *
	 * @return the primary key of this lovlist
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the ar name of this lovlist.
	 *
	 * @param ArName the ar name of this lovlist
	 */
	@Override
	public void setArName(String ArName) {
		model.setArName(ArName);
	}

	/**
	 * Sets the en name of this lovlist.
	 *
	 * @param EnName the en name of this lovlist
	 */
	@Override
	public void setEnName(String EnName) {
		model.setEnName(EnName);
	}

	/**
	 * Sets the ID of this lovlist.
	 *
	 * @param Id the ID of this lovlist
	 */
	@Override
	public void setId(long Id) {
		model.setId(Id);
	}

	/**
	 * Sets the primary key of this lovlist.
	 *
	 * @param primaryKey the primary key of this lovlist
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected LOVLISTWrapper wrap(LOVLIST lovlist) {
		return new LOVLISTWrapper(lovlist);
	}

}