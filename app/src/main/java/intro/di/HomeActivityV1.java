package intro.di;

import intro.di.network.AuthService;
import intro.di.network.RideRequestService;

class HomeActivityV1 {

  private Profile profile;
  private RootComponent rootComponent;

  public HomeActivityV1() {
  }

  void onCreate() {
    rootComponent = new RootComponent();
  }

  /**
   * Login the user.
   */
  void login() {
    AuthService authService = rootComponent.authService();
    profile = authService.login("eric.liu@uber.com", "xxxx");
  }

  /**
   * Request a ride.
   */
  void requestRide() {
    if (profile != null) {
      RideRequestService rideRequestService = rootComponent.rideRequestService(profile);
      rideRequestService.requestRide();
    }
  }

  /**
   * log the user.
   */
  void logout() {
    AuthService authService = rootComponent.authService();
    authService.logout("eric.liu@uber.com");
    profile = null;
  }

}