package org.cloudifysource.cpbm.cs.sdk.lifecycle.handlers;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.citrix.cpbm.platform.spi.Connector;
import com.citrix.cpbm.platform.spi.SubscriptionLifecycleHandler;
import com.vmops.model.Subscription;

/**
 * The Cloud Service's Subscription Lifecycle Handler.
 */
public class MySubscriptionLifecycleHandler implements
		SubscriptionLifecycleHandler {
	public void initialize(Connector service) {

	}

	public void provision(Subscription subscription) {
		// TODO Auto-generated method stub

	}

	public void destroy(Subscription subscription) {
		// TODO Auto-generated method stub

	}

	public boolean validate(Subscription subscription) {
		// TODO Auto-generated method stub
		return false;
	}

	public void update(Subscription subscription) {
		// TODO Auto-generated method stub

	}

}
