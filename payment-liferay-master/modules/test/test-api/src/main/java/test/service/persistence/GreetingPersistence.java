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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

import test.exception.NoSuchGreetingException;

import test.model.Greeting;

/**
 * The persistence interface for the greeting service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GreetingUtil
 * @generated
 */
@ProviderType
public interface GreetingPersistence extends BasePersistence<Greeting> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GreetingUtil} to access the greeting persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the greetings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching greetings
	 */
	public java.util.List<Greeting> findByUuid(String uuid);

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
	public java.util.List<Greeting> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Greeting> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Greeting>
			orderByComparator);

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
	public java.util.List<Greeting> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Greeting>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first greeting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching greeting
	 * @throws NoSuchGreetingException if a matching greeting could not be found
	 */
	public Greeting findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Greeting>
				orderByComparator)
		throws NoSuchGreetingException;

	/**
	 * Returns the first greeting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching greeting, or <code>null</code> if a matching greeting could not be found
	 */
	public Greeting fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Greeting>
			orderByComparator);

	/**
	 * Returns the last greeting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching greeting
	 * @throws NoSuchGreetingException if a matching greeting could not be found
	 */
	public Greeting findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Greeting>
				orderByComparator)
		throws NoSuchGreetingException;

	/**
	 * Returns the last greeting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching greeting, or <code>null</code> if a matching greeting could not be found
	 */
	public Greeting fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Greeting>
			orderByComparator);

	/**
	 * Returns the greetings before and after the current greeting in the ordered set where uuid = &#63;.
	 *
	 * @param greetingId the primary key of the current greeting
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next greeting
	 * @throws NoSuchGreetingException if a greeting with the primary key could not be found
	 */
	public Greeting[] findByUuid_PrevAndNext(
			long greetingId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Greeting>
				orderByComparator)
		throws NoSuchGreetingException;

	/**
	 * Removes all the greetings where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of greetings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching greetings
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the greeting in the entity cache if it is enabled.
	 *
	 * @param greeting the greeting
	 */
	public void cacheResult(Greeting greeting);

	/**
	 * Caches the greetings in the entity cache if it is enabled.
	 *
	 * @param greetings the greetings
	 */
	public void cacheResult(java.util.List<Greeting> greetings);

	/**
	 * Creates a new greeting with the primary key. Does not add the greeting to the database.
	 *
	 * @param greetingId the primary key for the new greeting
	 * @return the new greeting
	 */
	public Greeting create(long greetingId);

	/**
	 * Removes the greeting with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param greetingId the primary key of the greeting
	 * @return the greeting that was removed
	 * @throws NoSuchGreetingException if a greeting with the primary key could not be found
	 */
	public Greeting remove(long greetingId) throws NoSuchGreetingException;

	public Greeting updateImpl(Greeting greeting);

	/**
	 * Returns the greeting with the primary key or throws a <code>NoSuchGreetingException</code> if it could not be found.
	 *
	 * @param greetingId the primary key of the greeting
	 * @return the greeting
	 * @throws NoSuchGreetingException if a greeting with the primary key could not be found
	 */
	public Greeting findByPrimaryKey(long greetingId)
		throws NoSuchGreetingException;

	/**
	 * Returns the greeting with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param greetingId the primary key of the greeting
	 * @return the greeting, or <code>null</code> if a greeting with the primary key could not be found
	 */
	public Greeting fetchByPrimaryKey(long greetingId);

	/**
	 * Returns all the greetings.
	 *
	 * @return the greetings
	 */
	public java.util.List<Greeting> findAll();

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
	public java.util.List<Greeting> findAll(int start, int end);

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
	public java.util.List<Greeting> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Greeting>
			orderByComparator);

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
	public java.util.List<Greeting> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Greeting>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the greetings from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of greetings.
	 *
	 * @return the number of greetings
	 */
	public int countAll();

}