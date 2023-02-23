package intro.di;

import androidx.annotation.NonNull;
import intro.di.network.AuthService;
import intro.di.network.AuthServiceImpl;
import intro.di.network.NetworkClient;
import intro.di.network.RideRequestService;
import intro.di.network.RideRequestServiceImpl;

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
    AuthService authService = new AuthComponent().createAuthServiceIfNeeded();
    profile = authService.login("eric.liu@uber.com", "xxxx");
  }



  /**
   * Request a ride.
   */
  void requestRide() {
    if (profile != null) {
      RideRequestService rideRequestService = new AuthComponent().createRideRequestServiceIfNeeded(profile);
      rideRequestService.requestRide();
    }
  }



  /**
   * log the user.
   */
  void logout() {
    AuthService authService =new AuthComponent().createAuthServiceIfNeeded();
    authService.logout("eric.liu@uber.com");
    profile = null;
  }

}