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

package test.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

import test.model.Greeting;

/**
 * The persistence utility for the greeting service. This utility wraps <code>test.service.persistence.impl.GreetingPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GreetingPersistence
 * @generated
 */
public class GreetingUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Greeting greeting) {
		getPersistence().clearCache(greeting);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Greeting> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Greeting> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Greeting> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Greeting> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Greeting> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Greeting update(Greeting greeting) {
		return getPersistence().update(greeting);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Greeting update(
		Greeting greeting, ServiceContext serviceContext) {

		return getPersistence().update(greeting, serviceContext);
	}

	/**
	 * Returns all the greetings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching greetings
	 */
	public static List<Greeting> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the greetings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GreetingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of greetings
	 * @param end the upper bound of the range of greetings (not inclusive)
	 * @return the range of matching greetings
	 */
	public static List<Greeting> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the greetings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GreetingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of greetings
	 * @param end the upper bound of the range of greetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching greetings
	 */
	public static List<Greeting> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Greeting> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the greetings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GreetingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of greetings
	 * @param end the upper bound of the range of greetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching greetings
	 */
	public static List<Greeting> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Greeting> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first greeting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching greeting
	 * @throws NoSuchGreetingException if a matching greeting could not be found
	 */
	public static Greeting findByUuid_First(
			String uuid, OrderByComparator<Greeting> orderByComparator)
		throws test.exception.NoSuchGreetingException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first greeting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching greeting, or <code>null</code> if a matching greeting could not be found
	 */
	public static Greeting fetchByUuid_First(
		String uuid, OrderByComparator<Greeting> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last greeting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching greeting
	 * @throws NoSuchGreetingException if a matching greeting could not be found
	 */
	public static Greeting findByUuid_Last(
			String uuid, OrderByComparator<Greeting> orderByComparator)
		throws test.exception.NoSuchGreetingException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last greeting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching greeting, or <code>null</code> if a matching greeting could not be found
	 */
	public static Greeting fetchByUuid_Last(
		String uuid, OrderByComparator<Greeting> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the greetings before and after the current greeting in the ordered set where uuid = &#63;.
	 *
	 * @param greetingId the primary key of the current greeting
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next greeting
	 * @throws NoSuchGreetingException if a greeting with the primary key could not be found
	 */
	public static Greeting[] findByUuid_PrevAndNext(
			long greetingId, String uuid,
			OrderByComparator<Greeting> orderByComparator)
		throws test.exception.NoSuchGreetingException {

		return getPersistence().findByUuid_PrevAndNext(
			greetingId, uuid, orderByComparator);
	}

	/**
	 * Removes all the greetings where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of greetings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching greetings
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the greeting in the entity cache if it is enabled.
	 *
	 * @param greeting the greeting
	 */
	public static void cacheResult(Greeting greeting) {
		getPersistence().cacheResult(greeting);
	}

	/**
	 * Caches the greetings in the entity cache if it is enabled.
	 *
	 * @param greetings the greetings
	 */
	public static void cacheResult(List<Greeting> greetings) {
		getPersistence().cacheResult(greetings);
	}

	/**
	 * Creates a new greeting with the primary key. Does not add the greeting to the database.
	 *
	 * @param greetingId the primary key for the new greeting
	 * @return the new greeting
	 */
	public static Greeting create(long greetingId) {
		return getPersistence().create(greetingId);
	}

	/**
	 * Removes the greeting with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param greetingId the primary key of the greeting
	 * @return the greeting that was removed
	 * @throws NoSuchGreetingException if a greeting with the primary key could not be found
	 */
	public static Greeting remove(long greetingId)
		throws test.exception.NoSuchGreetingException {

		return getPersistence().remove(greetingId);
	}

	public static Greeting updateImpl(Greeting greeting) {
		return getPersistence().updateImpl(greeting);
	}

	/**
	 * Returns the greeting with the primary key or throws a <code>NoSuchGreetingException</code> if it could not be found.
	 *
	 * @param greetingId the primary key of the greeting
	 * @return the greeting
	 * @throws NoSuchGreetingException if a greeting with the primary key could not be found
	 */
	public static Greeting findByPrimaryKey(long greetingId)
		throws test.exception.NoSuchGreetingException {

		return getPersistence().findByPrimaryKey(greetingId);
	}

	/**
	 * Returns the greeting with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param greetingId the primary key of the greeting
	 * @return the greeting, or <code>null</code> if a greeting with the primary key could not be found
	 */
	public static Greeting fetchByPrimaryKey(long greetingId) {
		return getPersistence().fetchByPrimaryKey(greetingId);
	}

	/**
	 * Returns all the greetings.
	 *
	 * @return the greetings
	 */
	public static List<Greeting> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the greetings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GreetingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of greetings
	 * @param end the upper bound of the range of greetings (not inclusive)
	 * @return the range of greetings
	 */
	public static List<Greeting> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the greetings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GreetingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of greetings
	 * @param end the upper bound of the range of greetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of greetings
	 */
	public static List<Greeting> findAll(
		int start, int end, OrderByComparator<Greeting> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the greetings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GreetingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of greetings
	 * @param end the upper bound of the range of greetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of greetings
	 */
	public static List<Greeting> findAll(
		int start, int end, OrderByComparator<Greeting> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the greetings from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of greetings.
	 *
	 * @return the number of greetings
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static GreetingPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<GreetingPersistence, GreetingPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(GreetingPersistence.class);

		ServiceTracker<GreetingPersistence, GreetingPersistence>
			serviceTracker =
				new ServiceTracker<GreetingPersistence, GreetingPersistence>(
					bundle.getBundleContext(), GreetingPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}