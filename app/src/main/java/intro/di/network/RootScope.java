package intro.di.network;

import intro.di.Profile;

@motif.Scope
public interface RootScope {

    //access method
    RideRequestService rideRequestService();

    //it is equivalent to dagger module.
    @motif.Objects
    abstract class Objects {

        //factory method. ->  abstract factory method.
        abstract NetworkClient networkClient();

        //motif factory method. --? dagger module provider.
        static RideRequestService service(Profile profile, NetworkClient networkClient) {
            return new RideRequestServiceImpl(profile, networkClient);
        }

    }
}