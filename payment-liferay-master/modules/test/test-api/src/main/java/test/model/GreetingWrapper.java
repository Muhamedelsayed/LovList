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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Greeting}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Greeting
 * @generated
 */
public class GreetingWrapper
	extends BaseModelWrapper<Greeting>
	implements Greeting, ModelWrapper<Greeting> {

	public GreetingWrapper(Greeting greeting) {
		super(greeting);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("greetingId", getGreetingId());
		attributes.put("greeting", getGreeting());
		attributes.put("welcome", getWelcome());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long greetingId = (Long)attributes.get("greetingId");

		if (greetingId != null) {
			setGreetingId(greetingId);
		}

		String greeting = (String)attributes.get("greeting");

		if (greeting != null) {
			setGreeting(greeting);
		}

		String welcome = (String)attributes.get("welcome");

		if (welcome != null) {
			setWelcome(welcome);
		}
	}

	/**
	 * Returns the greeting of this greeting.
	 *
	 * @return the greeting of this greeting
	 */
	@Override
	public String getGreeting() {
		return model.getGreeting();
	}

	/**
	 * Returns the greeting ID of this greeting.
	 *
	 * @return the greeting ID of this greeting
	 */
	@Override
	public long getGreetingId() {
		return model.getGreetingId();
	}

	/**
	 * Returns the primary key of this greeting.
	 *
	 * @return the primary key of this greeting
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this greeting.
	 *
	 * @return the uuid of this greeting
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the welcome of this greeting.
	 *
	 * @return the welcome of this greeting
	 */
	@Override
	public String getWelcome() {
		return model.getWelcome();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the greeting of this greeting.
	 *
	 * @param greeting the greeting of this greeting
	 */
	@Override
	public void setGreeting(String greeting) {
		model.setGreeting(greeting);
	}

	/**
	 * Sets the greeting ID of this greeting.
	 *
	 * @param greetingId the greeting ID of this greeting
	 */
	@Override
	public void setGreetingId(long greetingId) {
		model.setGreetingId(greetingId);
	}

	/**
	 * Sets the primary key of this greeting.
	 *
	 * @param primaryKey the primary key of this greeting
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this greeting.
	 *
	 * @param uuid the uuid of this greeting
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the welcome of this greeting.
	 *
	 * @param welcome the welcome of this greeting
	 */
	@Override
	public void setWelcome(String welcome) {
		model.setWelcome(welcome);
	}

	@Override
	protected GreetingWrapper wrap(Greeting greeting) {
		return new GreetingWrapper(greeting);
	}

}