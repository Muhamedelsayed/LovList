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

package anb.ejada.DataTest.model.impl;

import anb.ejada.DataTest.model.TESTT;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TESTT in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TESTTCacheModel implements CacheModel<TESTT>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TESTTCacheModel)) {
			return false;
		}

		TESTTCacheModel testtCacheModel = (TESTTCacheModel)object;

		if (TestId == testtCacheModel.TestId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, TestId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", TestId=");
		sb.append(TestId);
		sb.append(", Data=");
		sb.append(Data);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TESTT toEntityModel() {
		TESTTImpl testtImpl = new TESTTImpl();

		if (uuid == null) {
			testtImpl.setUuid("");
		}
		else {
			testtImpl.setUuid(uuid);
		}

		testtImpl.setTestId(TestId);

		if (Data == null) {
			testtImpl.setData("");
		}
		else {
			testtImpl.setData(Data);
		}

		testtImpl.resetOriginalValues();

		return testtImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		TestId = objectInput.readLong();
		Data = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(TestId);

		if (Data == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Data);
		}
	}

	public String uuid;
	public long TestId;
	public String Data;

}