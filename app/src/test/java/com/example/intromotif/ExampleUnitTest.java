package com.example.intromotif;

import static com.google.common.truth.Truth.*;
import static com.google.common.truth.Truth.assertThat;

import com.google.common.truth.Truth;
import intro.di.LoggedInScope;
import intro.di.LoggedOutScope;
import intro.di.Profile;
import intro.di.RootScope;
import intro.di.RootScopeImpl;
import intro.di.network.AuthService;
import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


  @Test
  public void child() {
    RootScope rootScope = new RootScopeImpl();
    AuthService authService = rootScope.authService();
    Profile profile = authService.login("1", "2");

    LoggedInScope loggedInScope = rootScope.loggedInScope(profile);
    loggedInScope.rideRequestService().requestRide();

  }
}