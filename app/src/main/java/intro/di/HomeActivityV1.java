package intro.di;

import intro.di.network.AuthService;
import intro.di.network.RideRequestService;

class HomeActivityV1 {

  private Profile profile;
  private RootScope rootScope;

  public HomeActivityV1() {
  }

  void onCreate() {
    rootScope = new RootScopeImpl();
  }

  /**
   * Login the user.
   */
  void login() {
    profile = rootScope.authService().login("eric.liu@uber.com", "xxxx");
  }

  /**
   * Request a ride.
   */
  void requestRide() {
    if (profile != null) {
      rootScope.loggedInScope(profile).rideRequestService().requestRide();
    }
  }

  /**
   * log out the user.
   */
  void logout() {
    rootScope.authService().logout("eric.liu@uber.com");
    profile = null;
  }

}