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

package anb.ejada.DataTest.service.impl;

import anb.ejada.DataTest.model.TESTT;
import anb.ejada.DataTest.service.TESTTLocalServiceUtil;
import anb.ejada.DataTest.service.base.TESTTLocalServiceBaseImpl;
import anb.ejada.DataTest.service.persistence.TESTTPersistence;
import anb.ejada.DataTest.service.persistence.impl.TESTTPersistenceImpl;

import com.fasterxml.jackson.core.JsonParser;
import com.liferay.dynamic.data.mapping.model.DDMContent;
import com.liferay.dynamic.data.mapping.service.DDMContentLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the testt local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>anb.ejada.DataTest.service.TESTTLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TESTTLocalServiceBaseImpl
 */
@Component(property = "model.class.name=anb.ejada.DataTest.model.TESTT", service = AopService.class)
public class TESTTLocalServiceImpl extends TESTTLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use
	 * <code>anb.ejada.DataTest.service.TESTTLocalService</code> via injection or a
	 * <code>org.osgi.util.tracker.ServiceTracker</code> or use
	 * <code>anb.ejada.DataTest.service.TESTTLocalServiceUtil</code>.
	 */
	public void setTestData() {
		TESTT testt = TESTTLocalServiceUtil.createTESTT(counterLocalService.increment());
		testt.setData(DDMContentLocalServiceUtil.getContents().get(0).getData());
		TESTTLocalServiceUtil.updateTESTT(testt);
//		System.out.println(DDMContentLocalServiceUtil.getContents().get(0).getData());
	}

	public String getTestData() {
		return TESTTLocalServiceUtil.getTESTTs(0, TESTTLocalServiceUtil.getTESTTsCount()).toString();
	}
}