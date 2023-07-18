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

import com.ejada.LOVList.exception.NoSuchLISTException;
import com.ejada.LOVList.model.LOVLIST;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the lovlist service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LOVLISTUtil
 * @generated
 */
@ProviderType
public interface LOVLISTPersistence extends BasePersistence<LOVLIST> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LOVLISTUtil} to access the lovlist persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the lovlist in the entity cache if it is enabled.
	 *
	 * @param lovlist the lovlist
	 */
	public void cacheResult(LOVLIST lovlist);

	/**
	 * Caches the lovlists in the entity cache if it is enabled.
	 *
	 * @param lovlists the lovlists
	 */
	public void cacheResult(java.util.List<LOVLIST> lovlists);

	/**
	 * Creates a new lovlist with the primary key. Does not add the lovlist to the database.
	 *
	 * @param Id the primary key for the new lovlist
	 * @return the new lovlist
	 */
	public LOVLIST create(long Id);

	/**
	 * Removes the lovlist with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the lovlist
	 * @return the lovlist that was removed
	 * @throws NoSuchLISTException if a lovlist with the primary key could not be found
	 */
	public LOVLIST remove(long Id) throws NoSuchLISTException;

	public LOVLIST updateImpl(LOVLIST lovlist);

	/**
	 * Returns the lovlist with the primary key or throws a <code>NoSuchLISTException</code> if it could not be found.
	 *
	 * @param Id the primary key of the lovlist
	 * @return the lovlist
	 * @throws NoSuchLISTException if a lovlist with the primary key could not be found
	 */
	public LOVLIST findByPrimaryKey(long Id) throws NoSuchLISTException;

	/**
	 * Returns the lovlist with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the lovlist
	 * @return the lovlist, or <code>null</code> if a lovlist with the primary key could not be found
	 */
	public LOVLIST fetchByPrimaryKey(long Id);

	/**
	 * Returns all the lovlists.
	 *
	 * @return the lovlists
	 */
	public java.util.List<LOVLIST> findAll();

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
	public java.util.List<LOVLIST> findAll(int start, int end);

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
	public java.util.List<LOVLIST> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LOVLIST>
			orderByComparator);

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
	public java.util.List<LOVLIST> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LOVLIST>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the lovlists from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of lovlists.
	 *
	 * @return the number of lovlists
	 */
	public int countAll();

}