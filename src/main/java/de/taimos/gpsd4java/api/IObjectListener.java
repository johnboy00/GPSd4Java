/**
 * Copyright 2011 Thorsten Höger, Taimos GmbH
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package de.taimos.gpsd4java.api;

import de.taimos.gpsd4java.types.*;
import de.taimos.gpsd4java.types.subframes.SUBFRAMEObject;

/**
 * Listener to receive response objects
 * 
 * @author thoeger
 */
public interface IObjectListener {

	/**
	 * @param tpv
	 *            the TPV object
	 */
	void handleTPV(TPVObject tpv);

	/**
	 * @param sky
	 *            the SKY object
	 */
	void handleSKY(SKYObject sky);

	/**
	 * @param att
	 *            the ATT object
	 */
	void handleATT(ATTObject att);

	/**
	 * @param subframe
	 *            the SUBFRAME object
	 */
	void handleSUBFRAME(SUBFRAMEObject subframe);

	/**
	 * @param devices
	 *            the devices object
	 */
	void handleDevices(DevicesObject devices);

	/**
	 * @param device
	 *            the device object
	 */
	void handleDevice(DeviceObject device);

}
