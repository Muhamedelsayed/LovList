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

package com.ejada.LOVList.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LOVLISTLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LOVLISTLocalService
 * @generated
 */
public class LOVLISTLocalServiceWrapper
	implements LOVLISTLocalService, ServiceWrapper<LOVLISTLocalService> {

	public LOVLISTLocalServiceWrapper(LOVLISTLocalService lovlistLocalService) {
		_lovlistLocalService = lovlistLocalService;
	}

	/**
	 * Adds the lovlist to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LOVLISTLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param lovlist the lovlist
	 * @return the lovlist that was added
	 */
	@Override
	public com.ejada.LOVList.model.LOVLIST addLOVLIST(
		com.ejada.LOVList.model.LOVLIST lovlist) {

		return _lovlistLocalService.addLOVLIST(lovlist);
	}

	/**
	 * Creates a new lovlist with the primary key. Does not add the lovlist to the database.
	 *
	 * @param Id the primary key for the new lovlist
	 * @return the new lovlist
	 */
	@Override
	public com.ejada.LOVList.model.LOVLIST createLOVLIST(long Id) {
		return _lovlistLocalService.createLOVLIST(Id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lovlistLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the lovlist with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LOVLISTLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Id the primary key of the lovlist
	 * @return the lovlist that was removed
	 * @throws PortalException if a lovlist with the primary key could not be found
	 */
	@Override
	public com.ejada.LOVList.model.LOVLIST deleteLOVLIST(long Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lovlistLocalService.deleteLOVLIST(Id);
	}

	/**
	 * Deletes the lovlist from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LOVLISTLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param lovlist the lovlist
	 * @return the lovlist that was removed
	 */
	@Override
	public com.ejada.LOVList.model.LOVLIST deleteLOVLIST(
		com.ejada.LOVList.model.LOVLIST lovlist) {

		return _lovlistLocalService.deleteLOVLIST(lovlist);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lovlistLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _lovlistLocalService.dynamicQuery();
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

		return _lovlistLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ejada.LOVList.model.impl.LOVLISTModelImpl</code>.
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

		return _lovlistLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ejada.LOVList.model.impl.LOVLISTModelImpl</code>.
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

		return _lovlistLocalService.dynamicQuery(
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

		return _lovlistLocalService.dynamicQueryCount(dynamicQuery);
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

		return _lovlistLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.ejada.LOVList.model.LOVLIST fetchLOVLIST(long Id) {
		return _lovlistLocalService.fetchLOVLIST(Id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _lovlistLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _lovlistLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the lovlist with the primary key.
	 *
	 * @param Id the primary key of the lovlist
	 * @return the lovlist
	 * @throws PortalException if a lovlist with the primary key could not be found
	 */
	@Override
	public com.ejada.LOVList.model.LOVLIST getLOVLIST(long Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lovlistLocalService.getLOVLIST(Id);
	}

	/**
	 * Returns a range of all the lovlists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ejada.LOVList.model.impl.LOVLISTModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of lovlists
	 * @param end the upper bound of the range of lovlists (not inclusive)
	 * @return the range of lovlists
	 */
	@Override
	public java.util.List<com.ejada.LOVList.model.LOVLIST> getLOVLISTs(
		int start, int end) {

		return _lovlistLocalService.getLOVLISTs(start, end);
	}

	/**
	 * Returns the number of lovlists.
	 *
	 * @return the number of lovlists
	 */
	@Override
	public int getLOVLISTsCount() {
		return _lovlistLocalService.getLOVLISTsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _lovlistLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lovlistLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public void lovlistcreate(String EnName, String ArName) {
		_lovlistLocalService.lovlistcreate(EnName, ArName);
	}

	/**
	 * Updates the lovlist in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LOVLISTLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param lovlist the lovlist
	 * @return the lovlist that was updated
	 */
	@Override
	public com.ejada.LOVList.model.LOVLIST updateLOVLIST(
		com.ejada.LOVList.model.LOVLIST lovlist) {

		return _lovlistLocalService.updateLOVLIST(lovlist);
	}

	@Override
	public LOVLISTLocalService getWrappedService() {
		return _lovlistLocalService;
	}

	@Override
	public void setWrappedService(LOVLISTLocalService lovlistLocalService) {
		_lovlistLocalService = lovlistLocalService;
	}

	private LOVLISTLocalService _lovlistLocalService;

}