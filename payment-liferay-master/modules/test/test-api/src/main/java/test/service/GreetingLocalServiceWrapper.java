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
 * Provides a wrapper for {@link GreetingLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see GreetingLocalService
 * @generated
 */
public class GreetingLocalServiceWrapper
	implements GreetingLocalService, ServiceWrapper<GreetingLocalService> {

	public GreetingLocalServiceWrapper(
		GreetingLocalService greetingLocalService) {

		_greetingLocalService = greetingLocalService;
	}

	/**
	 * Adds the greeting to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GreetingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param greeting the greeting
	 * @return the greeting that was added
	 */
	@Override
	public test.model.Greeting addGreeting(test.model.Greeting greeting) {
		return _greetingLocalService.addGreeting(greeting);
	}

	/**
	 * Creates a new greeting with the primary key. Does not add the greeting to the database.
	 *
	 * @param greetingId the primary key for the new greeting
	 * @return the new greeting
	 */
	@Override
	public test.model.Greeting createGreeting(long greetingId) {
		return _greetingLocalService.createGreeting(greetingId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _greetingLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the greeting from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GreetingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param greeting the greeting
	 * @return the greeting that was removed
	 */
	@Override
	public test.model.Greeting deleteGreeting(test.model.Greeting greeting) {
		return _greetingLocalService.deleteGreeting(greeting);
	}

	/**
	 * Deletes the greeting with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GreetingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param greetingId the primary key of the greeting
	 * @return the greeting that was removed
	 * @throws PortalException if a greeting with the primary key could not be found
	 */
	@Override
	public test.model.Greeting deleteGreeting(long greetingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _greetingLocalService.deleteGreeting(greetingId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _greetingLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _greetingLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _greetingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>test.model.impl.GreetingModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _greetingLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>test.model.impl.GreetingModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _greetingLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _greetingLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _greetingLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public test.model.Greeting fetchGreeting(long greetingId) {
		return _greetingLocalService.fetchGreeting(greetingId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _greetingLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the greeting with the primary key.
	 *
	 * @param greetingId the primary key of the greeting
	 * @return the greeting
	 * @throws PortalException if a greeting with the primary key could not be found
	 */
	@Override
	public test.model.Greeting getGreeting(long greetingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _greetingLocalService.getGreeting(greetingId);
	}

	/**
	 * Returns a range of all the greetings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>test.model.impl.GreetingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of greetings
	 * @param end the upper bound of the range of greetings (not inclusive)
	 * @return the range of greetings
	 */
	@Override
	public java.util.List<test.model.Greeting> getGreetings(
		int start, int end) {

		return _greetingLocalService.getGreetings(start, end);
	}

	/**
	 * Returns the number of greetings.
	 *
	 * @return the number of greetings
	 */
	@Override
	public int getGreetingsCount() {
		return _greetingLocalService.getGreetingsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _greetingLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _greetingLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _greetingLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the greeting in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GreetingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param greeting the greeting
	 * @return the greeting that was updated
	 */
	@Override
	public test.model.Greeting updateGreeting(test.model.Greeting greeting) {
		return _greetingLocalService.updateGreeting(greeting);
	}

	@Override
	public GreetingLocalService getWrappedService() {
		return _greetingLocalService;
	}

	@Override
	public void setWrappedService(GreetingLocalService greetingLocalService) {
		_greetingLocalService = greetingLocalService;
	}

	private GreetingLocalService _greetingLocalService;

}