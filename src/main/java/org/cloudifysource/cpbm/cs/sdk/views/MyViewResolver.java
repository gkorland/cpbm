package org.cloudifysource.cpbm.cs.sdk.views;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.citrix.cpbm.platform.spi.Connector;
import com.citrix.cpbm.platform.spi.SsoHandler;
import com.citrix.cpbm.platform.spi.View;
import com.citrix.cpbm.platform.spi.ViewResolver;
import com.vmops.model.Subscription;
import com.vmops.model.Tenant;
import com.vmops.model.User;

/**
 * The Cloud Service's View Resolver.
 */
public class MyViewResolver implements ViewResolver {

	public void initialize(Connector service) {

	}

	public List<View> listResourceViews(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public View resolveSubscriptionDetailView(Subscription subscription) {
		// TODO Auto-generated method stub
		return null;
	}

	public View resolveAccountSettingsView(Tenant tenant) {
		// TODO Auto-generated method stub
		return null;
	}

	public View resolveUserSettingsView(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public View getConsoleView(User arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}
