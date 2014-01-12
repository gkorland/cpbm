package org.cloudifysource.cpbm.cs.sdk.lifecycle.handlers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.citrix.cpbm.platform.spi.AccountLifecycleHandler;
import com.citrix.cpbm.platform.spi.Connector;
import com.vmops.model.AccountType;
import com.vmops.model.Tenant;
import com.vmops.service.TenantService;

/**
 * The Cloud Service's Account LifeCycle Handler.
 */
public class MyAccountLifeCycleHandler implements AccountLifecycleHandler {

  @Autowired
  TenantService tenantService;

  public void initialize(Connector service) {

  }

  public void register(Tenant tenant, String... data) {
    // TODO Auto-generated method stub

  }

  public void restrict(Tenant tenant) {
    // TODO Auto-generated method stub

  }

  public void suspend(Tenant tenant) {
    // TODO Auto-generated method stub

  }

  public void reactivate(Tenant tenant) {
    // TODO Auto-generated method stub

  }

  public void terminate(Tenant tenant) {
    // TODO Auto-generated method stub

  }

  public void update(Tenant tenant) {
    // TODO Auto-generated method stub

  }

  public void register(Tenant tenant, Map<String, String> accountConfig) {
    // TODO Auto-generated method stub

  }

  public void setControls(Tenant tenant, Map<String, String> forcedControls, AccountType targetAccountType) {
    // TODO Auto-generated method stub

  }

  public Map<String, String> getControls(Tenant tenant) {
    // TODO Auto-generated method stub
    return null;
  }

  public void setControls(Tenant arg0, Map<String, String> arg1) {
    // TODO Auto-generated method stub

  }

}
