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

package com.ejada.LOVList.service.persistence.impl;

import com.ejada.LOVList.exception.NoSuchLISTException;
import com.ejada.LOVList.model.LOVLIST;
import com.ejada.LOVList.model.impl.LOVLISTImpl;
import com.ejada.LOVList.model.impl.LOVLISTModelImpl;
import com.ejada.LOVList.service.persistence.LOVLISTPersistence;
import com.ejada.LOVList.service.persistence.impl.constants.LOVPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the lovlist service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = LOVLISTPersistence.class)
public class LOVLISTPersistenceImpl
	extends BasePersistenceImpl<LOVLIST> implements LOVLISTPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>LOVLISTUtil</code> to access the lovlist persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		LOVLISTImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public LOVLISTPersistenceImpl() {
		setModelClass(LOVLIST.class);

		setModelImplClass(LOVLISTImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the lovlist in the entity cache if it is enabled.
	 *
	 * @param lovlist the lovlist
	 */
	@Override
	public void cacheResult(LOVLIST lovlist) {
		entityCache.putResult(
			LOVLISTImpl.class, lovlist.getPrimaryKey(), lovlist);
	}

	/**
	 * Caches the lovlists in the entity cache if it is enabled.
	 *
	 * @param lovlists the lovlists
	 */
	@Override
	public void cacheResult(List<LOVLIST> lovlists) {
		for (LOVLIST lovlist : lovlists) {
			if (entityCache.getResult(
					LOVLISTImpl.class, lovlist.getPrimaryKey()) == null) {

				cacheResult(lovlist);
			}
		}
	}

	/**
	 * Clears the cache for all lovlists.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LOVLISTImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the lovlist.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LOVLIST lovlist) {
		entityCache.removeResult(LOVLISTImpl.class, lovlist);
	}

	@Override
	public void clearCache(List<LOVLIST> lovlists) {
		for (LOVLIST lovlist : lovlists) {
			entityCache.removeResult(LOVLISTImpl.class, lovlist);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(LOVLISTImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new lovlist with the primary key. Does not add the lovlist to the database.
	 *
	 * @param Id the primary key for the new lovlist
	 * @return the new lovlist
	 */
	@Override
	public LOVLIST create(long Id) {
		LOVLIST lovlist = new LOVLISTImpl();

		lovlist.setNew(true);
		lovlist.setPrimaryKey(Id);

		return lovlist;
	}

	/**
	 * Removes the lovlist with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the lovlist
	 * @return the lovlist that was removed
	 * @throws NoSuchLISTException if a lovlist with the primary key could not be found
	 */
	@Override
	public LOVLIST remove(long Id) throws NoSuchLISTException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the lovlist with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the lovlist
	 * @return the lovlist that was removed
	 * @throws NoSuchLISTException if a lovlist with the primary key could not be found
	 */
	@Override
	public LOVLIST remove(Serializable primaryKey) throws NoSuchLISTException {
		Session session = null;

		try {
			session = openSession();

			LOVLIST lovlist = (LOVLIST)session.get(
				LOVLISTImpl.class, primaryKey);

			if (lovlist == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLISTException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(lovlist);
		}
		catch (NoSuchLISTException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected LOVLIST removeImpl(LOVLIST lovlist) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(lovlist)) {
				lovlist = (LOVLIST)session.get(
					LOVLISTImpl.class, lovlist.getPrimaryKeyObj());
			}

			if (lovlist != null) {
				session.delete(lovlist);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (lovlist != null) {
			clearCache(lovlist);
		}

		return lovlist;
	}

	@Override
	public LOVLIST updateImpl(LOVLIST lovlist) {
		boolean isNew = lovlist.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(lovlist);
			}
			else {
				lovlist = (LOVLIST)session.merge(lovlist);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(LOVLISTImpl.class, lovlist, false, true);

		if (isNew) {
			lovlist.setNew(false);
		}

		lovlist.resetOriginalValues();

		return lovlist;
	}

	/**
	 * Returns the lovlist with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the lovlist
	 * @return the lovlist
	 * @throws NoSuchLISTException if a lovlist with the primary key could not be found
	 */
	@Override
	public LOVLIST findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLISTException {

		LOVLIST lovlist = fetchByPrimaryKey(primaryKey);

		if (lovlist == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLISTException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return lovlist;
	}

	/**
	 * Returns the lovlist with the primary key or throws a <code>NoSuchLISTException</code> if it could not be found.
	 *
	 * @param Id the primary key of the lovlist
	 * @return the lovlist
	 * @throws NoSuchLISTException if a lovlist with the primary key could not be found
	 */
	@Override
	public LOVLIST findByPrimaryKey(long Id) throws NoSuchLISTException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the lovlist with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the lovlist
	 * @return the lovlist, or <code>null</code> if a lovlist with the primary key could not be found
	 */
	@Override
	public LOVLIST fetchByPrimaryKey(long Id) {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the lovlists.
	 *
	 * @return the lovlists
	 */
	@Override
	public List<LOVLIST> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LOVLIST> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<LOVLIST> findAll(
		int start, int end, OrderByComparator<LOVLIST> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<LOVLIST> findAll(
		int start, int end, OrderByComparator<LOVLIST> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<LOVLIST> list = null;

		if (useFinderCache) {
			list = (List<LOVLIST>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_LOVLIST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_LOVLIST;

				sql = sql.concat(LOVLISTModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<LOVLIST>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the lovlists from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (LOVLIST lovlist : findAll()) {
			remove(lovlist);
		}
	}

	/**
	 * Returns the number of lovlists.
	 *
	 * @return the number of lovlists
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_LOVLIST);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "Id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_LOVLIST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return LOVLISTModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the lovlist persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new LOVLISTModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", LOVLIST.class.getName()));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(LOVLISTImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	@Override
	@Reference(
		target = LOVPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = LOVPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = LOVPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private BundleContext _bundleContext;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_LOVLIST =
		"SELECT lovlist FROM LOVLIST lovlist";

	private static final String _SQL_COUNT_LOVLIST =
		"SELECT COUNT(lovlist) FROM LOVLIST lovlist";

	private static final String _ORDER_BY_ENTITY_ALIAS = "lovlist.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No LOVLIST exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		LOVLISTPersistenceImpl.class);

	static {
		try {
			Class.forName(LOVPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

	private FinderPath _createFinderPath(
		String cacheName, String methodName, String[] params,
		String[] columnNames, boolean baseModelResult) {

		FinderPath finderPath = new FinderPath(
			cacheName, methodName, params, columnNames, baseModelResult);

		if (!cacheName.equals(FINDER_CLASS_NAME_LIST_WITH_PAGINATION)) {
			_serviceRegistrations.add(
				_bundleContext.registerService(
					FinderPath.class, finderPath,
					MapUtil.singletonDictionary("cache.name", cacheName)));
		}

		return finderPath;
	}

	private Set<ServiceRegistration<FinderPath>> _serviceRegistrations =
		new HashSet<>();
	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class LOVLISTModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return FINDER_ARGS_EMPTY;
				}

				return null;
			}

			LOVLISTModelImpl lovlistModelImpl = (LOVLISTModelImpl)baseModel;

			long columnBitmask = lovlistModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(lovlistModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						lovlistModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(lovlistModelImpl, columnNames, original);
			}

			return null;
		}

		private Object[] _getValue(
			LOVLISTModelImpl lovlistModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = lovlistModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = lovlistModelImpl.getColumnValue(columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}