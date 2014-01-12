package org.cloudifysource.cpbm.cs.sdk.service;

import java.util.List;

import org.cloudifysource.cpbm.cs.sdk.connector.MyMetadataRegistry;
import org.cloudifysource.cpbm.cs.sdk.collectors.MyEventCollector;
import org.cloudifysource.cpbm.cs.sdk.collectors.MyUsageCollector;
import org.cloudifysource.cpbm.cs.sdk.lifecycle.handlers.MyAccountLifeCycleHandler;
import org.cloudifysource.cpbm.cs.sdk.lifecycle.handlers.MySubscriptionLifecycleHandler;
import org.cloudifysource.cpbm.cs.sdk.lifecycle.handlers.MyUserLifeCycleHandler;
import org.cloudifysource.cpbm.cs.sdk.views.MyViewResolver;

import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.citrix.cpbm.platform.admin.service.utils.ServiceInstanceConfiguration;
import com.citrix.cpbm.platform.spi.APIHandler;
import com.citrix.cpbm.platform.spi.AccountLifecycleHandler;
import com.citrix.cpbm.platform.spi.CloudConnector;
import com.citrix.cpbm.platform.spi.EventCollector;
import com.citrix.cpbm.platform.spi.MetadataRegistry;
import com.citrix.cpbm.platform.spi.SsoHandler;
import com.citrix.cpbm.platform.spi.SubscriptionLifecycleHandler;
import com.citrix.cpbm.platform.spi.UsageCollector;
import com.citrix.cpbm.platform.spi.UserLifecycleHandler;
import com.citrix.cpbm.platform.spi.ViewResolver;

public class MyServiceImpl implements CloudConnector {

	private ServiceInstanceConfiguration serviceInstanceConfiguration;
	
	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private MyMetadataRegistry metadataRegistry;
	@Autowired
	private MyAccountLifeCycleHandler accountLifecycleHandler;
	@Autowired
	private MyUserLifeCycleHandler userLifecycleHandler;
	@Autowired
	private MySubscriptionLifecycleHandler subscriptionLifecycleHandler;
	@Autowired
	private MyUsageCollector usageCollector;
	@Autowired
	private MyEventCollector eventCollector;
	@Autowired
	private MyViewResolver viewResolver;

	public void setServiceInstanceConfiguration(
			ServiceInstanceConfiguration serviceInstanceConfiguration) {
		this.serviceInstanceConfiguration = serviceInstanceConfiguration;
		metadataRegistry.initialize(this);
		accountLifecycleHandler.initialize(this);
		userLifecycleHandler.initialize(this);
		subscriptionLifecycleHandler.initialize(this);
		eventCollector.initialize(this);
		usageCollector.initialize(this);
		viewResolver.initialize(this);
	}

	public ServiceInstanceConfiguration getServiceInstanceConfiguration() {
		return serviceInstanceConfiguration;
	}

	public String getServiceUuid() {
		return serviceInstanceConfiguration.getServiceUUID();
	}

	public MetadataRegistry getMetadataRegistry() {
		return metadataRegistry;
	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;

	}

	public AccountLifecycleHandler getAccountLifeCycleHandler() {
		return accountLifecycleHandler;
	}

	public UserLifecycleHandler getUserLifeCycleHandler() {
		return userLifecycleHandler;
	}

	public SubscriptionLifecycleHandler getSubscriptionLifecycleHandler() {
		return subscriptionLifecycleHandler;
	}

	public boolean getStatus() {
		return true;
	}

	public UsageCollector getUsageCollector() {
		return usageCollector;
	}

	public EventCollector getEventCollector() {
		return eventCollector;
	}

	public ViewResolver getViewResolver() {
		return viewResolver;
	}

	public String getServiceInstanceUUID() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServiceUUID() {
		// TODO Auto-generated method stub
		return null;
	}

	public APIHandler getAPIHandler(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, String> getAPIHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	public SsoHandler getSSOHandler() {
		// TODO Auto-generated method stub
		return null;
	}

}
