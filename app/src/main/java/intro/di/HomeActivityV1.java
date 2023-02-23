package intro.di;

import intro.di.network.AuthService;
import intro.di.network.NetworkClient;
import intro.di.network.RideRequestService;

class HomeActivityV1 {

  private Profile profile;

  private NetworkClient networkClient;
  private AuthService authService;
  private RideRequestService rideRequestService;

  public HomeActivityV1() {
  }

  void onCreate() {

  }

  /**
   * Login the user.
   */
  void login() {
    AuthService authService = new RootComponent().createAuthServiceIfNeeded();
    profile = authService.login("eric.liu@uber.com", "xxxx");
  }



  /**
   * Request a ride.
   */
  void requestRide() {
    if (profile != null) {
      RideRequestService rideRequestService = new RootComponent().createRideRequestServiceIfNeeded(profile);
      rideRequestService.requestRide();
    }
  }



  /**
   * log the user.
   */
  void logout() {
    AuthService authService =new RootComponent().createAuthServiceIfNeeded();
    authService.logout("eric.liu@uber.com");
    profile = null;
  }

}