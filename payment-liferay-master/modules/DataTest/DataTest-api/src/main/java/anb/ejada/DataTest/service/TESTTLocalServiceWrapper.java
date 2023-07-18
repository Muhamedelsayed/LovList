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

package anb.ejada.DataTest.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TESTTLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TESTTLocalService
 * @generated
 */
public class TESTTLocalServiceWrapper
	implements ServiceWrapper<TESTTLocalService>, TESTTLocalService {

	public TESTTLocalServiceWrapper(TESTTLocalService testtLocalService) {
		_testtLocalService = testtLocalService;
	}

	/**
	 * Adds the testt to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TESTTLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param testt the testt
	 * @return the testt that was added
	 */
	@Override
	public anb.ejada.DataTest.model.TESTT addTESTT(
		anb.ejada.DataTest.model.TESTT testt) {

		return _testtLocalService.addTESTT(testt);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testtLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new testt with the primary key. Does not add the testt to the database.
	 *
	 * @param TestId the primary key for the new testt
	 * @return the new testt
	 */
	@Override
	public anb.ejada.DataTest.model.TESTT createTESTT(long TestId) {
		return _testtLocalService.createTESTT(TestId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testtLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the testt with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TESTTLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param TestId the primary key of the testt
	 * @return the testt that was removed
	 * @throws PortalException if a testt with the primary key could not be found
	 */
	@Override
	public anb.ejada.DataTest.model.TESTT deleteTESTT(long TestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testtLocalService.deleteTESTT(TestId);
	}

	/**
	 * Deletes the testt from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TESTTLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param testt the testt
	 * @return the testt that was removed
	 */
	@Override
	public anb.ejada.DataTest.model.TESTT deleteTESTT(
		anb.ejada.DataTest.model.TESTT testt) {

		return _testtLocalService.deleteTESTT(testt);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _testtLocalService.dynamicQuery();
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

		return _testtLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>anb.ejada.DataTest.model.impl.TESTTModelImpl</code>.
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

		return _testtLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>anb.ejada.DataTest.model.impl.TESTTModelImpl</code>.
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

		return _testtLocalService.dynamicQuery(
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

		return _testtLocalService.dynamicQueryCount(dynamicQuery);
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

		return _testtLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public anb.ejada.DataTest.model.TESTT fetchTESTT(long TestId) {
		return _testtLocalService.fetchTESTT(TestId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _testtLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _testtLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _testtLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testtLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public String getTestData() {
		return _testtLocalService.getTestData();
	}

	/**
	 * Returns the testt with the primary key.
	 *
	 * @param TestId the primary key of the testt
	 * @return the testt
	 * @throws PortalException if a testt with the primary key could not be found
	 */
	@Override
	public anb.ejada.DataTest.model.TESTT getTESTT(long TestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testtLocalService.getTESTT(TestId);
	}

	/**
	 * Returns a range of all the testts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>anb.ejada.DataTest.model.impl.TESTTModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of testts
	 * @param end the upper bound of the range of testts (not inclusive)
	 * @return the range of testts
	 */
	@Override
	public java.util.List<anb.ejada.DataTest.model.TESTT> getTESTTs(
		int start, int end) {

		return _testtLocalService.getTESTTs(start, end);
	}

	/**
	 * Returns the number of testts.
	 *
	 * @return the number of testts
	 */
	@Override
	public int getTESTTsCount() {
		return _testtLocalService.getTESTTsCount();
	}

	@Override
	public void setTestData() {
		_testtLocalService.setTestData();
	}

	/**
	 * Updates the testt in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TESTTLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param testt the testt
	 * @return the testt that was updated
	 */
	@Override
	public anb.ejada.DataTest.model.TESTT updateTESTT(
		anb.ejada.DataTest.model.TESTT testt) {

		return _testtLocalService.updateTESTT(testt);
	}

	@Override
	public TESTTLocalService getWrappedService() {
		return _testtLocalService;
	}

	@Override
	public void setWrappedService(TESTTLocalService testtLocalService) {
		_testtLocalService = testtLocalService;
	}

	private TESTTLocalService _testtLocalService;

}