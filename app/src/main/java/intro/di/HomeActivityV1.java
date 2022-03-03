package intro.di;

import intro.di.RootScope.ExternalDependencies;
import intro.di.network.AuthService;
import intro.di.network.RideRequestService;

class HomeActivityV1 {

  private Profile profile;
  private RootScope rootScope;

  public HomeActivityV1() {
  }

  void onCreate() {
  }

  /**
   * Login the user.
   */
  void login() {
    rootScope = new RootScopeImpl(new ExternalDependencies() {
      @Override
      public String serverUrl() {
        return "www.uber.com";
      }
    });
    AuthService authService1 = rootScope.authService();
    profile = authService1.login("eric.liu@uber.com", "xxxx");
  }


  /**
   * Request a ride.
   */
  void requestRide() {
    if (profile != null) {
      RideRequestService rideRequestService1 = rootScope.loggedInScope(profile).rideRequestService();
      rideRequestService1.requestRide();
    }
  }

  /**
   * log the user.
   */
  void logout() {
    AuthService authService = rootScope.authService();
    authService.logout("eric.liu@uber.com");
    profile = null;
  }


}