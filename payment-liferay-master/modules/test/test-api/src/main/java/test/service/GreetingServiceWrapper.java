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

package test.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link GreetingService}.
 *
 * @author Brian Wing Shun Chan
 * @see GreetingService
 * @generated
 */
public class GreetingServiceWrapper
	implements GreetingService, ServiceWrapper<GreetingService> {

	public GreetingServiceWrapper(GreetingService greetingService) {
		_greetingService = greetingService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _greetingService.getOSGiServiceIdentifier();
	}

	@Override
	public GreetingService getWrappedService() {
		return _greetingService;
	}

	@Override
	public void setWrappedService(GreetingService greetingService) {
		_greetingService = greetingService;
	}

	private GreetingService _greetingService;

}