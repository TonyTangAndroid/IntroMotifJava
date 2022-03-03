package intro.di;

import intro.di.network.AuthService;
import intro.di.network.AuthServiceImpl;
import intro.di.network.NetworkClient;
import intro.di.network.RideRequestService;
import intro.di.network.RideRequestServiceImpl;

class HomeActivityV1 {

  private Profile profile;

  public HomeActivityV1( ) {
  }

  void onCreate() {


  }

  /**
   * Login the user.
   *//**/
  void login() {
    NetworkClient networkClient = new NetworkClient();
    AuthService authService = new AuthServiceImpl(networkClient);
    profile = authService.login("eric.liu@uber.com", "xxxx");
  }

  /**
   * Request a ride.
   */
  void requestRide() {
    if (profile != null) {
      NetworkClient networkClient = new NetworkClient();
      RideRequestService rideRequestService = new RideRequestServiceImpl(profile, networkClient);
      rideRequestService.requestRide();
    }
  }
}