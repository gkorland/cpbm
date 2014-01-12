package org.cloudifysource.cpbm.cs.sdk.collectors;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.citrix.cpbm.platform.exception.EventCollectionException;
import com.citrix.cpbm.platform.model.EventResultSet;
import com.citrix.cpbm.platform.spi.Connector;
import com.citrix.cpbm.platform.spi.EventCollector;

/**
 * This Cloud Service's Event Collection Service.
 */
public class MyEventCollector implements EventCollector {

	public void initialize(Connector service) {
    // TODO Auto-generated method stub
	}

	public EventResultSet listEvents(String startMarker, Date endDate)
			throws EventCollectionException {
		// TODO Auto-generated method stub
		return null;
	}

}
