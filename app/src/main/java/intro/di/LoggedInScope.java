package intro.di;

import intro.di.network.NetworkClient;
import intro.di.network.RideRequestService;
import intro.di.network.RideRequestServiceImpl;

@motif.Scope
interface LoggedInScope {

  RideRequestService rideRequestService();


  interface Builder {

    LoggedInScope loggedInScope(Profile profile);
  }

  @motif.Objects
  abstract class Objects {

    public RideRequestService rideRequestService(Profile profile, NetworkClient networkClient) {
      return new RideRequestServiceImpl(profile, networkClient);
    }
  }
}