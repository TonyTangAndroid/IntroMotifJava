package intro.di;

import androidx.annotation.NonNull;
import intro.di.network.AuthService;
import intro.di.network.NetworkClient;
import intro.di.network.RideRequestService;

class HomeActivityV1 {

  private Profile profile;

  private NetworkClient networkClient;
  private AuthService authService;
  private RideRequestService rideRequestService;
  private RootScopeImpl rootScope;

  public HomeActivityV1() {
  }

  void onCreate() {

  }

  /**
   * Login the user.
   */
  void login() {
    AuthService authService = getRootScope().authService();
    profile = authService.login("eric.liu@uber.com", "xxxx");
  }

  private RootScope getRootScope() {
    if (rootScope==null){
      rootScope = new RootScopeImpl();
    }
    return rootScope;
  }


  /**
   * Request a ride.
   */
  void requestRide() {
    if (profile != null) {
      RideRequestService rideRequestService = getRootScope().loggedInScope(profile).rideRequestService();
      rideRequestService.requestRide();
    }
  }



  /**
   * log the user.
   */
  void logout() {
    AuthService authService = getRootScope().authService();
    authService.logout("eric.liu@uber.com");
    profile = null;
  }

}