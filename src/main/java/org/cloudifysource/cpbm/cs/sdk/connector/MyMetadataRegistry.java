package org.cloudifysource.cpbm.cs.sdk.connector;

import java.util.List;
import java.util.Map;

import com.citrix.cpbm.platform.spi.APIHandler;
import com.citrix.cpbm.platform.spi.Connector;
import com.citrix.cpbm.platform.spi.MetadataRegistry;
import com.citrix.cpbm.platform.spi.ResourceComponent;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Scope;

/**
 * The Cloud Service's Metadata Registry.
 */
public class MyMetadataRegistry implements MetadataRegistry {

	public void initialize(Connector service) {
		// TODO Auto-generated method stub

	}

	public Map<String, String> getResourceTypeValues(String tenantHandle,
			String userHandle, String name, Map<String, String> context,
			Map<String, String> filters) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, String> getFilterValues(String tenantHandle,
			String userHandle, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, String> getDiscriminatorValues(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ResourceComponent> getResourceComponentValues(
			String resourceType, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ResourceComponent> getResourceComponentValues(
			String resourceType, String name, String tenantHandle,
			String userHandle, Map<String, String> context,
			Map<String, String> filters) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResourceComponent getResourceComponent(String resourceType,
			String resourceComponent, String componentValue) {
		// TODO Auto-generated method stub
		return null;
	}

  public Map<String, String> getAPIHandles() {
    // TODO Auto-generated method stub
    return null;
  }

  public APIHandler getAPIHandler(String apiGroupName) {
    // TODO Auto-generated method stub
    return null;
  }

}
