package intro.di;

import intro.di.network.NetworkClient;
import intro.di.network.RideRequestService;
import intro.di.network.RideRequestServiceImpl;

@motif.Scope
interface LoggedInScope {

  //Access method. 0
  RideRequestService rideRequestService();


  //Scope Builder pattern
  interface Builder {
    LoggedInScope loggedInScope(Profile profile);
  }

  //Profile

  @motif.Objects
  abstract class Objects {

    public RideRequestService getRequestService(Profile profile, NetworkClient networkClient) {
      return new RideRequestServiceImpl(profile, networkClient);
    }

  }
}