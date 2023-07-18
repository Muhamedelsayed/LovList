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

package test.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import test.model.Greeting;

/**
 * The cache model class for representing Greeting in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class GreetingCacheModel
	implements CacheModel<Greeting>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GreetingCacheModel)) {
			return false;
		}

		GreetingCacheModel greetingCacheModel = (GreetingCacheModel)object;

		if (greetingId == greetingCacheModel.greetingId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, greetingId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", greetingId=");
		sb.append(greetingId);
		sb.append(", greeting=");
		sb.append(greeting);
		sb.append(", welcome=");
		sb.append(welcome);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Greeting toEntityModel() {
		GreetingImpl greetingImpl = new GreetingImpl();

		if (uuid == null) {
			greetingImpl.setUuid("");
		}
		else {
			greetingImpl.setUuid(uuid);
		}

		greetingImpl.setGreetingId(greetingId);

		if (greeting == null) {
			greetingImpl.setGreeting("");
		}
		else {
			greetingImpl.setGreeting(greeting);
		}

		if (welcome == null) {
			greetingImpl.setWelcome("");
		}
		else {
			greetingImpl.setWelcome(welcome);
		}

		greetingImpl.resetOriginalValues();

		return greetingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		greetingId = objectInput.readLong();
		greeting = objectInput.readUTF();
		welcome = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(greetingId);

		if (greeting == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(greeting);
		}

		if (welcome == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(welcome);
		}
	}

	public String uuid;
	public long greetingId;
	public String greeting;
	public String welcome;

}