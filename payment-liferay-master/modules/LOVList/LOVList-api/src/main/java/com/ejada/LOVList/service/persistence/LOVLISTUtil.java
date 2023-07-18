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

package com.ejada.LOVList.service.persistence;

import com.ejada.LOVList.model.LOVLIST;

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

/**
 * The persistence utility for the lovlist service. This utility wraps <code>com.ejada.LOVList.service.persistence.impl.LOVLISTPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LOVLISTPersistence
 * @generated
 */
public class LOVLISTUtil {

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
	public static void clearCache(LOVLIST lovlist) {
		getPersistence().clearCache(lovlist);
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
	public static Map<Serializable, LOVLIST> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LOVLIST> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LOVLIST> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LOVLIST> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<LOVLIST> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LOVLIST update(LOVLIST lovlist) {
		return getPersistence().update(lovlist);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LOVLIST update(
		LOVLIST lovlist, ServiceContext serviceContext) {

		return getPersistence().update(lovlist, serviceContext);
	}

	/**
	 * Caches the lovlist in the entity cache if it is enabled.
	 *
	 * @param lovlist the lovlist
	 */
	public static void cacheResult(LOVLIST lovlist) {
		getPersistence().cacheResult(lovlist);
	}

	/**
	 * Caches the lovlists in the entity cache if it is enabled.
	 *
	 * @param lovlists the lovlists
	 */
	public static void cacheResult(List<LOVLIST> lovlists) {
		getPersistence().cacheResult(lovlists);
	}

	/**
	 * Creates a new lovlist with the primary key. Does not add the lovlist to the database.
	 *
	 * @param Id the primary key for the new lovlist
	 * @return the new lovlist
	 */
	public static LOVLIST create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	 * Removes the lovlist with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the lovlist
	 * @return the lovlist that was removed
	 * @throws NoSuchLISTException if a lovlist with the primary key could not be found
	 */
	public static LOVLIST remove(long Id)
		throws com.ejada.LOVList.exception.NoSuchLISTException {

		return getPersistence().remove(Id);
	}

	public static LOVLIST updateImpl(LOVLIST lovlist) {
		return getPersistence().updateImpl(lovlist);
	}

	/**
	 * Returns the lovlist with the primary key or throws a <code>NoSuchLISTException</code> if it could not be found.
	 *
	 * @param Id the primary key of the lovlist
	 * @return the lovlist
	 * @throws NoSuchLISTException if a lovlist with the primary key could not be found
	 */
	public static LOVLIST findByPrimaryKey(long Id)
		throws com.ejada.LOVList.exception.NoSuchLISTException {

		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	 * Returns the lovlist with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the lovlist
	 * @return the lovlist, or <code>null</code> if a lovlist with the primary key could not be found
	 */
	public static LOVLIST fetchByPrimaryKey(long Id) {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	/**
	 * Returns all the lovlists.
	 *
	 * @return the lovlists
	 */
	public static List<LOVLIST> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the lovlists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LOVLISTModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of lovlists
	 * @param end the upper bound of the range of lovlists (not inclusive)
	 * @return the range of lovlists
	 */
	public static List<LOVLIST> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the lovlists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LOVLISTModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of lovlists
	 * @param end the upper bound of the range of lovlists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of lovlists
	 */
	public static List<LOVLIST> findAll(
		int start, int end, OrderByComparator<LOVLIST> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the lovlists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LOVLISTModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of lovlists
	 * @param end the upper bound of the range of lovlists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of lovlists
	 */
	public static List<LOVLIST> findAll(
		int start, int end, OrderByComparator<LOVLIST> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the lovlists from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of lovlists.
	 *
	 * @return the number of lovlists
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static LOVLISTPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LOVLISTPersistence, LOVLISTPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(LOVLISTPersistence.class);

		ServiceTracker<LOVLISTPersistence, LOVLISTPersistence> serviceTracker =
			new ServiceTracker<LOVLISTPersistence, LOVLISTPersistence>(
				bundle.getBundleContext(), LOVLISTPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}