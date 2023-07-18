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

package com.ejada.LOVList.service.impl;

import com.ejada.LOVList.model.LOVLIST;
import com.ejada.LOVList.service.LOVLISTLocalService;
import com.ejada.LOVList.service.base.LOVLISTLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;


import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * The implementation of the lovlist local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.ejada.LOVList.service.LOVLISTLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LOVLISTLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.ejada.LOVList.model.LOVLIST",
	service = AopService.class
)
public class LOVLISTLocalServiceImpl extends LOVLISTLocalServiceBaseImpl {
	
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.ejada.LOVList.service.LOVLISTLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.ejada.LOVList.service.LOVLISTLocalServiceUtil</code>.
	 */
	
	public void lovlistcreate(String EnName,String ArName) {
		LOVLIST createLovList=this.lovlistLocalService.createLOVLIST(CounterLocalServiceUtil.increment());
		createLovList.setEnName(EnName);
		createLovList.setArName(ArName);
		this.lovlistLocalService.updateLOVLIST(createLovList);
	}

	
}