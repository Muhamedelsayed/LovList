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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Greeting service. Represents a row in the &quot;localizationTest_Greeting&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>test.model.impl.GreetingModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>test.model.impl.GreetingImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Greeting
 * @generated
 */
@ProviderType
public interface GreetingModel extends BaseModel<Greeting> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a greeting model instance should use the {@link Greeting} interface instead.
	 */

	/**
	 * Returns the primary key of this greeting.
	 *
	 * @return the primary key of this greeting
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this greeting.
	 *
	 * @param primaryKey the primary key of this greeting
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this greeting.
	 *
	 * @return the uuid of this greeting
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this greeting.
	 *
	 * @param uuid the uuid of this greeting
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the greeting ID of this greeting.
	 *
	 * @return the greeting ID of this greeting
	 */
	public long getGreetingId();

	/**
	 * Sets the greeting ID of this greeting.
	 *
	 * @param greetingId the greeting ID of this greeting
	 */
	public void setGreetingId(long greetingId);

	/**
	 * Returns the greeting of this greeting.
	 *
	 * @return the greeting of this greeting
	 */
	@AutoEscape
	public String getGreeting();

	/**
	 * Sets the greeting of this greeting.
	 *
	 * @param greeting the greeting of this greeting
	 */
	public void setGreeting(String greeting);

	/**
	 * Returns the welcome of this greeting.
	 *
	 * @return the welcome of this greeting
	 */
	@AutoEscape
	public String getWelcome();

	/**
	 * Sets the welcome of this greeting.
	 *
	 * @param welcome the welcome of this greeting
	 */
	public void setWelcome(String welcome);

}