package intro.di;

import intro.di.network.AuthService;
import intro.di.network.AuthServiceImpl;
import intro.di.network.NetworkClient;
import intro.di.network.RideRequestService;
import intro.di.network.RideRequestServiceImpl;

class RootComponent {
  private NetworkClient networkClient;
  private AuthService authService;
  private RideRequestService rideRequestService;

  public RootComponent() {
  }


  private NetworkClient createNetworkClient() {
    if (networkClient == null) {
      networkClient = new NetworkClient();
    }
    return networkClient;
  }

  public RideRequestService getRequestService(Profile profile) {
    if (rideRequestService == null) {

      NetworkClient networkClient = createNetworkClient();
      rideRequestService = new RideRequestServiceImpl(profile, networkClient);
    }
    return rideRequestService;
  }


  public AuthService createAuthService() {
    if (authService == null) {
      NetworkClient networkClient = createNetworkClient();
      authService = new AuthServiceImpl(networkClient);
    }
    return authService;
  }

}