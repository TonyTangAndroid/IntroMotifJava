package intro.di.network;

import intro.di.Profile;

@motif.Scope
public interface RideScope {

    //access method
    RideRequestService rideRequestService();

    //it is equivalent to dagger module.
    @motif.Objects
    abstract class Objects {

        //factory method. ->  abstract factory method.
         NetworkClient networkClient(){
            return new NetworkClient("url");
        }

        //motif factory method. --? dagger module provider.
        static RideRequestService service(Profile profile, NetworkClient networkClient) {
            return new RideRequestServiceImpl(profile, networkClient);
        }

    }
}