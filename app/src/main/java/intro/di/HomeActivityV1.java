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

  public HomeActivityV1() {
  }

  void onCreate() {

  }

  /**
   * Login the user.
   */
  void login() {
    AuthService authService = createAuthService();
    profile = authService.login("eric.liu@uber.com", "xxxx");
  }

  @NonNull
  private NetworkClient createNetworkClient() {
    if (networkClient==null){
      networkClient = new NetworkClient();
    }
    return networkClient;
  }

  /**
   * Request a ride.
   */
  void requestRide() {
    if (profile != null) {
      NetworkClient networkClient = createNetworkClient();
      RideRequestService rideRequestService = new RideRequestServiceImpl(profile, networkClient);
      rideRequestService.requestRide();
    }
  }


  /**
   * log the user.
   */
  void logout() {
    AuthService authService = createAuthService();
    authService.logout("eric.liu@uber.com");
    profile = null;
  }

  @NonNull
  private AuthService createAuthService() {
    if (authService==null){
      NetworkClient networkClient = createNetworkClient();
      authService = new AuthServiceImpl(networkClient);
    }
    return authService;
  }

}