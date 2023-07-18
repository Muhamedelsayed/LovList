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

package anb.ejada.DataTest.service.persistence;

import anb.ejada.DataTest.model.TESTT;

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
 * The persistence utility for the testt service. This utility wraps <code>anb.ejada.DataTest.service.persistence.impl.TESTTPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TESTTPersistence
 * @generated
 */
public class TESTTUtil {

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
	public static void clearCache(TESTT testt) {
		getPersistence().clearCache(testt);
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
	public static Map<Serializable, TESTT> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TESTT> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TESTT> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TESTT> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TESTT> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TESTT update(TESTT testt) {
		return getPersistence().update(testt);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TESTT update(TESTT testt, ServiceContext serviceContext) {
		return getPersistence().update(testt, serviceContext);
	}

	/**
	 * Returns all the testts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching testts
	 */
	public static List<TESTT> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the testts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TESTTModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of testts
	 * @param end the upper bound of the range of testts (not inclusive)
	 * @return the range of matching testts
	 */
	public static List<TESTT> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the testts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TESTTModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of testts
	 * @param end the upper bound of the range of testts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching testts
	 */
	public static List<TESTT> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<TESTT> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the testts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TESTTModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of testts
	 * @param end the upper bound of the range of testts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching testts
	 */
	public static List<TESTT> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<TESTT> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first testt in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching testt
	 * @throws NoSuchTESTTException if a matching testt could not be found
	 */
	public static TESTT findByUuid_First(
			String uuid, OrderByComparator<TESTT> orderByComparator)
		throws anb.ejada.DataTest.exception.NoSuchTESTTException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first testt in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching testt, or <code>null</code> if a matching testt could not be found
	 */
	public static TESTT fetchByUuid_First(
		String uuid, OrderByComparator<TESTT> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last testt in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching testt
	 * @throws NoSuchTESTTException if a matching testt could not be found
	 */
	public static TESTT findByUuid_Last(
			String uuid, OrderByComparator<TESTT> orderByComparator)
		throws anb.ejada.DataTest.exception.NoSuchTESTTException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last testt in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching testt, or <code>null</code> if a matching testt could not be found
	 */
	public static TESTT fetchByUuid_Last(
		String uuid, OrderByComparator<TESTT> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the testts before and after the current testt in the ordered set where uuid = &#63;.
	 *
	 * @param TestId the primary key of the current testt
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next testt
	 * @throws NoSuchTESTTException if a testt with the primary key could not be found
	 */
	public static TESTT[] findByUuid_PrevAndNext(
			long TestId, String uuid,
			OrderByComparator<TESTT> orderByComparator)
		throws anb.ejada.DataTest.exception.NoSuchTESTTException {

		return getPersistence().findByUuid_PrevAndNext(
			TestId, uuid, orderByComparator);
	}

	/**
	 * Removes all the testts where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of testts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching testts
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the testt in the entity cache if it is enabled.
	 *
	 * @param testt the testt
	 */
	public static void cacheResult(TESTT testt) {
		getPersistence().cacheResult(testt);
	}

	/**
	 * Caches the testts in the entity cache if it is enabled.
	 *
	 * @param testts the testts
	 */
	public static void cacheResult(List<TESTT> testts) {
		getPersistence().cacheResult(testts);
	}

	/**
	 * Creates a new testt with the primary key. Does not add the testt to the database.
	 *
	 * @param TestId the primary key for the new testt
	 * @return the new testt
	 */
	public static TESTT create(long TestId) {
		return getPersistence().create(TestId);
	}

	/**
	 * Removes the testt with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param TestId the primary key of the testt
	 * @return the testt that was removed
	 * @throws NoSuchTESTTException if a testt with the primary key could not be found
	 */
	public static TESTT remove(long TestId)
		throws anb.ejada.DataTest.exception.NoSuchTESTTException {

		return getPersistence().remove(TestId);
	}

	public static TESTT updateImpl(TESTT testt) {
		return getPersistence().updateImpl(testt);
	}

	/**
	 * Returns the testt with the primary key or throws a <code>NoSuchTESTTException</code> if it could not be found.
	 *
	 * @param TestId the primary key of the testt
	 * @return the testt
	 * @throws NoSuchTESTTException if a testt with the primary key could not be found
	 */
	public static TESTT findByPrimaryKey(long TestId)
		throws anb.ejada.DataTest.exception.NoSuchTESTTException {

		return getPersistence().findByPrimaryKey(TestId);
	}

	/**
	 * Returns the testt with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param TestId the primary key of the testt
	 * @return the testt, or <code>null</code> if a testt with the primary key could not be found
	 */
	public static TESTT fetchByPrimaryKey(long TestId) {
		return getPersistence().fetchByPrimaryKey(TestId);
	}

	/**
	 * Returns all the testts.
	 *
	 * @return the testts
	 */
	public static List<TESTT> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the testts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TESTTModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of testts
	 * @param end the upper bound of the range of testts (not inclusive)
	 * @return the range of testts
	 */
	public static List<TESTT> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the testts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TESTTModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of testts
	 * @param end the upper bound of the range of testts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of testts
	 */
	public static List<TESTT> findAll(
		int start, int end, OrderByComparator<TESTT> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the testts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TESTTModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of testts
	 * @param end the upper bound of the range of testts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of testts
	 */
	public static List<TESTT> findAll(
		int start, int end, OrderByComparator<TESTT> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the testts from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of testts.
	 *
	 * @return the number of testts
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TESTTPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TESTTPersistence, TESTTPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TESTTPersistence.class);

		ServiceTracker<TESTTPersistence, TESTTPersistence> serviceTracker =
			new ServiceTracker<TESTTPersistence, TESTTPersistence>(
				bundle.getBundleContext(), TESTTPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}