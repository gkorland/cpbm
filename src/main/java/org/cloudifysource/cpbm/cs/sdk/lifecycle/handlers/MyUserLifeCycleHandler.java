package org.cloudifysource.cpbm.cs.sdk.lifecycle.handlers;

import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.citrix.cpbm.platform.spi.Connector;
import com.citrix.cpbm.platform.spi.UserLifecycleHandler;
import com.vmops.model.AccountType;
import com.vmops.model.User;

/**
 * The Cloud Service's User Lifecycle Handler.
 */
public class MyUserLifeCycleHandler implements UserLifecycleHandler {

  public void initialize(Connector service) {

  }

  public void register(User user) {
    // TODO Auto-generated method stub

  }

  public void lock(User user) {
    // TODO Auto-generated method stub

  }

  public void disable(User user) {
    // TODO Auto-generated method stub

  }

  public void unlock(User user) {
    // TODO Auto-generated method stub

  }

  public void enable(User user) {
    // TODO Auto-generated method stub

  }

  public void terminate(User user) {
    // TODO Auto-generated method stub

  }

  public void update(User user) {
    // TODO Auto-generated method stub

  }

  public Map<String, String> getControls(User user) {
    // TODO Auto-generated method stub
    return null;
  }

  public void setControls(User arg0, Map<String, String> arg1) {
    // TODO Auto-generated method stub

  }

}
