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
    AuthService authService = createAuthServiceIfNeeded();
    profile = authService.login("eric.liu@uber.com", "xxxx");
  }

  //1, a lot of boiler plate code.
  //2, not reusable.
  //3, race condition.
  private AuthService createAuthServiceIfNeeded() {
    if (authService == null) {
      NetworkClient networkClient = createNetworkClientIfNeeded();
      authService = new AuthServiceImpl(networkClient);
    }
    return authService;
  }

  private NetworkClient createNetworkClientIfNeeded() {
    if (networkClient == null) {
      networkClient = new NetworkClient();
    }
    return networkClient;
  }

  /**
   * Request a ride.
   */
  void requestRide() {
    if (profile != null) {
      RideRequestService rideRequestService = createRideRequestServiceIfNeeded();
      rideRequestService.requestRide();
    }
  }

  @NonNull
  private RideRequestService createRideRequestServiceIfNeeded() {
    if (rideRequestService == null) {
      NetworkClient networkClient = createNetworkClientIfNeeded();
      rideRequestService = new RideRequestServiceImpl(profile, networkClient);
    }
    return rideRequestService;
  }


  /**
   * log the user.
   */
  void logout() {
    AuthService authService = createAuthServiceIfNeeded();
    authService.logout("eric.liu@uber.com");
    profile = null;
  }

}