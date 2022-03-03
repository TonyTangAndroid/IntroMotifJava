package intro.di;

import androidx.annotation.NonNull;
import intro.di.network.AuthService;
import intro.di.network.AuthServiceImpl;
import intro.di.network.NetworkClient;
import intro.di.network.RideRequestService;
import intro.di.network.RideRequestServiceImpl;

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
    AuthService authService = rootComponent.createAuthService();
    profile = authService.login("eric.liu@uber.com", "xxxx");
  }


  /**
   * Request a ride.
   */
  void requestRide() {
    if (profile != null) {
      RideRequestService rideRequestService = rootComponent.getRequestService(profile);
      rideRequestService.requestRide();
    }
  }

  /**
   * log the user.
   */
  void logout() {
    AuthService authService = rootComponent.createAuthService();
    authService.logout("eric.liu@uber.com");
    profile = null;
  }


}