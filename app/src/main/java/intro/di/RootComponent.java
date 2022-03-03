package intro.di;

import intro.di.network.AuthService;
import intro.di.network.AuthServiceImpl;
import intro.di.network.NetworkClient;
import intro.di.network.RideRequestService;
import intro.di.network.RideRequestServiceImpl;

class RootComponent {

  private NetworkClient networkClient = null;
  private RideRequestService rideRequestService = null;
  private AuthService authService;


  AuthService authService() {
    if (authService == null) {
      NetworkClient networkClient = networkClient();
      authService = new AuthServiceImpl(networkClient);
    }
    return authService;
  }

  RideRequestService rideRequestService(Profile profile) {
    if (rideRequestService == null) {
      NetworkClient networkClient = networkClient();
      rideRequestService = new RideRequestServiceImpl(profile, networkClient);
    }
    return rideRequestService;
  }

  NetworkClient networkClient() {
    if (networkClient == null) {
      networkClient = new NetworkClient();
    }
    return networkClient;
  }
}