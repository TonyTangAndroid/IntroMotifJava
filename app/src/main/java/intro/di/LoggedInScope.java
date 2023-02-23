package intro.di;

import intro.di.network.AuthService;
import intro.di.network.RideRequestService;
import intro.di.network.RideRequestServiceImpl;

@motif.Scope
public interface LoggedInScope {

  RideRequestService rideRequestService();

  @motif.Objects
  abstract class Objects {

    abstract RideRequestService rideRequestService(RideRequestServiceImpl impl);

    abstract RideRequestServiceImpl rideRequestServiceImpl();


  }
}
