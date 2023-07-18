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

import anb.ejada.DataTest.exception.NoSuchTESTTException;
import anb.ejada.DataTest.model.TESTT;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the testt service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TESTTUtil
 * @generated
 */
@ProviderType
public interface TESTTPersistence extends BasePersistence<TESTT> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TESTTUtil} to access the testt persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the testts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching testts
	 */
	public java.util.List<TESTT> findByUuid(String uuid);

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
	public java.util.List<TESTT> findByUuid(String uuid, int start, int end);

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
	public java.util.List<TESTT> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TESTT>
			orderByComparator);

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
	public java.util.List<TESTT> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TESTT>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first testt in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching testt
	 * @throws NoSuchTESTTException if a matching testt could not be found
	 */
	public TESTT findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<TESTT>
				orderByComparator)
		throws NoSuchTESTTException;

	/**
	 * Returns the first testt in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching testt, or <code>null</code> if a matching testt could not be found
	 */
	public TESTT fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TESTT>
			orderByComparator);

	/**
	 * Returns the last testt in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching testt
	 * @throws NoSuchTESTTException if a matching testt could not be found
	 */
	public TESTT findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<TESTT>
				orderByComparator)
		throws NoSuchTESTTException;

	/**
	 * Returns the last testt in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching testt, or <code>null</code> if a matching testt could not be found
	 */
	public TESTT fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TESTT>
			orderByComparator);

	/**
	 * Returns the testts before and after the current testt in the ordered set where uuid = &#63;.
	 *
	 * @param TestId the primary key of the current testt
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next testt
	 * @throws NoSuchTESTTException if a testt with the primary key could not be found
	 */
	public TESTT[] findByUuid_PrevAndNext(
			long TestId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<TESTT>
				orderByComparator)
		throws NoSuchTESTTException;

	/**
	 * Removes all the testts where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of testts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching testts
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the testt in the entity cache if it is enabled.
	 *
	 * @param testt the testt
	 */
	public void cacheResult(TESTT testt);

	/**
	 * Caches the testts in the entity cache if it is enabled.
	 *
	 * @param testts the testts
	 */
	public void cacheResult(java.util.List<TESTT> testts);

	/**
	 * Creates a new testt with the primary key. Does not add the testt to the database.
	 *
	 * @param TestId the primary key for the new testt
	 * @return the new testt
	 */
	public TESTT create(long TestId);

	/**
	 * Removes the testt with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param TestId the primary key of the testt
	 * @return the testt that was removed
	 * @throws NoSuchTESTTException if a testt with the primary key could not be found
	 */
	public TESTT remove(long TestId) throws NoSuchTESTTException;

	public TESTT updateImpl(TESTT testt);

	/**
	 * Returns the testt with the primary key or throws a <code>NoSuchTESTTException</code> if it could not be found.
	 *
	 * @param TestId the primary key of the testt
	 * @return the testt
	 * @throws NoSuchTESTTException if a testt with the primary key could not be found
	 */
	public TESTT findByPrimaryKey(long TestId) throws NoSuchTESTTException;

	/**
	 * Returns the testt with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param TestId the primary key of the testt
	 * @return the testt, or <code>null</code> if a testt with the primary key could not be found
	 */
	public TESTT fetchByPrimaryKey(long TestId);

	/**
	 * Returns all the testts.
	 *
	 * @return the testts
	 */
	public java.util.List<TESTT> findAll();

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
	public java.util.List<TESTT> findAll(int start, int end);

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
	public java.util.List<TESTT> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TESTT>
			orderByComparator);

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
	public java.util.List<TESTT> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TESTT>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the testts from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of testts.
	 *
	 * @return the number of testts
	 */
	public int countAll();

}