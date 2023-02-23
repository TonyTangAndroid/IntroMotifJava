package intro.di;

import androidx.annotation.NonNull;
import intro.di.network.AuthService;
import intro.di.network.AuthServiceImpl;
import intro.di.network.NetworkClient;
import intro.di.network.RideRequestService;
import intro.di.network.RideRequestServiceImpl;

public class AuthComponent {

  private NetworkClient networkClient;
  private AuthService authService;
  private RideRequestService rideRequestService;

  //1, a lot of boiler plate code.
  //2, not reusable.
  //3, race condition.
  public AuthService createAuthServiceIfNeeded() {
    if (authService == null) {
      NetworkClient networkClient = createNetworkClientIfNeeded();
      authService = new AuthServiceImpl(networkClient);
    }
    return authService;
  }

  public NetworkClient createNetworkClientIfNeeded() {
    if (networkClient == null) {
      networkClient = new NetworkClient();
    }
    return networkClient;
  }


  @NonNull
  public RideRequestService createRideRequestServiceIfNeeded(Profile profile) {
    if (rideRequestService == null) {
      NetworkClient networkClient = createNetworkClientIfNeeded();
      rideRequestService = new RideRequestServiceImpl(profile, networkClient);
    }
    return rideRequestService;
  }

}
