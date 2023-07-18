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

package com.ejada.LOVList.model.impl;

import com.ejada.LOVList.model.LOVLIST;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LOVLIST in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LOVLISTCacheModel implements CacheModel<LOVLIST>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof LOVLISTCacheModel)) {
			return false;
		}

		LOVLISTCacheModel lovlistCacheModel = (LOVLISTCacheModel)object;

		if (Id == lovlistCacheModel.Id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", EnName=");
		sb.append(EnName);
		sb.append(", ArName=");
		sb.append(ArName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LOVLIST toEntityModel() {
		LOVLISTImpl lovlistImpl = new LOVLISTImpl();

		lovlistImpl.setId(Id);

		if (EnName == null) {
			lovlistImpl.setEnName("");
		}
		else {
			lovlistImpl.setEnName(EnName);
		}

		if (ArName == null) {
			lovlistImpl.setArName("");
		}
		else {
			lovlistImpl.setArName(ArName);
		}

		lovlistImpl.resetOriginalValues();

		return lovlistImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		EnName = objectInput.readUTF();
		ArName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(Id);

		if (EnName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(EnName);
		}

		if (ArName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ArName);
		}
	}

	public long Id;
	public String EnName;
	public String ArName;

}